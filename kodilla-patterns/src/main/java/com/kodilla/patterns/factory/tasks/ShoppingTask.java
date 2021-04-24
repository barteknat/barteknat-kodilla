package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingTask implements Task {

    private final List<Task> executedShoppingTasks = new ArrayList<>();
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Task: " + taskName + " is executing");
        executedShoppingTasks.add(new ShoppingTask(taskName, whatToBuy, quantity));
        System.out.println("Task: " + taskName + " is executed");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executedShoppingTasks.contains(new ShoppingTask(taskName, whatToBuy, quantity));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingTask that = (ShoppingTask) o;
        return Double.compare(that.quantity, quantity) == 0 && Objects.equals(taskName, that.taskName) && Objects.equals(whatToBuy, that.whatToBuy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, whatToBuy, quantity);
    }
}

