package com.kodilla.stream.portfolio;

import java.util.Objects;

public final class User {

    private final String username;
    private final String realName;

    public User(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
