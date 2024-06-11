package dao.media.creator;

import entity.db.AIMSDB;
import entity.media.CD;
import entity.media.DVD;
import entity.media.Media;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class CDCreator extends MediaCreator{
    public CDCreator() {
    }

    @Override
    public Media create(Media media) throws SQLException {
        if (!Objects.equals(media.getType(), "CD")) {
            return null;
        }
        String sql = "SELECT * FROM " +
                "aims.CD" +
                "WHERE Media.id = " + media.getId() + ";";
        Statement statement = AIMSDB.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            String artist = resultSet.getString("artist");
            String recordLabel = resultSet.getString("recordLabel");
            String musicType = resultSet.getString("musicType");
            Date releasedDate = resultSet.getDate("releasedDate");

            return new CD(media.getId(), media.getTitle(), media.getCategory(), media.getPrice(), media.getQuantity(), media.getType(), artist, recordLabel, musicType, releasedDate);
        } else {
            throw new SQLException();
        }
    }
}
