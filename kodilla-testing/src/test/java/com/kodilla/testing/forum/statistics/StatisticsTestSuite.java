package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statistics;

    private List<String> generateListOfUsers(int numberOfUsers) {
        List<String> users = new ArrayList<>();
        for (int i = 1; i <= numberOfUsers; i++) {
            users.add("User" + i);
        }
        return users;
    }

    @Test
    void testCalculateAdvStatisticsAveragesForPosts0() {
        //Given
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(10));

        //When
        statisticsProcessor.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, statisticsProcessor.getPostsOnUserAverage());
        assertEquals(0, statisticsProcessor.getCommentsOnPostAverage());
    }

    @Test
    public void testCalculateAdvStatisticsForPosts1000() {
        //Given
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(5020);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(10));

        //When
        statisticsProcessor.calculateAdvStatistics(statistics);

        //Then
        assertEquals(100, statisticsProcessor.getPostsOnUserAverage());
        assertEquals(5.02, statisticsProcessor.getCommentsOnPostAverage());
    }

    @Test
    public void testCalculateAdvStatisticsForComments0() {
        //Given
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(10));

        //When
        statisticsProcessor.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, statisticsProcessor.getCommentsOnUserAverage());
        assertEquals(0, statisticsProcessor.getCommentsOnPostAverage());
    }

    @Test
    public void testCalculateAdvStatisticsForCommentsLessThanPosts() {
        //Given
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);

        //When
        statisticsProcessor.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0.5, statisticsProcessor.getCommentsOnPostAverage());
    }

    @Test
    public void testCalculateAdvStatisticsForCommentsMoreThanPosts() {
        //Given
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statistics.postsCount()).thenReturn(500);
        when(statistics.commentsCount()).thenReturn(1000);

        //When
        statisticsProcessor.calculateAdvStatistics(statistics);

        //Then
        assertEquals(2, statisticsProcessor.getCommentsOnPostAverage());
    }

    @Test
    public void testCalculateAdvStatisticsForUsers0() {
        //Given
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(0));

        //When
        statisticsProcessor.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, statisticsProcessor.getPostsOnUserAverage());
        assertEquals(0, statisticsProcessor.getCommentsOnUserAverage());
    }

    @Test
    public void testCalculateAdvStatisticsForUsers100() {
        //Given
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statistics.postsCount()).thenReturn(5000);
        when(statistics.commentsCount()).thenReturn(150230);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(100));

        //When
        statisticsProcessor.calculateAdvStatistics(statistics);

        //Then
        assertEquals(50, statisticsProcessor.getPostsOnUserAverage());
        assertEquals(1502.3, statisticsProcessor.getCommentsOnUserAverage());
    }

    @Test
    public void testShowStatistics() {
        //Given
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor();
        when(statistics.postsCount()).thenReturn(5000);
        when(statistics.commentsCount()).thenReturn(150230);
        when(statistics.usersNames()).thenReturn(generateListOfUsers(100));

        //When
        statisticsProcessor.calculateAdvStatistics(statistics);
        String expectedStatistics = "users=100, posts=5000, comments=150230, " +
                "postsOnUserAverage=50.0, commentsOnUserAverage=1502.3, commentsOnPostAverage=30.046";

        //Then
        assertEquals(expectedStatistics, statisticsProcessor.showStatistics());
    }
}
