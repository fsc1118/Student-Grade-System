package Util;

import java.sql.*;
import java.util.Map;

public class DBUtils {
    private static final String id = "root";
    public static final String password = "";
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?serverTimezone=UTC", id, password);
            System.out.println("Successfully connect to database");
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static ResultSet checkExistance(String ID) throws SQLException {
        Connection connection = getConnection();
        String sql = "select Password from student where ID=?";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, ID);
        return ps.executeQuery();

    }

    public static void main(String[] args) {
        getConnection();
    }
}
