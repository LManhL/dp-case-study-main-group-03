package views.screen.errorstrategy;

import utils.Utils;
import views.screen.cart.CartScreenHandler;
import views.screen.popup.PopupScreen;

import java.util.logging.Logger;

public class PopupErrorStrategy implements ErrorStrategy {
    private static Logger LOGGER = Utils.getLogger(PopupErrorStrategy.class.getName());

    @Override
    public void showError(ErrorMessage errorMessage) {
        try {
            PopupScreen.error(errorMessage.getMessage());
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        }
    }
}
