package xiangxi.entity;

/**
 * Created by Xiangxi on 2016/10/9.
 */
public class Book {
    private String ISBN;
    private String title;
    private Integer authorID;
    private String publisher;
    private String publishDate;
    private String price;
    public Book() {
        // 无参构造函数
    }
    public Book(String ISBN, String title, Integer authorID, String publisher, String publishDate, String price) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorID = authorID;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
