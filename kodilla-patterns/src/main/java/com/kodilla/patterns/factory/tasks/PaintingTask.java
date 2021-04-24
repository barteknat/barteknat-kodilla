package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PaintingTask implements Task {

    private final List<Task> executedPaintingTasks = new ArrayList<>();
    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Task: " + taskName + " is executing");
        executedPaintingTasks.add(new PaintingTask(taskName, color, whatToPaint));
        System.out.println("Task: " + taskName + " is executed");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executedPaintingTasks.contains(new PaintingTask(taskName, color, whatToPaint));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaintingTask that = (PaintingTask) o;
        return Objects.equals(executedPaintingTasks, that.executedPaintingTasks) && Objects.equals(taskName, that.taskName) && Objects.equals(color, that.color) && Objects.equals(whatToPaint, that.whatToPaint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executedPaintingTasks, taskName, color, whatToPaint);
    }
}

