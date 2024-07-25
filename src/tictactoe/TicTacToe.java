
package tictactoe;

import java.io.DataOutput;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    SignInScr root;
    Clint clint = Clint.obj();
//    private static Stage mainStage;
//    public static Stage getStage()
//    {
//        return mainStage;
//    }
    @Override
    public void start(Stage stage) throws Exception {
        
//        mainStage = stage;
        Font.loadFont(getClass().getResource("/fonts/MooLahLah-Regular.ttf").toExternalForm(), 10);
        
        root = new SignInScr(stage);
        root.setId("backG");
        Scene scene = new Scene(root,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        Image icon = new Image(getClass().getResourceAsStream("/images/logo.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setTitle("TicTacToe");
        stage.show();
        stage.setOnCloseRequest(event -> {
            event.consume();
            exit(stage);
         });
    }

    public void exit(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Are you sure? Do you want to leave?");
        alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);

        alert.showAndWait().ifPresent(buttonType -> {
            if (buttonType == ButtonType.YES) {
              
                try {
                    if (clint.isExist)
                    {
                        clint.signOut();
                        clint.closeConnection();
                        clint.myThread.stop();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Platform.exit();
            } else {
                alert.close();
            }
        });
}

    public static void main(String[] args) {
        launch(args);
    }
    
}
