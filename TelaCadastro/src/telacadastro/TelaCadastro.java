/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telacadastro;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ra143759
 */
public class TelaCadastro extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
       try{ 
        Parent root = FXMLLoader.load(getClass().getResource("TelaFXML.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Bem vindo ao Cadastro!");
        primaryStage.setScene(scene);
        primaryStage.show();
       }catch(Exception e){
       
          System.out.println(e);
       }
       /* 
        primaryStage.setTitle("Bem vindo ao Cadastro!");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Cadastro de Aluno");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("RA:");
        grid.add(userName, 0, 1);

        final TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Nome:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        Label s = new Label("Sexo:");
        grid.add(s, 0, 3);
        
        RadioButton rb1 = new RadioButton("F");
        grid.add(rb1, 1, 3);
        
        RadioButton rb2 = new RadioButton("M");
        grid.add(rb2, 2, 3);
        
        Label Choice = new Label("Estado");
        grid.add(Choice, 0, 4);
        
        ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList(
                "MS", "MT", "AC","SP")
         );
        
         grid.add(cb, 1, 4);
        
        CheckBox C = new CheckBox();
        C.setText("Ativo");
   
         
        grid.add(C, 1, 5);
          
        Button btn1 = new Button("Limpar");
        HBox hbBtn1 = new HBox(10);
        hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn1.getChildren().add(btn1);
        grid.add(hbBtn1, 2, 6);
        
        Button btn = new Button("Salvar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 6);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Voce Digitou: " + userTextField.getText());
            }
        });


        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add
        (TelaCadastro.class.getResource("TelaCadastro.css").toExternalForm());
        primaryStage.show();
        */
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
