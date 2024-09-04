
package tictactoe;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    
    ServerHandler clint = ServerHandler.obj();
    static Scene mainScene;
    static Parent root;
    static HashMap <String , Pane> screens = new HashMap();
    @Override
    public void start(Stage stage) throws Exception {
        addScreens();
        Font.loadFont(getClass().getResource("/fonts/MooLahLah-Regular.ttf").toExternalForm(), 10);
        root = screens.get("signinScreen");
        root.setId("backG");
        mainScene = new Scene(root,750,570);
        mainScene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        Image icon = new Image(getClass().getResourceAsStream("/images/logo.png"));
        stage.getIcons().add(icon);
        stage.setScene(mainScene);
        stage.setTitle("TicTacToe");
        stage.show();
        stage.setOnCloseRequest(event -> {
            event.consume();
            exit();
         });
    }
    
    public void addScreens(){
        
        screens.put("signinScreen", new SignInScr());
        screens.put("signupScreen", new SignUpScr());
        screens.put("singleMoodeScreen", new SinglePlayerModeSrc());
        screens.put("gameOnlineScreen", new GameOnlineSrc());
        screens.put("leadboardScreen", new LeadBoardScr());
        screens.put("aboutScreen", new AboutScr());
        screens.put("chooseModeScreen",new ChooseModeScr());
        screens.put("gameScreenSingleE",new GameScr(true, 1));
        screens.put("gameScreenSingleM",new GameScr(true, 2));
        screens.put("gameScreenSingleH",new GameScr(true, 3));
        screens.put("gameScreenMulti",new GameScr(false, 0));
        screens.put("multiModeScreen", new MultiPlayerModeSrc());
        screens.put("onlineScreen", new OnlineScr());
    }
    
    public static void setScreen(String screenName){
        Platform.runLater(()->{
            if (screens.containsKey(screenName)){

                    root = screens.get(screenName);
                    root.setId("backG");
                    mainScene.setRoot(root);

            }
            else{
                   new Alert(Alert.AlertType.ERROR,"Invalid screen name").show();
            }
        });
        
    }

    public void exit() {

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
