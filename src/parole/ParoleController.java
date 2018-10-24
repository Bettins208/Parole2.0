/**
 * Sample Skeleton for 'ParoleView.fxml' Controller Class
 */

package parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	ModelParola p ;
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="parole"
    private TextField parole; // Value injected by FXMLLoader

    @FXML // fx:id="inserisci"
    private Button inserisci; // Value injected by FXMLLoader

    @FXML // fx:id="campGrosso"
    private TextArea campGrosso; // Value injected by FXMLLoader

    @FXML // fx:id="delete"
    private Button delete; // Value injected by FXMLLoader

    @FXML // fx:id="reset"
    private Button reset; // Value injected by FXMLLoader

    @FXML
    void addParola(ActionEvent event) {
    	if(!(parole.getText().isEmpty())){
	    	p.addParola(parole.getText());
	    	campGrosso.clear();
	    	for(int i=0;i<p.getElenco().size();i++) {
	    		campGrosso.appendText(p.getElenco().get(i)+"\n");
	    	}
	    	parole.clear();
    	}else
    		System.out.println("!! Parola non inserita !!");
    }

    @FXML
    void deleteParola(ActionEvent event) {
    	campGrosso.clear();
    	if(!(parole.getText().isEmpty())) {
    		p.cancellaParola(parole.getText());
    	}
    	else
    		System.out.println("!! Parola da cancellare non presente !!");
    	for(int i=0;i<p.getElenco().size();i++) {
    		campGrosso.appendText(p.getElenco().get(i)+"\n");
    	}
    }

    @FXML
    void reset(ActionEvent event) {
    	p.reset();
    	campGrosso.clear();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert parole != null : "fx:id=\"parole\" was not injected: check your FXML file 'ParoleView.fxml'.";
        assert inserisci != null : "fx:id=\"inserisci\" was not injected: check your FXML file 'ParoleView.fxml'.";
        assert campGrosso != null : "fx:id=\"campGrosso\" was not injected: check your FXML file 'ParoleView.fxml'.";
        assert delete != null : "fx:id=\"delete\" was not injected: check your FXML file 'ParoleView.fxml'.";
        assert reset != null : "fx:id=\"reset\" was not injected: check your FXML file 'ParoleView.fxml'.";
        p=new ModelParola();
    }
}
