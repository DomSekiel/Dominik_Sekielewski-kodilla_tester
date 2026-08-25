package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    TaskListRepository taskListRepository;

    private static final String LIST_NAME = "TestList";
    private static final String DESCRIPTION = "TestDescription";

    @Test
    void testFindByListName()   {
        //given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //when
        List<TaskList> taskLists = taskListRepository.findByListName(listName);

        //then
        Assertions.assertEquals(1, taskLists.size());

        //cleanUp
        int id =  taskLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}