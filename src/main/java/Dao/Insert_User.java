package Dao;



import Util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_User {
    public static void Insert_User(String name, String password) throws SQLException {
        Connection connection = DBUtils.getConnection();
        String sql = "insert into student (id,password) values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2,password);
        preparedStatement.execute();
    }
}
