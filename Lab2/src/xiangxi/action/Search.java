package xiangxi.action;

import com.opensymphony.xwork2.ActionSupport;
import xiangxi.dao.DatabaseConnection;
import xiangxi.entity.Book;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Xiangxi on 2016/10/9.
 */
public class Search extends ActionSupport{
    private String authorName;
    private ArrayList<Book> searchResults;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public ArrayList<Book> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(ArrayList<Book> searchResults) {
        this.searchResults = searchResults;
    }
    public String execute() {
        searchByAuthorName();
        return SUCCESS;
    }
    private void searchByAuthorName() {
        Connection connection = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        try {
            connection = databaseConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String query = "select * from book where AuthorID in (select AuthorID from author where Name = '"+authorName+"');";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            this.searchResults = new ArrayList<>();
            while(resultSet.next()) {
                String ISBN = resultSet.getString(1);
                String Title = resultSet.getString(2);
                Integer AuthorID = resultSet.getInt(3);
                String Publisher = resultSet.getString(4);
                String PublishDate = resultSet.getString(5);
                String Price = resultSet.getString(6);
                searchResults.add(new Book(ISBN, Title, AuthorID, Publisher, PublishDate, Price));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
