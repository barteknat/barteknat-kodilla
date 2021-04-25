package com.kodilla.patterns.factory.tasks;

public class DrivingTaskDTO {

    private static String taskName;
    private static String where;
    private static String using;

    public void setTaskParameters(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}

