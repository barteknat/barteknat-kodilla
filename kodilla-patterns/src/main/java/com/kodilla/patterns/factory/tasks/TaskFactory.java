package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    private TaskDTO taskDTO;

    public TaskFactory(TaskDTO taskDTO) {
        this.taskDTO = taskDTO;
    }

    public Task makeTask(TaskType taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask(taskDTO.getTaskName(), taskDTO.getTaskDetails1(), (Double) taskDTO.getTaskDetails2());
            case PAINTING:
                return new PaintingTask(taskDTO.getTaskName(), taskDTO.getTaskDetails1(), (String) taskDTO.getTaskDetails2());
            case DRIVING:
                return new DrivingTask(taskDTO.getTaskName(), taskDTO.getTaskDetails1(), (String) taskDTO.getTaskDetails2());
            default:
                throw new IllegalStateException("Making task [" + taskType + "] is not possible.");
        }
    }
}

