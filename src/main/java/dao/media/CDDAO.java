package dao.media;

import entity.db.AIMSDB;
import entity.media.CD;
import entity.media.Media;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * @author
 */
public class CDDAO extends MediaDAO {

//    @Override
//    public Media getMediaById(int id) throws SQLException {
//        String sql = "SELECT * FROM "+
//                "aims.CD " +
//                "INNER JOIN aims.Media " +
//                "ON Media.id = CD.id " +
//                "where Media.id = " + id + ";";
//
//        ResultSet res = AIMSDB.getConnection().createStatement().executeQuery(sql);
//        if(res.next()) {
//
//            // from media table
//            String title = "";
//            String type = res.getString("type");
//            int price = res.getInt("price");
//            String category = res.getString("category");
//            int quantity = res.getInt("quantity");
//
//            // from CD table
//            String artist = res.getString("artist");
//            String recordLabel = res.getString("recordLabel");
//            String musicType = res.getString("musicType");
//            Date releasedDate = res.getDate("releasedDate");
//
//            return new CD(id, title, category, price, quantity, type,
//                    artist, recordLabel, musicType, releasedDate);
//
//        } else {
//            throw new SQLException();
//        }
//    }

    public ResultSet findMediaById(int id) throws SQLException {
        String sql = "SELECT * FROM " +
                "aims.CD " +
                "WHERE CD.id = " + id + ";";

        Statement statement = AIMSDB.getConnection().createStatement();
        ResultSet res = statement.executeQuery(sql);

        if (res != null) {
            return res;
        } else {
            throw new SQLException();
        }
    }
}
