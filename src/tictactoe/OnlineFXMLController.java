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

public class OnlineFXMLController implements Initializable {

    @FXML
    private ImageView icon;
    @FXML
    private Label onlineLabel;
    @FXML
    private TableView<?> onlineTabel;
    @FXML
    private TableColumn<?, ?> playerNameC;
    @FXML
    private Button backBtn;
    
    private MultiPlayerModeSrc multiPlayerModeScr;
    private Scene scene; 
    private Stage stage;
    @FXML
    private TableColumn<?, ?> status;
    @FXML
    private TableColumn<?, ?> Avilability;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        multiPlayerModeScr = new MultiPlayerModeSrc(stage);
        
        
    }    

    @FXML
    void back(ActionEvent event) 
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

