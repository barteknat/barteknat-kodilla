package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {

    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(int id, String name, char sex, int year, int monthValue, int dayOfMonth, int posts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(year, monthValue, dayOfMonth);
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id && sex == forumUser.sex && posts == forumUser.posts && Objects.equals(name, forumUser.name) && Objects.equals(dateOfBirth, forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, dateOfBirth, posts);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }
}
