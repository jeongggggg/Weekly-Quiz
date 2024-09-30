package week_04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.mysql.cj.conf.PropertyKey.logger;

public class MySQLJDBCTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String username = "root";
        String password = "0898";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("연결이 성공");
            String sql = "SELECT name, age, address FROM students WHERE age BETWEEN 30 AND 39";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");

                System.out.printf("이름: %s, 나이: %d, 주소: %s%n", name, age, address);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace(); // 예외 메시지 그대로 출력하는 메소드 (사용 X, 로깅 권장)
            // logger.error(""); // 서버 로그를 파일로 남길 수 있는 '로거'(slf4j, log4j, ...)
            // System.out.println(e.getErrorCode()); // 단점들 때문에 실무에서 사용핮 않음
            // System.out.println(e.getMessage()); // 단점들 때문에 실무에서 사용핮 않음
        } finally {
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
