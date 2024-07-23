package tictactoe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ChooseModeScr extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final AnchorPane anchorPane0;
    protected final Button button;
    protected final Button button0;
    protected final AnchorPane anchorPane1;
    protected final MotionBlur motionBlur;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Label label2;
    protected final Label label3;
    
    private SinglePlayerModeSrc singleMode;
    private MultiPlayerModeSrc multiMode;
    private LeadBoardScr leadBoardScr;
    private SignInScr signInSrc;
    private AboutScr aboutScr;
    private Stage stage;
    private Scene scene;
    Clint clint;

    public ChooseModeScr(Stage _stage) {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        motionBlur = new MotionBlur();
        anchorPane0 = new AnchorPane();
        button = new Button();
        button0 = new Button();
        anchorPane1 = new AnchorPane();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        label2 = new Label();
        label3 = new Label();
        
        signInSrc = new SignInScr(_stage);
        clint = Clint.obj();
        stage = _stage;

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(570.0);
        setPrefWidth(750.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(250.0);
        anchorPane.setPrefWidth(750.0);

        imageView.setFitHeight(150.0);
        imageView.setFitWidth(200.0);
        imageView.setLayoutX(283.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/images/logo.png").toExternalForm()));

        label.setId("ticTacToe");
        label.setLayoutX(203.0);
        label.setLayoutY(133.0);
        label.setPrefHeight(92.0);
        label.setPrefWidth(344.0);
        label.setText("Tic Tac Toe");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(new LinearGradient(
            0, 0, 1, 0, true,  
            javafx.scene.paint.CycleMethod.NO_CYCLE,  
            new Stop(0, Color.rgb(255, 194, 1)),  
            new Stop(1, Color.rgb(215, 41, 120))
        ));
        label.setFont(new Font(70.0));

        label0.setId("ticTacToe");
        label0.setLayoutX(54.0);
        label0.setLayoutY(41.0);
        label0.setText("X");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#ffc201"));
        motionBlur.setRadius(10.0);
        label0.setEffect(motionBlur);

        label1.setId("ticTacToe");
        label1.setLayoutX(672.0);
        label1.setLayoutY(140.0);
        label1.setText("O");
        label1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        label1.setEffect(motionBlur);
        setTop(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setMinHeight(USE_PREF_SIZE);
        anchorPane0.setPrefHeight(120.0);
        anchorPane0.setPrefWidth(750.0);

        button.setAccessibleText("singlePlayerBtn");
        button.setLayoutX(46.0);
        button.setLayoutY(37.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::singlePlayerMode);
        button.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        button.setText("Single Player Mode");
        button.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setWrapText(true);
        button.setFont(new Font(25.0));

        button0.setAccessibleText("multiPlayerBtn");
        button0.setLayoutX(473.0);
        button0.setLayoutY(37.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::multiPlayerMode);
        button0.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        button0.setText("Multi Player Mode");
        button0.setTextFill(javafx.scene.paint.Color.WHITE);
        button0.setFont(new Font(25.0));
        setCenter(anchorPane0);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(192.0);
        anchorPane1.setPrefWidth(750.0);

        button1.setAccessibleText("leadBoard");
        button1.setLayoutX(45.0);
        button1.setLayoutY(96.0);
        button1.setMnemonicParsing(false);
        button1.setOnAction(this::leadBoard);
        button1.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        button1.setText("Lead board");
        button1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button1.setTextFill(javafx.scene.paint.Color.WHITE);
        button1.setWrapText(true);
        button1.setFont(new Font(25.0));

        button2.setAccessibleText("about");
        button2.setLayoutX(324.0);
        button2.setLayoutY(96.0);
        button2.setMnemonicParsing(false);
        button2.setOnAction(this::about);
        button2.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        button2.setText("About");
        button2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button2.setTextFill(javafx.scene.paint.Color.WHITE);
        button2.setWrapText(true);
        button2.setFont(new Font(25.0));

        button3.setAccessibleText("signOut");
        button3.setLayoutX(553.0);
        button3.setLayoutY(96.0);
        button3.setMnemonicParsing(false);
        button3.setOnAction(this::signOut);
        button3.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        button3.setText("Sign out");
        button3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        button3.setTextFill(javafx.scene.paint.Color.WHITE);
        button3.setWrapText(true);
        button3.setFont(new Font(25.0));

        label2.setId("ticTacToe");
        label2.setLayoutX(670.0);
        label2.setLayoutY(15.0);
        label2.setText("X");
        label2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#ffc201"));
        label2.setEffect(motionBlur);

        label3.setId("ticTacToe");
        label3.setLayoutX(30.0);
        label3.setLayoutY(23.0);
        label3.setText("O");
        label3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        label3.setEffect(motionBlur);
        setBottom(anchorPane1);

        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(button0);
        anchorPane1.getChildren().add(button1);
        anchorPane1.getChildren().add(button2);
        anchorPane1.getChildren().add(button3);
        anchorPane1.getChildren().add(label2);
        anchorPane1.getChildren().add(label3);

    }
    
    protected void toSignInSrc(ActionEvent action)
    {
        signInSrc.setId("backG");
        stage = (Stage)((Node) action.getSource()).getScene().getWindow();
        scene = new Scene(signInSrc,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    
    protected void toMultiPlaySrc(ActionEvent action)
    {
        multiMode = new MultiPlayerModeSrc(stage);
        multiMode.setId("backG");
        stage = (Stage)((Node) action.getSource()).getScene().getWindow();
        scene = new Scene(multiMode,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    
     protected void toSinglePlaySrc(ActionEvent action)
    {
        singleMode = new SinglePlayerModeSrc(stage);
        singleMode.setId("backG");
        stage = (Stage)((Node) action.getSource()).getScene().getWindow();
        scene = new Scene(singleMode,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    protected void singlePlayerMode(ActionEvent actionEvent)
    {
        toSinglePlaySrc(actionEvent);
    }

    protected void multiPlayerMode(ActionEvent actionEvent)
    {
        toMultiPlaySrc(actionEvent);
    }

    protected void leadBoard(ActionEvent actionEvent)
    {
        leadBoardScr = new LeadBoardScr(stage);
        leadBoardScr.setId("backG");
        stage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(leadBoardScr,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    protected void about(ActionEvent actionEvent)
    {
        aboutScr = new AboutScr(stage);
        stage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(aboutScr,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    protected void signOut(ActionEvent actionEvent)
    {
        if (clint.isExist)
        {
            try 
            {
                clint.signOut();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("SignOut");
        alert.setHeaderText("Are you sure? Do you want to Sign out?");
        alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
        
        alert.showAndWait().ifPresent(buttonType -> {
            
            if (buttonType == ButtonType.YES) {
              
                try {
                    clint.closeConnection();
                    clint.myThread.stop();
                } catch (IOException ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Platform.runLater(()->{toSignInSrc(actionEvent);});
            } else {
                alert.close();
            }
        });
    
    }

}
