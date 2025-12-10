import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTest {

    @Test
    public void testGetUserName() {

        List<String> result = UsersManager.filterChemistGroupUsernames();
        List<String> expected = List.of("Walter White", "Gale Boetiticher");

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testGetUsersOlderThan() {
        List<User> result = UsersManager.getUsersOlderThan(45);

        Assertions.assertNotNull(result);

        for (User user : result) {
            assertTrue(user.getAge() > 45, "User " + user.getUsername() + " nie spelnia kryterium");
        }
    }

    @Test
    void testGetMostActiveUsers() {
        List<User> rersult = UsersManager.getMostActiveUsers(50);

        Assertions.assertNotNull(rersult);

        for (User user : rersult) {
            assertTrue(user.getNumberOfPosts() > 50, "User " + user.getUsername() + " nie spelnia kryterium");
        }
    }
}