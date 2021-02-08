package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Map<Integer, ForumUser> userMap = new Forum().getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> ChronoUnit.YEARS.between(user.getDateOfBirth(), LocalDate.now()) >= 20)
                .filter(user -> user.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, Function.identity()));

        userMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
