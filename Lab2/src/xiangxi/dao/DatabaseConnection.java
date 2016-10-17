package xiangxi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

/**
 * Created by Xiangxi on 2016/10/9.
 */
public class DatabaseConnection {
    private static Connection connection;
    public static Connection getConnection() throws SQLException{
        try {
            String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_libuzi";
            String username = "mjmm0jlx0n";
            String password = "j24yjhjxi512w2xh5j5yj1hy0h5w40y1hw3klilz";
            Driver foo = new Driver();
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the database");
        } catch (Exception e) {
            System.out.println("Failed to connect the database");
            e.printStackTrace();
        }
        return connection;
    }
}

//String url = "jdbc:mysql://localhost:3306/bookdb";
//String username = "root";
//String password = "16889999";