package Seminar1.task3;

public class Book {
    private String title;
    private String author;
    private Boolean available;

    public Book() {
    }

    public Book(String title, String author, Boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void displayInfo() {
        System.out.println(String.format("книга: %s,  автор: %s,  доступность: %b", getTitle(), getAuthor(), getAvailable()));
    }
}
