package pt.ubi;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author fury
 */
public class FXMLDocumentController {

    @FXML
    private TextArea fullTxt;

    @FXML
    private TextField wordLbl;

    @FXML
    private Label noTimes;

    @FXML
    private CheckBox bigLetters;

    public void count(ActionEvent event) {
        String needle;
        String haystack;

        haystack = fullTxt.getText();
        needle = wordLbl.getText();

        if(!bigLetters.isSelected()) {
            haystack = haystack.toLowerCase();
        }

        int numberOfOccurences = 0;

        int index = haystack.indexOf(needle);
        while (index != -1)
        {
            numberOfOccurences++;
            haystack = haystack.substring(index+needle.length());
            index = haystack.indexOf(needle);
        }
        noTimes.setText("" + numberOfOccurences);
        System.out.println("" + numberOfOccurences);
    }    
    
}
