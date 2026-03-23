package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class DbManager {

    private static DbManager dbManagerInstance;

    private DbManager() {

    }

    public static synchronized DbManager getInstance() {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

        public Connection getConnection() throws SQLException {

            Properties connectionProps = new Properties();
            connectionProps.put("user", "kodilla");
            connectionProps.put("password", "kodilla");

            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kodilla_tester?serverTimezone=Europe/Warsaw&useSSL=False",
                    connectionProps
            );
        }
    }