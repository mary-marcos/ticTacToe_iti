/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ahmed Nasser
 */
public class GamesRecordController implements Initializable {

    @FXML
    private ImageView icon;
    @FXML
    private Label onlineLabel;
    @FXML
    private Button backBtn;
    @FXML
    private TableView<?> gamesRecordTabel;
    @FXML
    private TableColumn<?, ?> gameID;
    @FXML
    private TableColumn<?, ?> date;
    @FXML
    private TableColumn<?, ?> Scour;
    @FXML
    private TableColumn<?, ?> player2Name;
    @FXML
    private TableColumn<?, ?> recorded;

    private MultiPlayerModeSrc multiPlayerModeScr;
    private Scene scene; 
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         multiPlayerModeScr = new MultiPlayerModeSrc(stage);
    }    

    @FXML
    private void back(ActionEvent event)
    {
        multiPlayerModeScr.setId("backG");
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(multiPlayerModeScr,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    
}
