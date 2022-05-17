package pt.ubi;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author jpc
 */
public class FXMLDocumentController {
    @FXML
    private TextArea valorA;

    @FXML
    private TextArea valorB;

    @FXML
    private TextArea valorC;

    @FXML
    private Button submitBtn;

    @FXML
    private Label result;

    int a = 0, b = 0, c = 0, p;

    int menor[];

    double area;

    public void submit(ActionEvent event) {
        try {
            a = Integer.parseInt(valorA.getText());
            b = Integer.parseInt(valorB.getText());
            c = Integer.parseInt(valorC.getText());

            menor[0] = a;
            menor[1] = b;
            menor[2] = c;

            Arrays.sort(menor);

            p = (a+b+c)/2;

            area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println(area);

            if (a <=0 || b <=0 || c <=0 || Double.isNaN(area) || menor[0]+menor[1] < menor[2]) {
                result.setText("Valores Inválidos");
                result.setStyle("-fx-text-fill: red;");
            }
            else {
                result.setStyle("-fx-text-fill: green;");
                result.setText(String.valueOf(area));
            }
        } catch (Exception e) {
            result.setStyle("-fx-text-fill: red;");
            result.setText("Valores Inválidos");
            System.out.println("Something went wong!");
        }
    }
    
}
