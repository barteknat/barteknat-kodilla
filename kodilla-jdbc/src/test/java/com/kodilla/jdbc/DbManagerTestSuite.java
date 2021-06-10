//package com.kodilla.jdbc;
//
//import org.junit.jupiter.api.Test;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class DbManagerTestSuite {
//
//    @Test
//    void testConnect() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//        //When & Then
//        assertNotNull(dbManager.getConnection());
//    }
//
//    @Test
//    void testSelectUsers() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery("SELECT * FROM USERS");
//        //When
//        int counter = 0;
//        while (rs.next()) {
//            System.out.println(rs.getInt("ID") + ", " +
//                    rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        //Then
//        assertEquals(5, counter);
//    }
//
//    @Test
//    void testSelectUsersAndPosts() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(
//                "SELECT U.FIRSTNAME, U.LASTNAME" +
//                        " FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID" +
//                        " GROUP BY P.USER_ID" +
//                        " HAVING COUNT(*) >= 2");
//        //When
//        int counter = 0;
//        while (rs.next()) {
//            System.out.println(
//                    rs.getString("FIRSTNAME") + " " +
//                            rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        //Then
//        assertEquals(2, counter);
//    }
//}
