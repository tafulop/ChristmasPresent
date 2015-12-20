package com.homeproject.tafulop.fxtest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.awt.FileDialog;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.WindowEvent;
import net.coobird.thumbnailator.Thumbnails;


public class FXMLController implements Initializable {
    
    private Frame mainFrame;
    private Panel controlPanel;
    
    
    @FXML
    private Label label;
    
    @FXML
    private Label usageHintLabel;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       

        showFileBrowser();
        
        FileDialog fileDialog = new FileDialog(mainFrame,"Select file");
        fileDialog.setVisible(true);
        
        File[] pictures = fileDialog.getFiles();
        ImageResizer.resizeImages(pictures, 1024, 768);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        System.out.println("Initialized.");
    }    
    
    
     private void showFileBrowser(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
     
      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

     
   }
}
