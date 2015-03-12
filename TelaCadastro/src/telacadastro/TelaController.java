/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telacadastro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author ra143759
 */


public class TelaController {
    
    @FXML private Text txtMensagem;
    @FXML private TextField tfN1;
    @FXML private TextField tfN2;
    @FXML  RadioButton rb1;
    @FXML  RadioButton rb2;
    @FXML private CheckBox C;
    
    
    @FXML private ChoiceBox cbOperacoes;
    
    
    @FXML
    protected void Mostrar(ActionEvent event) {
        
      String n1 = tfN1.getText();
      String n2 = tfN2.getText();
      String cb = cbOperacoes.getValue().toString();
      
      txtMensagem.setText(cb.toString()+n2 + n1);
      
    }
    
}
