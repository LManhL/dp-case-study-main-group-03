package views.screen.intro;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import utils.Utils;
import views.screen.BaseScreenHandler;
import views.screen.errorstrategy.ErrorMessage;
import views.screen.errorstrategy.LoadResourceErrorMessage;
import views.screen.errorstrategy.PopupErrorStrategy;
import views.screen.popup.PopupScreen;

public class IntroScreenHandler extends BaseScreenHandler {

    private static final Logger LOGGER = Utils.getLogger(IntroScreenHandler.class.getName());


    @FXML
    ImageView logo;

    public IntroScreenHandler(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);

        try {
            setupData(null);
            setupFunctionality();
        } catch (IOException ex) {
            LOGGER.info(ex.getMessage());
            showError(new LoadResourceErrorMessage());
        } catch (Exception ex) {
            LOGGER.info(ex.getMessage());
            showError(new ErrorMessage(ex.getMessage()));
        }
    }


    protected void setupData(Object dto) throws Exception {
        setErrorStrategy(new PopupErrorStrategy());
        return;
    }

    protected void setupFunctionality() throws Exception {
        File file = new File("src/main/resources/assets/images/Logo.png");
        Image image = new Image(file.toURI().toString());
        logo.setImage(image);
    }
}