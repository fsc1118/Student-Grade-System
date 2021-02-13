package Service;
import Dao.SearchGrade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class View_Grade {
    public static Map<String, Double> findGrade(String ID) throws SQLException {
        ResultSet rs = SearchGrade.findGrade(ID);
        Map<String, Double> map = new HashMap<>();
        while (rs.next()){
            map.put(rs.getString("Subject"),rs.getDouble("Grade"));
        }
        return map;
    }
}
