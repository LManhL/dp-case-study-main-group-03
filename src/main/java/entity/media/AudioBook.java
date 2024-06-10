package entity.media;

import java.sql.SQLException;

public class AudioBook extends Media{

    private String author;
    private String format;
    private String language;
    private String accent;
    private int lengthInMinutes;

    // constructors
    public AudioBook() throws SQLException {
    }

    public AudioBook(int id, String title, String category, int price, int quantity, String type, String author, String format, String language, String accent, int lengthInMinutes) throws SQLException {
        super(id, title, category, price, quantity, type);
        this.author = author;
        this.format = format;
        this.language = language;
        this.accent = accent;
        this.lengthInMinutes = lengthInMinutes;
    }

    // getter and setter

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }
}
