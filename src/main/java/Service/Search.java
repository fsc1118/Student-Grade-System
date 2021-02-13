package Service;

import Dao.SearchID;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {
    public static void search(String ID, String password) throws SQLException {


        SearchID.searchID(ID, password);



    }
}