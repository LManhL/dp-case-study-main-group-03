package dao.media.creator;

import entity.db.AIMSDB;
import entity.media.Book;
import entity.media.Media;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookCreator extends MediaCreator{
    public BookCreator() {
    }

    @Override
    public Media create(Media media) throws SQLException {
        if (media.getType() != "Book") {
            return null;
        }
        String sql = "SELECT * FROM " +
                "aims.Book" +
                "WHERE Media.id = " + media.getId() + ";";
        Statement statement = AIMSDB.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            String author = resultSet.getString("author");
            String coverType = resultSet.getString("coverType");
            String publisher = resultSet.getString("publisher");
            Date publishDate = resultSet.getDate("publishDate");
            int numOfPages = resultSet.getInt("numOfPages");
            String language = resultSet.getString("language");
            String bookCategory = resultSet.getString("bookCategory");

            return new Book(media.getId(), media.getTitle(), media.getCategory(), media.getPrice(), media.getQuantity(), media.getType(), author, coverType, publisher, publishDate, numOfPages, language, bookCategory);
        } else {
            throw new SQLException();
        }
    }
}
