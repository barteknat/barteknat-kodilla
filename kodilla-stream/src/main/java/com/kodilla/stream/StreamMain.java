package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Map<Integer, ForumUser> userMap = new Forum().getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBirth().isBefore(LocalDate.ofYearDay(2001,20)))
                .filter(user -> user.getPosts() >= 1)
                .collect(Collectors.toMap(user -> user.getId(), user -> user));

        userMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
