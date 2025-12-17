package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;
import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ForumStatsTest {

    @Test
    void NonEmptyUserList() {
        List<User> users = UsersRepository.getUserList();
        assertFalse(users.isEmpty());
    }

    @Test
    void AveragePostsAboveOrEqual40() {
        // given
        List<User> users = UsersRepository.getUserList();

        // when
        double averagePostsAboveOrEqual40 = users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0);

        // then
        assertEquals(2.25, averagePostsAboveOrEqual40);
    }

    @Test
    void AveragePostsBelow40() {
        // given
        List<User> users = UsersRepository.getUserList();

        // when
        double averagePostsBelow40 = users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .orElse(0);

        // then
        assertEquals(2382.0, averagePostsBelow40);
    }
}