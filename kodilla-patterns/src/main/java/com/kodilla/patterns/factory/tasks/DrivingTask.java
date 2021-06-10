package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DrivingTask implements Task {

    private final List<Task> executedDrivingTasks = new ArrayList<>();
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Task: " + taskName + " is executing");
        executedDrivingTasks.add(new DrivingTask(taskName, where, using));
        System.out.println("Task: " + taskName + " is executed");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executedDrivingTasks.contains(new DrivingTask(taskName, where, using));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrivingTask that = (DrivingTask) o;
        return Objects.equals(taskName, that.taskName) && Objects.equals(where, that.where) && Objects.equals(using, that.using);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, where, using);
    }
}

