package views.screen.payment;

import controller.PaymentController;
import entity.cart.CartItem;
import entity.invoice.Invoice;
import entity.payment.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import utils.MyMap;
import utils.Utils;
import views.screen.BaseScreenHandler;
import views.screen.ViewsConfig;
import views.screen.errorstrategy.ErrorMessage;
import views.screen.errorstrategy.LoadResourceErrorMessage;
import views.screen.errorstrategy.PopupErrorStrategy;
import views.screen.popup.PopupScreen;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

public class PaymentScreenHandler extends BaseScreenHandler {

    private static final Logger LOGGER = Utils.getLogger(PaymentScreenHandler.class.getName());

    @FXML
    private Button btnConfirmPayment;

    @FXML
    private ImageView loadingImage;

    private Invoice invoice;

    @FXML
    private Label pageTitle;

    @FXML
    private TextField cardNumber;

    @FXML
    private TextField holderName;

    @FXML
    private TextField expirationDate;

    @FXML
    private TextField securityCode;

    public PaymentScreenHandler(Stage stage, String screenPath, Invoice invoice) throws IOException {
        super(stage, screenPath);
        try {
            setupData(invoice);
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
        this.invoice = (Invoice) dto;
    }

    protected void setupFunctionality() throws Exception {
        setErrorStrategy(new PopupErrorStrategy());
        btnConfirmPayment.setOnMouseClicked(e -> {
            try {
                confirmToPayOrder();
                ((PaymentController) getBController()).emptyCart();
            } catch (Exception exp) {
                System.out.println(exp.getStackTrace());
            }
        });
    }

    void confirmToPayOrder() throws IOException {
        String contents = "pay order";
        PaymentController ctrl = (PaymentController) getBController();
        Card card = new CreditCard(
                cardNumber.getText(),
                holderName.getText(),
                ctrl.getExpirationDate(expirationDate.getText()),
                Integer.parseInt(securityCode.getText()));
        Map<String, String> response = ctrl.payOrder(invoice.getAmount(), contents, card);
        BaseScreenHandler resultScreen = new ResultScreenHandler(this.stage, ViewsConfig.RESULT_SCREEN_PATH, response);
        resultScreen.setPreviousScreen(this);
        resultScreen.setHomeScreenHandler(homeScreenHandler);
        resultScreen.setScreenTitle("Result Screen");
        resultScreen.show();
    }
}