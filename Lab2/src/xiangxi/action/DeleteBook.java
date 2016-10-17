package xiangxi.action;

import com.opensymphony.xwork2.ActionSupport;
import xiangxi.dao.DatabaseConnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Xiangxi on 2016/10/9.
 */
public class DeleteBook extends ActionSupport{
    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String execute() {
        Connection connection = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        try {
            connection = databaseConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String deletion = "DELETE FROM book WHERE ISBN = '" + ISBN + "';";
        try {
            Statement statement = connection.createStatement();

            statement.execute(deletion);
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
