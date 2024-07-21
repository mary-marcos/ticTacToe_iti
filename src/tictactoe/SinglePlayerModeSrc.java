package tictactoe;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class SinglePlayerModeSrc extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final Label label;
    protected final Label label0;
    protected final MotionBlur motionBlur;
    protected final Label label1;
    protected final AnchorPane totalScoorTxt;
    protected final TextField totalScoorTxt0;
    protected final Button easyBtn;
    protected final Button hardBtn;
    protected final Button mediumBtn;
    protected final Label label2;
    protected final Label label3;
    protected final Button backBtn;
    
    private SignInScr signInScr;
    private ChooseModeScr chooseModeSrc;
    private Stage stage;
    private Scene scene;
    private GameScr gameSrc;

    public SinglePlayerModeSrc(Stage _stage) {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        label = new Label();
        label0 = new Label();
        motionBlur = new MotionBlur();
        label1 = new Label();
        totalScoorTxt = new AnchorPane();
        totalScoorTxt0 = new TextField();
        easyBtn = new Button();
        hardBtn = new Button();
        mediumBtn = new Button();
        label2 = new Label();
        label3 = new Label();
        backBtn = new Button();
        
        signInScr = new SignInScr(_stage);
        chooseModeSrc = new ChooseModeScr(_stage);

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(570.0);
        setPrefWidth(750.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        imageView.setFitHeight(150.0);
        imageView.setFitWidth(200.0);
        imageView.setLayoutX(283.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/images/logo.png").toExternalForm()));

        label.setId("ticTacToe");
        label.setLayoutX(70.0);
        label.setLayoutY(136.0);
        label.setPrefHeight(103.0);
        label.setPrefWidth(610.0);
        label.setText("Single Player Mode");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        label.setWrapText(true);
        label.setFont(new Font(70.0));

        label0.setId("ticTacToe");
        label0.setLayoutX(54.0);
        label0.setLayoutY(41.0);
        label0.setText("X");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#ffc201"));

        label0.setEffect(motionBlur);

        label1.setId("ticTacToe");
        label1.setLayoutX(669.0);
        label1.setLayoutY(110.0);
        label1.setText("O");
        label1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));

        label1.setEffect(motionBlur);
        setTop(anchorPane);

        BorderPane.setAlignment(totalScoorTxt, javafx.geometry.Pos.CENTER);
        totalScoorTxt.setPrefHeight(200.0);
        totalScoorTxt.setPrefWidth(200.0);

        totalScoorTxt0.setAlignment(javafx.geometry.Pos.CENTER);
        totalScoorTxt0.setEditable(false);
        totalScoorTxt0.setFocusTraversable(false);
        totalScoorTxt0.setId("yellow");
        totalScoorTxt0.setLayoutX(226.0);
        totalScoorTxt0.setLayoutY(36.0);
        totalScoorTxt0.setStyle("-fx-background-radius: 40;");
        totalScoorTxt0.setText("Total scoor: 0");
        totalScoorTxt0.setFont(new Font(20.0));

        easyBtn.setAccessibleText("about");
        easyBtn.setLayoutX(315.0);
        easyBtn.setLayoutY(104.0);
        easyBtn.setMnemonicParsing(false);
        easyBtn.setOnAction(this::easyMode);
        easyBtn.setPrefHeight(54.0);
        easyBtn.setPrefWidth(126.0);
        easyBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        easyBtn.setText("Easy");
        easyBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        easyBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        easyBtn.setWrapText(true);
        easyBtn.setFont(new Font(25.0));

        hardBtn.setAccessibleText("about");
        hardBtn.setLayoutX(315.0);
        hardBtn.setLayoutY(239.0);
        hardBtn.setMnemonicParsing(false);
        hardBtn.setOnAction(this::hardMode);
        hardBtn.setPrefHeight(54.0);
        hardBtn.setPrefWidth(126.0);
        hardBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        hardBtn.setText("Hard");
        hardBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        hardBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        hardBtn.setWrapText(true);
        hardBtn.setFont(new Font(25.0));

        mediumBtn.setAccessibleText("about");
        mediumBtn.setLayoutX(315.0);
        mediumBtn.setLayoutY(172.0);
        mediumBtn.setMnemonicParsing(false);
        mediumBtn.setOnAction(this::mediumMode);
        mediumBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        mediumBtn.setText("Medium");
        mediumBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        mediumBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        mediumBtn.setWrapText(true);
        mediumBtn.setFont(new Font(25.0));

        label2.setId("ticTacToe");
        label2.setLayoutX(653.0);
        label2.setLayoutY(198.0);
        label2.setText("X");
        label2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#ffc201"));

        label2.setEffect(motionBlur);

        label3.setId("ticTacToe");
        label3.setLayoutX(30.0);
        label3.setLayoutY(178.0);
        label3.setText("O");
        label3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label3.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));

        label3.setEffect(motionBlur);

        backBtn.setAccessibleText("about");
        backBtn.setLayoutX(14.0);
        backBtn.setLayoutY(266.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setOnAction(this::back);
        backBtn.setPrefHeight(54.0);
        backBtn.setPrefWidth(107.0);
        backBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        backBtn.setText("Back");
        backBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        backBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        backBtn.setWrapText(true);
        backBtn.setFont(new Font(25.0));
        setCenter(totalScoorTxt);

        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        anchorPane.getChildren().add(label1);
        totalScoorTxt.getChildren().add(totalScoorTxt0);
        totalScoorTxt.getChildren().add(easyBtn);
        totalScoorTxt.getChildren().add(hardBtn);
        totalScoorTxt.getChildren().add(mediumBtn);
        totalScoorTxt.getChildren().add(label2);
        totalScoorTxt.getChildren().add(label3);
        totalScoorTxt.getChildren().add(backBtn);

    }

    protected void easyMode(javafx.event.ActionEvent actionEvent)
    {
        gameSrc = new GameScr(stage,true,1);
        gameSrc.setId("backG");
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(gameSrc, 750, 570);
        scene.getStylesheets().add(getClass().getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        
    }

    protected void hardMode(javafx.event.ActionEvent actionEvent)
    {
        gameSrc = new GameScr(stage,true,3);
        gameSrc.setId("backG");
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(gameSrc, 750, 570);
        scene.getStylesheets().add(getClass().getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    protected void mediumMode(javafx.event.ActionEvent actionEvent)
    {
        gameSrc = new GameScr(stage,true,2);
        gameSrc.setId("backG");
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(gameSrc, 750, 570);
        scene.getStylesheets().add(getClass().getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }


    protected void back(javafx.event.ActionEvent actionEvent)
    {
           signInScr.chooseModeScreen(actionEvent);
        
    }

}
