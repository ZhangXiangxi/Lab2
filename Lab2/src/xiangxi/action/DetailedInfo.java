package xiangxi.action;

import com.opensymphony.xwork2.ActionSupport;
import xiangxi.dao.DatabaseConnection;
import xiangxi.entity.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.Integer;


/**
 * Created by Xiangxi on 2016/10/9.
 */
public class DetailedInfo extends ActionSupport{
    private String ISBN;
    private String Title;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(Integer authorID) {
        AuthorID = authorID;
    }

    private Integer AuthorID;
    private String Publisher;
    private String PublishDate;
    private String Price;
    private String Name;
    private Integer Age;
    private String Country;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String execute() {
        Connection connection = null;
        DatabaseConnection databaseConnection = new DatabaseConnection();
        try {
            connection = databaseConnection.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String query = "select * from book where ISBN = '"+ISBN+"';";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                Title = resultSet.getString(2);
                AuthorID = resultSet.getInt(3);
                Publisher = resultSet.getString(4);
                PublishDate = resultSet.getString(5);
                Price = resultSet.getString(6);
            }
            System.out.println(AuthorID);
            query = "select * from author WHERE AuthorID = '" + Integer.toString(AuthorID) + "';";
            System.out.println(query);
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Name = resultSet.getString(2);
                Age = resultSet.getInt(3);
                Country = resultSet.getString(4);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
