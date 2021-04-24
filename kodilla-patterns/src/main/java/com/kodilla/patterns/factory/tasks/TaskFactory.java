package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(String task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("Bedroom Equipment", "bed", 1);
            case PAINTING:
                return new PaintingTask("Operation Renovation", "green", "fence");
            case DRIVING:
                return new DrivingTask("Holidays Holidays", "Sosnowiec", "tank");
            default:
                return null;
        }
    }
}