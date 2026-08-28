package com.kodilla.stream;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTest {

    @Test
    public void testGetUserName() {
        // Given
        List<String> expected = List.of("Walter White", "Gale Boetiticher");

        // When
        List<String> result = UsersManager.filterChemistGroupUsernames();

        // Then
        assertEquals(expected, result);
    }

    @Test
    void testGetUsersOlderThan() {
        // When
        List<User> result = UsersManager.getUsersOlderThan(45);

        // Then
        assertNotNull(result);

        for (User user : result) {
            assertTrue(user.getAge() > 45, "User " + user.getUsername() + " nie spelnia kryterium");
        }
    }

    @Test
    void testGetMostActiveUsers() {
        // When
        List<User> rersult = UsersManager.getMostActiveUsers(50);

        // Then
        assertNotNull(rersult);

        for (User user : rersult) {
            assertTrue(user.getNumberOfPosts() > 50, "User " + user.getUsername() + " nie spelnia kryterium");
        }
    }

    @Test
    void shouldReturnUserName() {
        // Given
        User user = UsersRepository.getUserList().get(0);

        // When
        String username = UsersManager.getUserName(user);

        // Then
        assertEquals("Walter White", username);
    }
}