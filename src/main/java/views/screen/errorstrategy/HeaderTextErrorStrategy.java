package views.screen.errorstrategy;

import utils.Utils;
import views.screen.popup.HeaderTextScreen;
import views.screen.popup.PopupScreen;

import java.util.logging.Logger;

public class HeaderTextErrorStrategy implements ErrorStrategy {

    private static Logger LOGGER = Utils.getLogger(HeaderTextErrorStrategy.class.getName());

    @Override
    public void showError(ErrorMessage errorMessage) {
        try {
            PopupScreen.error(errorMessage.getMessage());
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        }
    }
}
