package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ExternalApiRestAssuredTest {
    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {
        given().  // [1]
                header("Content-Type", "application/json").
                when().
                get("https://jsonplaceholder.typicode.com/posts/1").  // [2]
                then().
                assertThat().
                statusCode(200).  //  [3]
                body("userId", equalTo(1)).  //  [4]
                body("id", equalTo(1)).
                body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).
                body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")).
                log().all();  // [5]
    }
    @Test
    void testUpdatePostShouldReturnStatus200() {
        Map<String, Object> updatedPost = new HashMap<>();
        updatedPost.put("userId", 1);
        updatedPost.put("id", 1);
        updatedPost.put("title", "Updated title");
        updatedPost.put("body", "Updated body");

        given().
                header("Content-Type", "application/json").
                body(updatedPost).
                when().
                put("https://jsonplaceholder.typicode.com/posts/1").
                then().
                statusCode(200).
                body("userId", equalTo(1)).
                body("id", equalTo(1)).
                body("title", equalTo("Updated title")).
                body("body", equalTo("Updated body")).
                log().all();
    }
}