//package com.kodilla.hibernate.tasklist.dao;
//
//import com.kodilla.hibernate.tasklist.TaskList;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//public class TaskListDaoTestSuite {
//
//    @Autowired
//    private TaskListDao taskListDao;
//
//    @Test
//    void testFindByListName() {
//        //Given
//        TaskList taskList = new TaskList("New Task List", "Description of New Task List");
//        taskListDao.save(taskList);
//        String listName = taskList.getListName();
//        //When
//        List<TaskList> readTaskList = taskListDao.findByListName(listName);
//        //Then
//        assertEquals(1, readTaskList.size());
//        //CleanUp
//        int id = readTaskList.get(0).getId();
//        taskListDao.deleteById(id);
//    }
//}
//
