package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
    void testEmptyList() {
        //given
        List<User> users = List.of();

        // when
        double above = ForumStats.averagePostsAboveOrEqual40(users);
        double below = ForumStats.averagePostsBelow40(users);

        // then
        assertEquals(0, above,0.01);
        assertEquals(0, below,0.01);
    }

    @Test
    void shouldCalculateAverageForBothGroups() {
        // given
        List<User> users = List.of(
                new User("Walter White", 50, 7, "Chemists"),
                new User("Gus Firling", 49, 0, "Board"),
                new User("Tuco Salamanca", 34, 116, "Manager"),
                new User ("Jessie Pinkman", 25, 4648, "Sales")
        );

        // when
        double above = ForumStats.averagePostsAboveOrEqual40(users);
        double below = ForumStats.averagePostsBelow40(users);

        // then
        assertEquals(3.5, above,0.01);
        assertEquals(2382,below,0.01);
    }

    @Test
    void shouldReturnZeroWhenNoUsersBelow40() {
        // given
        List<User> users = List.of(
                new User("Gus Firling", 49, 0, "Board"),
                new User("Gale Boetiticher", 44, 2, "Chemists")
        );

        // when
        double result = ForumStats.averagePostsBelow40(users);

        // then
        assertEquals(0, result, 0.01);
    }

    @Test
    void shouldIncludeUserWithAgeExactly40() {
        // given
        List<User> users = List.of(
                new User("John Doe", 40, 101, "Manager")
        );

        // when
        double result = ForumStats.averagePostsAboveOrEqual40(users);

        // then
        assertEquals(101, result, 0.01);
    }

    @Test
    void shouldReturnPostsForSingleUser() {
        // given
        List<User> users = List.of(
                new User("Jessie Pinkman", 25, 4648, "Sales")
        );

        // when
        double result = ForumStats.averagePostsBelow40(users);

        // then
        assertEquals(4648, result,0.01);
    }
}