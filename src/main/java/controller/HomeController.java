package controller;

import java.sql.SQLException;
import java.util.List;

import dao.media.MediaDAO;
import entity.media.Media;

/**
 * This class controls the flow of events in homescreen
 * @author nguyenlm
 */
public class HomeController extends BaseController {


    /**
     * this method gets all Media in DB and return back to home to display
     * @return List[Media]
     * @throws SQLException
     */
    public static List getAllMedia() throws SQLException, ClassNotFoundException {
        return new MediaDAO().getAllMedia();
    }

}
