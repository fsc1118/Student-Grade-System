package Service;

import Dao.Insert_User;
import Dao.SearchID;
import DesignedException.Repeat_id_Exception;
import Util.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AddUser {
    public static void addUser(String ID, String password) throws SQLException {
        ResultSet resultSet = DBUtils.checkExistance(ID);
        if (resultSet.next()) {
            resultSet.close();
            throw new Repeat_id_Exception("This ID has been used");
        }
        Insert_User.Insert_User(ID,password);
        resultSet.close();
    }
}
