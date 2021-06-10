package com.kodilla.good.patterns.challenge2.model;

import java.util.Objects;

public class User {

    final String userName;
    final String userSurname;
    private final String userAddress;

    public User(String userName, String userSurname, String userAddress) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(userSurname, user.userSurname) && Objects.equals(userAddress, user.userAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userSurname, userAddress);
    }
}

