package com.kodilla.patterns.factory.tasks;

public class ShoppingTaskDTO {

    private static String taskName;
    private static String whatToBuy;
    private static double quantity;

    public void setTaskParameters(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
}

