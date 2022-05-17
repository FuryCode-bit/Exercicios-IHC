package pt.ubi;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author jpc
 */
public class Main extends Application {
    @FXML
    private BorderPane pane;

    @FXML
    private Slider sliderRed;

    @FXML
    private Label labelRed;

    @FXML
    private Slider sliderGreen;

    @FXML
    private Slider sliderBlue;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Indeciso no RGB");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
