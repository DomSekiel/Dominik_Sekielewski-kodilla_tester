package com.kodilla.rest.controller;


import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(BookController.class)                   // [1]
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;                         // [2]

    @MockBean
    private BookService bookService;                 // [3]

    @Test
    void shouldFetchBooks() throws Exception {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1", "author 1"));
        booksList.add(new BookDto("title 2", "author 2"));
        when(bookService.getBooks()).thenReturn(booksList);

        //when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books")                // [1]
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())               // [2]
                .andExpect(jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    void shouldAddBook() throws Exception {
        //given
        BookDto bookDto = new BookDto("title 1", "author 1");
        Gson gson = new Gson();
        String bookJson = gson.toJson(bookDto);

        //when & then
        mockMvc.perform(post("/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(bookJson))
                .andExpect(status().isCreated());
    }

    @Test
    void shouldAddBookAndCheckBooksCount() throws Exception {
        // given
        BookDto bookDto1 = new BookDto("Title 1", "Author 1");
        BookDto bookDto2 = new BookDto("Title 2", "Author 2");
        Gson gson = new Gson();
        String bookJson1 = gson.toJson(bookDto1);
        String bookJson2 = gson.toJson(bookDto2);

        when(bookService.getBooks()).thenReturn(new ArrayList<>());

        //  when & then
        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(bookJson1))
                .andExpect(status().isCreated());

        when(bookService.getBooks()).thenReturn(java.util.Arrays.asList(bookDto1));

        mockMvc.perform(MockMvcRequestBuilders.get("/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", org.hamcrest.Matchers.hasSize(1)))
                .andExpect(jsonPath("$[0].title", equalTo("Title 1")))
                .andExpect(jsonPath("$[0].author", equalTo("Author 1")));

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(bookJson2))
                .andExpect(status().isCreated());

        when(bookService.getBooks()).thenReturn(java.util.Arrays.asList(bookDto1, bookDto2));

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/books"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", org.hamcrest.Matchers.hasSize(2)))
                .andExpect(jsonPath("$[1].title", equalTo("Title 2")))
                .andExpect(jsonPath("$[1].author", equalTo("Author 2")));
    }
}