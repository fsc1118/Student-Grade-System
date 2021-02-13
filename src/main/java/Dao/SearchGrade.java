package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Util.DBUtils.getConnection;

public class SearchGrade {
    public static ResultSet findGrade(String ID) throws SQLException {
        Connection connection = getConnection();
        String sql = "select Subject,Password from User where ID=?";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, ID);
        connection.close();
        return ps.executeQuery();
    }
}
