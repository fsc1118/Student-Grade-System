package Dao;

import DesignedException.ID_NotFoundException;
import DesignedException.WrongPasswordException;
import Util.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchID {
    public static void searchID(String id, String password) throws SQLException {
        ResultSet resultSet = DBUtils.checkExistance(id);
        if (resultSet.next()){
            String password1 = resultSet.getString("Password");
            //System.out.println(password1);
            if (!password1.equals(password)){
                throw new WrongPasswordException("Wrong Password!");
            }
        } else{
            throw new ID_NotFoundException("This ID does not exist!");
        }

    }

}
