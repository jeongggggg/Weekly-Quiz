package week_04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLJDBCTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String username = "root";
        String password = "0898";

        Connection connection = null;

        try {
            // 드라이버 수동 로드를 제거합니다.
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("연결이 성공");
        } catch (SQLException e) {
            e.printStackTrace(); // SQL 예외 발생 시 스택 트레이스를 출력
        }
        // 연결을 닫는 부분
        finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("연결이 닫힘");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
