package com.kodilla.patterns.factory.tasks;

public class PaintingTaskDTO {

    private static String taskName;
    private static String color;
    private static String whatToPaint;

    public void setTaskParameters(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}

