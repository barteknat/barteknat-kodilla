package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    private final ShoppingTaskDTO shoppingTaskDTO;
    private final PaintingTaskDTO paintingTaskDTO;
    private final DrivingTaskDTO drivingTaskDTO;

    public TaskFactory(ShoppingTaskDTO shoppingTaskDTO, PaintingTaskDTO paintingTaskDTO, DrivingTaskDTO drivingTaskDTO) {
        this.shoppingTaskDTO = new ShoppingTaskDTO();
        this.paintingTaskDTO = new PaintingTaskDTO();
        this.drivingTaskDTO = new DrivingTaskDTO();
    }

    public Task makeTask(Tasks task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask(shoppingTaskDTO.getTaskName(), shoppingTaskDTO.getWhatToBuy(), shoppingTaskDTO.getQuantity());
            case PAINTING:
                return new PaintingTask(paintingTaskDTO.getTaskName(), paintingTaskDTO.getColor(), paintingTaskDTO.getWhatToPaint());
            case DRIVING:
                return new DrivingTask(drivingTaskDTO.getTaskName(), drivingTaskDTO.getWhere(), drivingTaskDTO.getUsing());
            default:
                throw new IllegalStateException("Making task [" + task + "] is not possible.");
        }
    }
}

