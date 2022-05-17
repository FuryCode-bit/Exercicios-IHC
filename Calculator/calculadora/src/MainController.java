package calculadora.src;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController {
    @FXML private Pane titlePane;
    @FXML private Button closeBtn;
    @FXML private Label lblResult;

    boolean mulBool = false;
    boolean divBool = false;
    boolean sumBool = false;
    boolean minusBool = false;

    private double x, y;
    private double num1 = 0;

    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });

        closeBtn.setOnMouseClicked(mouseEvent -> stage.close());
    }

    @FXML
    void onNumberClicked(MouseEvent event) {
        String val = ((Button)event.getSource()).getText();
        lblResult.setText(val);
    }

    @FXML
    void onSymbolClicked(MouseEvent event) {

        String symbol = ((Button)event.getSource()).getText();

        switch(symbol) {
            case "+" -> {
                sumBool = true;
                System.out.println(num1);
                num1 = Double.parseDouble(lblResult.getText());
                System.out.println("SumBool is true");
            }
            case "-" -> {
                minusBool = true;
                System.out.println(num1);
                num1 = Double.parseDouble(lblResult.getText());
                System.out.println("minusBool is true");
            }
            case "*" -> {
                mulBool = true;
                System.out.println(num1);
                num1 = Double.parseDouble(lblResult.getText());
                System.out.println("mulBool is true");
            }
            case "/" -> {
                divBool = true;
                System.out.println(num1);
                num1 = Double.parseDouble(lblResult.getText());
                System.out.println("divBool is true");
            }
        }
        if(symbol.equals("=")) {
            double num2 = Double.parseDouble(lblResult.getText());
            System.out.println(num1);
            System.out.println(num2);

            if(sumBool) {
                lblResult.setText(String.valueOf(num1+num2));
            }
            if(minusBool) {
                lblResult.setText(String.valueOf(num1-num2));
            }
            if(mulBool) {
                lblResult.setText(String.valueOf(num1*num2));
            }
            if(divBool) {
                lblResult.setText(String.valueOf(num1/num2));
            }

        }
        if(symbol.equals("C")) {
            lblResult.setText("0.0");
            mulBool = false;
            sumBool = false;
            divBool = false;
            minusBool = false;
        }
    }
}