package com.kodilla.patterns.factory.tasks;

public class TaskDTO {

    String taskName;
    String taskDetails1;
    Object taskDetails2;

    public TaskDTO(String taskName, String taskDetails1, Object taskDetails2) {
        this.taskName = taskName;
        this.taskDetails1 = taskDetails1;
        this.taskDetails2 = taskDetails2;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDetails1() {
        return taskDetails1;
    }

    public Object getTaskDetails2() {
        return taskDetails2;
    }
}
