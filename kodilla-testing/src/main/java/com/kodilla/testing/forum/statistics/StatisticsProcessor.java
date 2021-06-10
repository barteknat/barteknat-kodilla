package com.kodilla.testing.forum.statistics;

public class StatisticsProcessor {

    private int users;
    private int posts;
    private int comments;
    private double postsOnUserAverage;
    private double commentsOnUserAverage;
    private double commentsOnPostAverage;

    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        if (users != 0) {
            postsOnUserAverage = (double) posts / users;
            commentsOnUserAverage = (double) comments / users;
        }
        if (posts != 0) {
            commentsOnPostAverage = (double) comments / posts;
        }
    }

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsOnUserAverage() {
        return postsOnUserAverage;
    }

    public double getCommentsOnUserAverage() {
        return commentsOnUserAverage;
    }

    public double getCommentsOnPostAverage() {
        return commentsOnPostAverage;
    }

    public String showStatistics() {
        return  "users=" + users +
                ", posts=" + posts +
                ", comments=" + comments +
                ", postsOnUserAverage=" + postsOnUserAverage +
                ", commentsOnUserAverage=" + commentsOnUserAverage +
                ", commentsOnPostAverage=" + commentsOnPostAverage;
    }
}
