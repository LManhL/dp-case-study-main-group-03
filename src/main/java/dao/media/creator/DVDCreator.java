package dao.media.creator;

import entity.db.AIMSDB;
import entity.media.DVD;
import entity.media.Media;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class DVDCreator extends MediaCreator{
    public DVDCreator() {
    }

    @Override
    public Media create(Media media) throws SQLException {
        if (!Objects.equals(media.getType(), "DVD")) {
            return null;
        }
        String sql = "SELECT * FROM " +
                "aims.DVD" +
                "WHERE Media.id = " + media.getId() + ";";
        Statement statement = AIMSDB.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            String discType = resultSet.getString("discType");
            String director = resultSet.getString("director");
            int runtime = resultSet.getInt("runtime");
            String studio = resultSet.getString("studio");
            String subtitles = resultSet.getString("subtitles");
            Date releasedDate = resultSet.getDate("releasedDate");
            String filmType = resultSet.getString("filmType");

            return new DVD(media.getId(), media.getTitle(), media.getCategory(), media.getPrice(), media.getQuantity(), media.getType(), discType, director, runtime, studio, subtitles, releasedDate, filmType);
        } else {
            throw new SQLException();
        }
    }
}
