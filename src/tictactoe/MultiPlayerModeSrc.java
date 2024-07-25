package tictactoe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MultiPlayerModeSrc extends BorderPane
{
    protected final AnchorPane anchorPane;
    protected final ImageView icon;
    protected final Label modeName;
    protected final Label label;
    protected final MotionBlur motionBlur;
    protected final Label label0;
    protected final AnchorPane anchorPane0;
    protected final Button offlineBtn;
    protected final Button onlineBtn;
    protected final Button gameRecordBtn;
    protected final Label label1;
    protected final Label label2;
    protected final Button backBtn;
    
    private SignInScr signInScr;
    private ChooseModeScr chooseModeSrc;
    private OnlineScr onlineScr;
    private GameScr gameSrc;
    private Parent root;
    private Scene scene;
    private Stage stage;
    Clint clint;
    boolean firstTime = true;
    

    public MultiPlayerModeSrc(Stage _stage) {

        anchorPane = new AnchorPane();
        icon = new ImageView();
        modeName = new Label();
        label = new Label();
        motionBlur = new MotionBlur();
        label0 = new Label();
        anchorPane0 = new AnchorPane();
        offlineBtn = new Button();
        onlineBtn = new Button();
        gameRecordBtn = new Button();
        label1 = new Label();
        label2 = new Label();
        backBtn = new Button();
        
        signInScr = new SignInScr(_stage);
        chooseModeSrc = new ChooseModeScr(_stage);
        clint = Clint.obj();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(570.0);
        setPrefWidth(750.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(248.0);
        anchorPane.setPrefWidth(750.0);

        icon.setFitHeight(150.0);
        icon.setFitWidth(200.0);
        icon.setLayoutX(276.0);
        icon.setLayoutY(6.0);
        icon.setPickOnBounds(true);
        icon.setPreserveRatio(true);
        icon.setImage(new Image(getClass().getResource("/images/logo.png").toExternalForm()));

        modeName.setId("ticTacToe");
        modeName.setLayoutX(100.0);
        modeName.setLayoutY(151.0);
        modeName.setPrefHeight(103.0);
        modeName.setPrefWidth(573.0);
        modeName.setText("Multi Player Mode");
        modeName.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        modeName.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        modeName.setFont(new Font(70.0));

        label.setId("ticTacToe");
        label.setLayoutX(54.0);
        label.setLayoutY(41.0);
        label.setText("X");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#ffc201"));

        motionBlur.setRadius(10.0);
        label.setEffect(motionBlur);

        label0.setId("ticTacToe");
        label0.setLayoutX(672.0);
        label0.setLayoutY(121.0);
        label0.setText("O");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));

        label0.setEffect(motionBlur);
        setTop(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        offlineBtn.setAccessibleText("about");
        offlineBtn.setLayoutX(515.0);
        offlineBtn.setLayoutY(95.0);
        offlineBtn.setMnemonicParsing(false);
        offlineBtn.setOnAction(this::offlineMultiGame);
        offlineBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        offlineBtn.setText("Offline");
        offlineBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        offlineBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        offlineBtn.setWrapText(true);
        offlineBtn.setFont(new Font(25.0));

        onlineBtn.setAccessibleText("about");
        onlineBtn.setLayoutX(110.0);
        onlineBtn.setLayoutY(95.0);
        onlineBtn.setMnemonicParsing(false);
        onlineBtn.setOnAction(this::onlineMultiGame);
        onlineBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        onlineBtn.setText("Online");
        onlineBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        onlineBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        onlineBtn.setWrapText(true);
        onlineBtn.setFont(new Font(25.0));

        gameRecordBtn.setAccessibleText("multiPlayerBtn");
        gameRecordBtn.setLayoutX(284.0);
        gameRecordBtn.setLayoutY(95.0);
        gameRecordBtn.setMnemonicParsing(false);
        gameRecordBtn.setOnAction(this::gameRecord);
        gameRecordBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        gameRecordBtn.setText("Game Record");
        gameRecordBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        gameRecordBtn.setFont(new Font(25.0));

        label1.setId("ticTacToe");
        label1.setLayoutX(653.0);
        label1.setLayoutY(198.0);
        label1.setText("X");
        label1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#ffc201"));

        label1.setEffect(motionBlur);

        label2.setId("ticTacToe");
        label2.setLayoutX(30.0);
        label2.setLayoutY(158.0);
        label2.setText("O");
        label2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));

        label2.setEffect(motionBlur);

        backBtn.setAccessibleText("about");
        backBtn.setLayoutX(14.0);
        backBtn.setLayoutY(248.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setOnAction(this::back);
        backBtn.setPrefHeight(54.0);
        backBtn.setPrefWidth(96.0);
        backBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        backBtn.setText("Back");
        backBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        backBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        backBtn.setWrapText(true);
        backBtn.setFont(new Font(25.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(icon);
        anchorPane.getChildren().add(modeName);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane0.getChildren().add(offlineBtn);
        anchorPane0.getChildren().add(onlineBtn);
        anchorPane0.getChildren().add(gameRecordBtn);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(label2);
        anchorPane0.getChildren().add(backBtn);

    }

   protected void offlineMultiGame(javafx.event.ActionEvent actionEvent)
    {
        gameSrc = new GameScr(stage,false,0);
        gameSrc.setId("backG");
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(gameSrc, 750, 570);
        scene.getStylesheets().add(getClass().getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    protected  void onlineMultiGame(javafx.event.ActionEvent actionEvent)
    {
        try 
        {
          clint.sendSignal();
          clint.readFromServer();
          if (firstTime)
          {
          clint.myThread.start();
          firstTime = false;
          }
          else 
          {
            clint.myThread.resume();
          }
        } catch (IOException ex) {
            Logger.getLogger(MultiPlayerModeSrc.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        onlineScr = new OnlineScr(stage);
        onlineScr.setId("backG");
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(onlineScr, 750, 570);
        scene.getStylesheets().add(getClass().getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

    }

    protected  void gameRecord(javafx.event.ActionEvent actionEvent)
    {
          try {
            root = FXMLLoader.load(getClass().getResource("/style/GamesRecord.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MultiPlayerModeSrc.class.getName()).log(Level.SEVERE, null, ex);
        }
         stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        root.setId("backG");
        scene = new Scene(root,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }


    protected void back(javafx.event.ActionEvent actionEvent)
    {
     signInScr.chooseModeScreen(actionEvent);

    }
}
