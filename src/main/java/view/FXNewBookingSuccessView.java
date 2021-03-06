package view;

import controller.NewBookingSuccessController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import view.protocols.NewBookingSuccessView;

import java.net.URL;
import java.util.ResourceBundle;

public class FXNewBookingSuccessView implements NewBookingSuccessView, Initializable {

    @FXML
    private Label message;

    private NewBookingSuccessController controller;

    public void setController(NewBookingSuccessController controller) {
        this.controller = controller;
    }

    @Override
    public void displayMessage(String message) {
        this.message.setText(message);
    }

    @FXML
    public void done() {
        controller.done();
    }

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        // TODO: Add errors for non-injected items

    }
}
