package com.kodilla.exception.index;

public class IndexExceptionRunner {

    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();

        if (videoCollector.getCollection().size() > 2) {
            System.out.println(videoCollector.getCollection().get(0));
            System.out.println(videoCollector.getCollection().get(1));
        }
    }
}
