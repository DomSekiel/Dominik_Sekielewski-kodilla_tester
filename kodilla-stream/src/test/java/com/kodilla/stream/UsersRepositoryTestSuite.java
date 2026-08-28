package com.kodilla.stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UsersRepositoryTestSuite {
    @Test
    void shouldReturnUsers() {
        // Given
        int expectedSize = 6;

        // When
        List<User> users = UsersRepository.getUserList();

        // Then
        assertEquals(expectedSize, users.size());
    }

    @Test
    void shouldReturnUserData() {
        // Given
        List<User> users = UsersRepository.getUserList();

        // When
        User user = users.get(0);

        // Then
        assertEquals("Walter White", user.getUsername());
        assertEquals(50, user.getAge());
        assertEquals(7, user.getNumberOfPosts());
        assertEquals("Chemists", user.getGroup());
    }
}