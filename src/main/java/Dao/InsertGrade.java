package Dao;

import Util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

public class InsertGrade {
    public static void InsertGrade(Map<String, Double> grade, String name) throws SQLException {
        Connection conn = DBUtils.getConnection();
        String sql = "insert into grade (name,subject,grade) values(?,?,?) ";
        Set<Map.Entry<String, Double>> entries = grade.entrySet();
        for (Map.Entry entry:entries){
            String subject = (String) entry.getKey();
            double gradeOfSubject = (double) entry.getValue();
            PreparedStatement preparedStatement = conn.prepareStatement("");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,subject);
            preparedStatement.setDouble(3, gradeOfSubject);
            preparedStatement.execute();
            preparedStatement.close();
        }
        conn.close();

    }
}
