package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1101, "John Smith", 'M', 1990, 4, 20, 0));
        userList.add(new ForumUser(1102, "Jake Dylan", 'M', 1980, 3, 10, 1));
        userList.add(new ForumUser(1103, "Kate Doe", 'F', 1992, 5, 26, 15));
        userList.add(new ForumUser(1104, "Ann Samuel", 'F', 1985, 10, 2, 0));
        userList.add(new ForumUser(1105, "Roger Mare", 'M', 2001, 1, 21, 552));
        userList.add(new ForumUser(1106, "Mark Spencer", 'M', 2001, 1, 19, 19));
        userList.add(new ForumUser(1107, "Gregory Pick", 'M', 2003, 11, 17, 27));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
