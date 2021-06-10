package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public final class Task {

    private final String title;
    private final String description;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadLine;

    public Task(String title, String description, User assignedUser, User creator, LocalDate created, LocalDate deadLine) {
        this.title = title;
        this.description = description;
        this.assignedUser = assignedUser;
        this.creator = creator;
        this.created = created;
        this.deadLine = deadLine;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignedUser=" + assignedUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadLine=" + deadLine +
                '}';
    }
}
