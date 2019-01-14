    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author BSCIT
 */
public class FXMLDocumentController implements Initializable {
   
    @FXML
    private Circle cir_my;
    
    
     @FXML
    private Button btn_search;
    
  
    
    @FXML
    private ImageView btn_setting,btn_spell,btn_dic,btn_about,btn_power,btn_exit;
     
    @FXML
    private AnchorPane h_setting,h_spell,h_dic,h_about;
    
    
    
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
        if(event.getTarget()== btn_setting){
        h_setting.setVisible(true);
         h_spell.setVisible(false);
          h_dic.setVisible(false);
           h_about.setVisible(false);
        }else {}
         if(event.getTarget()== btn_spell){
             h_setting.setVisible(false);
         h_spell.setVisible(true);
          h_dic.setVisible(false);
           h_about.setVisible(false);
             
        }else {}
         if(event.getTarget()== btn_dic){
           h_setting.setVisible(false);
         h_spell.setVisible(false);
          h_dic.setVisible(true);
           h_about.setVisible(false);
         }else {}
         if(event.getTarget()== btn_about){
             h_setting.setVisible(false);
         h_spell.setVisible(false);
          h_dic.setVisible(false);
           h_about.setVisible(true);
         }else {}
     if(event.getTarget()== btn_exit){
         Stage stage = (Stage) btn_exit.getScene().getWindow();
    stage.close();
    
   
    
     }   
    }
     
    
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        cir_my.setStroke(Color.SEAGREEN);
        Image im = new Image("javafxapplication2/images/my.jpg",false);
        cir_my.setFill(new ImagePattern(im));
        cir_my.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
    
        
    }    
}