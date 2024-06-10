package dao.media.creator;

import entity.db.AIMSDB;
import entity.media.AudioBook;
import entity.media.Media;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AudioBookCreator extends MediaCreator{
    public AudioBookCreator() {
    }
    @Override
    public Media create(Media media) throws SQLException {
        if (media.getType() != "AudioBook") {
            return null;
        }
        String sql = "SELECT * FROM " +
                "aims.AudioBook" +
                "WHERE Media.id = " + media.getId() + ";";
        Statement statement = AIMSDB.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            String author = resultSet.getString("author");
            String format = resultSet.getString("format");
            String language = resultSet.getString("language");
            String accent = resultSet.getString("accent");
            int lengthInMinutes = resultSet.getInt("lengthInMinutes");

            return new AudioBook(media.getId(), media.getTitle(), media.getCategory(), media.getPrice(), media.getQuantity(), media.getType(), author, format, language, accent, lengthInMinutes);
        } else {
            throw new SQLException();
        }
    }
}
