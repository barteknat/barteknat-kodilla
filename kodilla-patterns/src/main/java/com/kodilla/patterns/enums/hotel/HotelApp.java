package com.kodilla.patterns.enums.hotel;

public class HotelApp {

    public static void main(String[] args) {
        System.out.println("single bed rooms");
        System.out.println("1. low season: " + Season.LOW.getSingleRoomPrice());
        System.out.println("1. low season: " + Season.HIGH.getSingleRoomPrice());
        System.out.println("1. low season: " + Season.HOLIDAY.getSingleRoomPrice());
        System.out.println("double bed rooms");
        System.out.println("1. low season: " + Season.LOW.getDoubleRoomPrice());
        System.out.println("1. low season: " + Season.HIGH.getDoubleRoomPrice());
        System.out.println("1. low season: " + Season.HOLIDAY.getDoubleRoomPrice());

        Season season = Season.HOLIDAY;
        System.out.println(season);



    }
}
