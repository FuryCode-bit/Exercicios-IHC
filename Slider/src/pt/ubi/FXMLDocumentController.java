package pt.ubi;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author jpc
 */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class FXMLDocumentController {
    @FXML
    private Pane pane;
    @FXML
    private Label labelRed;
    @FXML
    private Label labelBlue;
    @FXML
    private  Label labelGreen;
    @FXML
    private Slider sliderRed;
    @FXML
    private Slider sliderGreen;
    @FXML
    private Slider sliderBlue;

    @FXML
    private void initialize(){
        sliderRed.setMax(255);
        sliderGreen.setMax(255);
        sliderBlue.setMax(255);
        pane.setStyle("-fx-background-color: #000");
    }

    @FXML
    private void ChangeBackgroudColor(){
        int red = (int) sliderRed.getValue();
        int green = (int) sliderGreen.getValue();
        int blue = (int) sliderBlue.getValue();
        labelRed.setText("(0, " + String.valueOf(red) + " )");
        labelGreen.setText("(0, " + String.valueOf(green) + " )");
        labelBlue.setText("(0, " + String.valueOf(blue) + " )");

        String cor = String.format("rgb(%d,%d,%d);", red, green, blue);
        String LabelRedColor = String.format("rgb(%d,0,0);", red);
        String LabelGreenColor = String.format("rgb(0,%d,0);", green);
        String LabelBlueColor = String.format("rgb(0,0,%d);", blue);

        labelRed.setStyle("-fx-background-color: " + LabelRedColor);
        labelGreen.setStyle("-fx-background-color: " + LabelGreenColor);
        labelBlue.setStyle("-fx-background-color: " + LabelBlueColor);

        pane.setStyle("-fx-background-color: " + cor);
    }
}
