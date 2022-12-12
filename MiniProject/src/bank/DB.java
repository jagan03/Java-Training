package bank;

import java.sql.*;

public class DB {      //creating class DB
    static final String user = "root";
    static final String pass = "november3jagan";
    public static Connection getConnection() throws Exception {     //method for getting sql connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Customer",user,pass);
        return c;
    }
}
