package dao.media;

import entity.db.AIMSDB;
import entity.media.Media;
import entity.media.AudioBook;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AudioBookDAO extends MediaDAO{
//    @Override
//    public Media getMediaById(int id) throws SQLException {
//        String sql = "SELECT * FROM "+
//                "aims.AudioBook " +
//                "INNER JOIN aims.Media " +
//                "ON Media.id = AudioBook.id " +
//                "where Media.id = " + id + ";";
//        Statement stm = AIMSDB.getConnection().createStatement();
//        ResultSet res = stm.executeQuery(sql);
//        if(res.next()) {
//
//            // from Media table
//            String title = "";
//            String type = res.getString("type");
//            int price = res.getInt("price");
//            String category = res.getString("category");
//            int quantity = res.getInt("quantity");
//
//            // from Book table
//            String author = res.getString("author");
//            String format = res.getString("format");
//            String language = res.getString("language");
//            String accent = res.getString("accent");
//            int lengthInMinutes = res.getInt("lengthInMinutes");
//
//            return new AudioBook(id, title, category, price, quantity, type, author, format, language, accent, lengthInMinutes);
//
//        } else {
//            throw new SQLException();
//        }
//    }

    public ResultSet findMediaById(int id) throws SQLException {
        String sql = "SELECT * FROM " +
                "aims.AudioBook " +
                "WHERE AudioBook.id = " + id + ";";

        Statement statement = AIMSDB.getConnection().createStatement();
        ResultSet res = statement.executeQuery(sql);

        if (res != null) {
            return res;
        } else {
            throw new SQLException();
        }
    }
}
