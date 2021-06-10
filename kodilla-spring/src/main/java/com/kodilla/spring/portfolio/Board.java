package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void setToDoList(List<String> toDo) {
        toDoList.tasks = toDo;
    }

    public void setInProgressList(List<String> inProgress) {
        inProgressList.tasks = inProgress;
    }

    public void setDoneList(List<String> done) {
        doneList.tasks = done;
    }
}

