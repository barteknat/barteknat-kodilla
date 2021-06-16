package com.kodilla.patterns2.observer.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mentor implements HomeworkObserver {

    private final static Logger LOGGER = LoggerFactory.getLogger(HomeworkObserver.class);
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update() {
        updateCount++;
    }

    @Override
    public void getDetails(Homework homework) {
        if (homework.getTasks().size() == 1) {
            LOGGER.info(username + ": New task in homework of " + homework.getName() + "\n" +
                    " (total: " + homework.getTasks().size() + " task)");
        } else {
            LOGGER.info(username + ": New task in homework of " + homework.getName() + "\n" +
                    " (total: " + homework.getTasks().size() + " tasks)");
        }
    }
}
