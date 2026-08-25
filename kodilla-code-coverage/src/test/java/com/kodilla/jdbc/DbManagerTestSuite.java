package com.kodilla.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.sql.SQLException;
import java.util.AbstractMap;
import java.util.List;


class DbManagerTestSuite {

    private static DbManager dbManager;

    @BeforeAll
    public static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
    }

    @Test
    void testConnect()  throws SQLException {
        //Given
        //When
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);
        insertUsers(statement);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getResultsCount(rs);
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    private Statement createStatement() throws SQLException {
        return dbManager.getConnection().createStatement();
    }

    private static final List<AbstractMap.SimpleEntry<String, String>> USERS = List.of(
            new AbstractMap.SimpleEntry<>("Zara", "Ali"),
            new AbstractMap.SimpleEntry<>("Otman", "Use"),
            new AbstractMap.SimpleEntry<>("Mark", "Boq"),
            new AbstractMap.SimpleEntry<>("Uli", "Wimer"),
            new AbstractMap.SimpleEntry<>("Oli", "Kosiw")
    );

    private void insertUsers(Statement statement) throws SQLException {
        for (AbstractMap.SimpleEntry<String, String> user : USERS) {
            statement.executeUpdate(
                    String.format("INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('%s', '%s')",
                            user.getKey(),
                            user.getValue()

                    )
            );
        }
    }

    private int insertUserWithPosts (Statement statement) throws SQLException {

        statement.executeUpdate(
                "INSERT INTO USERS (FIRSTNAME, LASTNAME) " +
                        "VALUES ('Test', 'User')"
        );

        int userID = 0;

        try (ResultSet rs = statement.executeQuery("SELECT LAST_INSERT_ID() AS ID")) {

            if (rs.next()) {
                userID = rs.getInt("ID");
            }

            statement.executeUpdate(
                    "INSERT INTO POSTS(USER_ID, BODY) " +
                            "VALUES (" + userID + ", 'First post')");

            statement.executeUpdate(
                    "INSERT INTO POSTS(USER_ID, BODY) " +
                            "VALUES (" + userID + ", 'Second post')");

            return userID;
        }
    }

    private static int getResultsCount(ResultSet rs) throws SQLException {
        int counter = 0;
        while(rs.next()) {
            System.out.printf("%d, %s, %s%n",
                    rs.getInt("ID"),
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));
            counter++;
        }
        return counter;
    }

    private static int getUsersAndPostsCount(ResultSet rs) throws SQLException {
        int counter = 0;

        while (rs.next()) {
            System.out.printf("%s, %s%n",
                    rs.getString("FIRSTNAME"),
                    rs.getString("LASTNAME"));

            counter++;
        }

        return counter;
    }

    private static int getRowsCount(ResultSet rs) throws SQLException {
        int count = 0;

        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        return count;
    }

    private void deleteTestUserAndPosts(
            Statement statement,
            int userID
    ) throws SQLException {

        statement.executeUpdate(
                "DELETE FROM POSTS WHERE USER_ID = " + userID
        );

        statement.executeUpdate(
                "DELETE FROM USERS WHERE ID = " + userID
        );
    }

//    @Test
//    void testSelectUsers() throws SQLException {
//        //Given
//        //When
//        String sqlQuery = "SELECT * FROM USERS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//
//        //Then
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getInt("ID") + ", " +
//                    rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        Assertions.assertEquals(5, counter);
//    }

    @Test
    void testGetConnection() throws SQLException { // dodaj throws SQLException

        DbManager dbManager = DbManager.getInstance();

        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        String countQuery =
                "SELECT COUNT(*) FROM (" +
                        "SELECT U.ID " +
                        "FROM USERS U " +
                        "JOIN POSTS P ON U.ID = P.USER_ID " +
                        "GROUP BY U.ID " +
                        "HAVING COUNT(P.ID) >= 2" +
                        ") AS USERS_WITH_POSTS";

        Statement statement = createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = getRowsCount(rs);

        int userID = insertUserWithPosts(statement);

        //When
        String sqlQuery =
                "SELECT U.FIRSTNAME, U.LASTNAME " +
                        "FROM USERS U " +
                        "JOIN POSTS P ON U.ID = P.USER_ID " +
                        "GROUP BY U.ID, U.FIRSTNAME, U.LASTNAME " +
                        "HAVING COUNT(P.ID) >= 2";

        statement = createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = getUsersAndPostsCount(rs);
        int expected = count +1;

        Assertions.assertEquals(expected, counter);

        rs.close();

        deleteTestUserAndPosts(statement, userID);

        statement.close();
    }
}