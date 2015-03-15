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
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

/**
 *
 * @author ra143759
 */


public class TelaController {
    
    @FXML  Text txtMensagem;
    @FXML  TextField txt1;
    @FXML  TextField txt2;
    @FXML  ToggleGroup myToggleGroup;
    @FXML  RadioButton m;
    @FXML  CheckBox C;
    @FXML  ChoiceBox cbOperacoes;
    
    
    @FXML
    protected void Mostrar(ActionEvent event) {
        
      String n1 = txt1.getText();
      String n2 = txt2.getText();
      String cb = cbOperacoes.getValue().toString();
      String sexo = String.format(myToggleGroup.getSelectedToggle().toString());
      Boolean r1 = m.isSelected();
      Boolean CB = C.isSelected();
      
      if(CB){
          if(r1){
                txtMensagem.setText("Você Digitou: \n" +"Nome: " +  n1 + "\n" + "RA: " + n2 + "\n"+ "Perfil: Ativo" + "\n" + "Sexo: " + "Masculino" + "\n" + "Estado: " +cb);
          }else{
                txtMensagem.setText("Você Digitou: \n" +"Nome: " +  n1 + "\n" + "RA: " + n2 + "\n"+ "Perfil: Ativo" + "\n" + "Sexo: " + "Feminino" + "\n" + "Estado: " +cb);
          }
          
      }else{ 
        if(r1){  
            txtMensagem.setText("Você Digitou: \n" +"Nome: " +  n1 + "\n" + "RA: " + n2 + "\n" + "Sexo: " + "Masculino" + "\n" + "Estado: " +cb);
        }else{
            txtMensagem.setText("Você Digitou: \n" +"Nome: " +  n1 + "\n" + "RA: " + n2 + "\n" + "Sexo: " + "Feminino"  + "\n" + "Estado: " +cb);
        }
      }
      
    }
    
    @FXML
    protected void LimparCampos(ActionEvent event){
        txt1.setText(null);
        txt2.setText(null);
    }
    
}
