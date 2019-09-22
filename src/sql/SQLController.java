package sql;

import java.sql.*;

public class SQLController {
    public boolean connection(String host, String root, String password){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost", root, password);
        } catch (SQLException e) {
            System.out.println("Error db connection: " + e);
            e.printStackTrace();
        }
        return false;
    }
}
