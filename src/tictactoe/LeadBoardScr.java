package tictactoe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LeadBoardScr extends AnchorPane {

    protected final Label label;
    protected final Label label0;
    protected final ImageView imageView;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final Label label5;
    protected final Label label6;
    protected final ImageView imageView2;
    protected final Label label7;
    protected final Label label8;
    protected final ImageView imageView3;
    protected final Label label9;
    protected final Label label10;
    protected final ImageView imageView4;
    protected final Label label11;
    protected final Label label12;
    protected final ImageView imageView5;
    protected final Label label13;
    protected final Label label14;
    protected final ImageView imageView6;
    protected final Label label15;
    protected final Label label16;
    protected final ImageView imageView7;
    protected final Label label17;
    protected final Label label18;
    protected final ImageView imageView8;
    protected final Label gameRecordLabel;
    protected final ImageView imageView9;
    protected final Label player1Name;
    protected final Label player1scour;
    protected final Label player2scour;
    protected final Label player2Name;
    protected final Label player3Name;
    protected final Label player4Name;
    protected final Label player5Name;
    protected final Label player7Name;
    protected final Label player9Name;
    protected final Label player10Name;
    protected final Label player6Name;
    protected final Label player8Name;
    protected final Label player4scour;
    protected final Label player6scour;
    protected final Label player8scour;
    protected final Label player3scour;
    protected final Label player5scour;
    protected final Label player7scour;
    protected final Label player9scour;
    protected final Label player10scour;
    protected final Button backBtn;
    protected final Label label19;
    protected final MotionBlur motionBlur;
    protected final Label label110;
    protected final MotionBlur motionBlur0;
    
    private SignInScr signInScr;
    private ChooseModeScr chooseModeSrc;

    public LeadBoardScr(Stage _stage) {

        label = new Label();
        label0 = new Label();
        imageView = new ImageView();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        label5 = new Label();
        label6 = new Label();
        imageView2 = new ImageView();
        label7 = new Label();
        label8 = new Label();
        imageView3 = new ImageView();
        label9 = new Label();
        label10 = new Label();
        imageView4 = new ImageView();
        label11 = new Label();
        label12 = new Label();
        imageView5 = new ImageView();
        label13 = new Label();
        label14 = new Label();
        imageView6 = new ImageView();
        label15 = new Label();
        label16 = new Label();
        imageView7 = new ImageView();
        label17 = new Label();
        label18 = new Label();
        imageView8 = new ImageView();
        gameRecordLabel = new Label();
        imageView9 = new ImageView();
        player1Name = new Label();
        player1scour = new Label();
        player2scour = new Label();
        player2Name = new Label();
        player3Name = new Label();
        player4Name = new Label();
        player5Name = new Label();
        player7Name = new Label();
        player9Name = new Label();
        player10Name = new Label();
        player6Name = new Label();
        player8Name = new Label();
        player4scour = new Label();
        player6scour = new Label();
        player8scour = new Label();
        player3scour = new Label();
        player5scour = new Label();
        player7scour = new Label();
        player9scour = new Label();
        player10scour = new Label();
        backBtn = new Button();
        label19 = new Label();
        motionBlur = new MotionBlur();
        label110 = new Label();
        motionBlur0 = new MotionBlur();
        
        signInScr = new SignInScr(_stage);
        chooseModeSrc = new ChooseModeScr(_stage);
        
        setId("AnchorPane");
        setPrefHeight(570.0);
        setPrefWidth(750.0);

        label.setLayoutX(153.0);
        label.setLayoutY(237.0);
        label.setMinHeight(USE_PREF_SIZE);
        label.setMinWidth(USE_PREF_SIZE);
        label.setPrefHeight(40.0);
        label.setPrefWidth(437.0);
        label.setStyle("-fx-background-color: #7FFF00; -fx-background-radius: 50px;");

        label0.setLayoutX(437.0);
        label0.setLayoutY(248.0);
        label0.setText("Score:");
        label0.setFont(new Font("System Bold", 14.0));

        imageView.setFitHeight(35.0);
        imageView.setFitWidth(41.0);
        imageView.setLayoutX(160.0);
        imageView.setLayoutY(237.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/images/man_4140048.png").toExternalForm()));

        label1.setLayoutX(102.0);
        label1.setLayoutY(285.0);
        label1.setPrefHeight(40.0);
        label1.setPrefWidth(277.0);
        label1.setStyle("-fx-background-color: D74C4C; -fx-background-radius: 50px;");

        label2.setLayoutX(279.0);
        label2.setLayoutY(296.0);
        label2.setText("Score:");
        label2.setFont(new Font("System Bold", 14.0));

        label3.setLayoutX(268.0);
        label3.setLayoutY(485.0);
        label3.setPrefHeight(40.0);
        label3.setPrefWidth(277.0);
        label3.setStyle("-fx-background-color: #93BAEB; -fx-background-radius: 50px;");

        label4.setLayoutX(440.0);
        label4.setLayoutY(495.0);
        label4.setText("Score:");
        label4.setFont(new Font("System Bold", 14.0));

        imageView0.setFitHeight(30.0);
        imageView0.setFitWidth(30.0);
        imageView0.setLayoutX(275.0);
        imageView0.setLayoutY(488.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        imageView1.setFitHeight(35.0);
        imageView1.setFitWidth(30.0);
        imageView1.setLayoutX(110.0);
        imageView1.setLayoutY(289.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        label5.setLayoutX(382.0);
        label5.setLayoutY(285.0);
        label5.setPrefHeight(40.0);
        label5.setPrefWidth(277.0);
        label5.setStyle("-fx-background-color: D74C4C; -fx-background-radius: 50px;");

        label6.setLayoutX(560.0);
        label6.setLayoutY(295.0);
        label6.setText("Score:");
        label6.setFont(new Font("System Bold", 14.0));

        imageView2.setFitHeight(30.0);
        imageView2.setFitWidth(30.0);
        imageView2.setLayoutX(392.0);
        imageView2.setLayoutY(289.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        label7.setLayoutX(101.0);
        label7.setLayoutY(333.0);
        label7.setPrefHeight(40.0);
        label7.setPrefWidth(277.0);
        label7.setStyle("-fx-background-color: D4D74C; -fx-background-radius: 50px;");

        label8.setLayoutX(277.0);
        label8.setLayoutY(341.0);
        label8.setText("Score:");
        label8.setFont(new Font("System Bold", 14.0));

        imageView3.setFitHeight(30.0);
        imageView3.setFitWidth(30.0);
        imageView3.setLayoutX(112.0);
        imageView3.setLayoutY(334.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        label9.setLayoutX(382.0);
        label9.setLayoutY(333.0);
        label9.setPrefHeight(40.0);
        label9.setPrefWidth(277.0);
        label9.setStyle("-fx-background-color: D4D74C; -fx-background-radius: 50px;");

        label10.setLayoutX(560.0);
        label10.setLayoutY(341.0);
        label10.setText("Score:");
        label10.setFont(new Font("System Bold", 14.0));

        imageView4.setFitHeight(35.0);
        imageView4.setFitWidth(30.0);
        imageView4.setLayoutX(392.0);
        imageView4.setLayoutY(334.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        label11.setLayoutX(103.0);
        label11.setLayoutY(383.0);
        label11.setPrefHeight(40.0);
        label11.setPrefWidth(277.0);
        label11.setStyle("-fx-background-color: #4CD7D7; -fx-background-radius: 50px;");

        label12.setLayoutX(276.0);
        label12.setLayoutY(393.0);
        label12.setText("Score:");
        label12.setFont(new Font("System Bold", 14.0));

        imageView5.setFitHeight(30.0);
        imageView5.setFitWidth(30.0);
        imageView5.setLayoutX(110.0);
        imageView5.setLayoutY(391.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        label13.setLayoutX(382.0);
        label13.setLayoutY(383.0);
        label13.setPrefHeight(40.0);
        label13.setPrefWidth(277.0);
        label13.setStyle("-fx-background-color: #4CD7D7; -fx-background-radius: 50px;");

        label14.setLayoutX(560.0);
        label14.setLayoutY(393.0);
        label14.setText("Score:");
        label14.setFont(new Font("System Bold", 14.0));

        imageView6.setFitHeight(30.0);
        imageView6.setFitWidth(30.0);
        imageView6.setLayoutX(392.0);
        imageView6.setLayoutY(386.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        label15.setLayoutX(103.0);
        label15.setLayoutY(430.0);
        label15.setPrefHeight(40.0);
        label15.setPrefWidth(277.0);
        label15.setStyle("-fx-background-color: D74C97; -fx-background-radius: 50px;");

        label16.setLayoutX(276.0);
        label16.setLayoutY(439.0);
        label16.setText("Score:");
        label16.setFont(new Font("System Bold", 14.0));

        imageView7.setFitHeight(30.0);
        imageView7.setFitWidth(30.0);
        imageView7.setLayoutX(110.0);
        imageView7.setLayoutY(434.0);
        imageView7.setPickOnBounds(true);
        imageView7.setPreserveRatio(true);
        imageView7.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        label17.setLayoutX(382.0);
        label17.setLayoutY(430.0);
        label17.setPrefHeight(40.0);
        label17.setPrefWidth(277.0);
        label17.setStyle("-fx-background-color: D74C97; -fx-background-radius: 50px;");

        label18.setLayoutX(560.0);
        label18.setLayoutY(440.0);
        label18.setText("Score:");
        label18.setFont(new Font("System Bold", 14.0));

        imageView8.setFitHeight(30.0);
        imageView8.setFitWidth(30.0);
        imageView8.setLayoutX(392.0);
        imageView8.setLayoutY(436.0);
        imageView8.setPickOnBounds(true);
        imageView8.setPreserveRatio(true);
        imageView8.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        gameRecordLabel.setLayoutX(199.0);
        gameRecordLabel.setLayoutY(140.0);
        gameRecordLabel.setText("Lead Board");
        gameRecordLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gameRecordLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d74c97"));
        gameRecordLabel.setFont(new Font(70.0));

        imageView9.setFitHeight(150.0);
        imageView9.setFitWidth(200.0);
        imageView9.setLayoutX(281.0);
        imageView9.setLayoutY(5.0);
        imageView9.setPickOnBounds(true);
        imageView9.setPreserveRatio(true);
        imageView9.setImage(new Image(getClass().getResource("/images/logo.png").toExternalForm()));

        player1Name.setAlignment(javafx.geometry.Pos.CENTER);
        player1Name.setLayoutX(219.0);
        player1Name.setLayoutY(244.0);
        player1Name.setPrefHeight(27.0);
        player1Name.setPrefWidth(159.0);
        player1Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player1Name.setText("Player Name");

        player1scour.setAlignment(javafx.geometry.Pos.CENTER);
        player1scour.setLayoutX(509.0);
        player1scour.setLayoutY(245.0);
        player1scour.setPrefHeight(27.0);
        player1scour.setPrefWidth(48.0);
        player1scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player1scour.setText("0");
        player1scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        player2scour.setAlignment(javafx.geometry.Pos.CENTER);
        player2scour.setLayoutX(324.0);
        player2scour.setLayoutY(293.0);
        player2scour.setPrefHeight(27.0);
        player2scour.setPrefWidth(48.0);
        player2scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player2scour.setText("0");
        player2scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        player2Name.setAlignment(javafx.geometry.Pos.CENTER);
        player2Name.setLayoutX(143.0);
        player2Name.setLayoutY(293.0);
        player2Name.setPrefHeight(27.0);
        player2Name.setPrefWidth(129.0);
        player2Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player2Name.setText("Player Name");
        player2Name.setFont(new Font(12.0));

        player3Name.setAlignment(javafx.geometry.Pos.CENTER);
        player3Name.setLayoutX(426.0);
        player3Name.setLayoutY(293.0);
        player3Name.setPrefHeight(27.0);
        player3Name.setPrefWidth(129.0);
        player3Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player3Name.setText("Player Name");
        player3Name.setFont(new Font(12.0));

        player4Name.setAlignment(javafx.geometry.Pos.CENTER);
        player4Name.setLayoutX(140.0);
        player4Name.setLayoutY(338.0);
        player4Name.setPrefHeight(27.0);
        player4Name.setPrefWidth(129.0);
        player4Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player4Name.setText("Player Name");
        player4Name.setFont(new Font(12.0));

        player5Name.setAlignment(javafx.geometry.Pos.CENTER);
        player5Name.setLayoutX(424.0);
        player5Name.setLayoutY(337.0);
        player5Name.setPrefHeight(27.0);
        player5Name.setPrefWidth(129.0);
        player5Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player5Name.setText("Player Name");
        player5Name.setFont(new Font(12.0));

        player7Name.setAlignment(javafx.geometry.Pos.CENTER);
        player7Name.setLayoutX(428.0);
        player7Name.setLayoutY(390.0);
        player7Name.setPrefHeight(27.0);
        player7Name.setPrefWidth(129.0);
        player7Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player7Name.setText("Player Name");
        player7Name.setFont(new Font(12.0));

        player9Name.setAlignment(javafx.geometry.Pos.CENTER);
        player9Name.setLayoutX(426.0);
        player9Name.setLayoutY(436.0);
        player9Name.setPrefHeight(27.0);
        player9Name.setPrefWidth(129.0);
        player9Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player9Name.setText("Player Name");
        player9Name.setFont(new Font(12.0));

        player10Name.setAlignment(javafx.geometry.Pos.CENTER);
        player10Name.setLayoutX(307.0);
        player10Name.setLayoutY(492.0);
        player10Name.setPrefHeight(27.0);
        player10Name.setPrefWidth(129.0);
        player10Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player10Name.setText("Player Name");
        player10Name.setFont(new Font(12.0));

        player6Name.setAlignment(javafx.geometry.Pos.CENTER);
        player6Name.setLayoutX(140.0);
        player6Name.setLayoutY(390.0);
        player6Name.setPrefHeight(27.0);
        player6Name.setPrefWidth(129.0);
        player6Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player6Name.setText("Player Name");
        player6Name.setFont(new Font(12.0));

        player8Name.setAlignment(javafx.geometry.Pos.CENTER);
        player8Name.setLayoutX(140.0);
        player8Name.setLayoutY(438.0);
        player8Name.setPrefHeight(27.0);
        player8Name.setPrefWidth(129.0);
        player8Name.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player8Name.setText("Player Name");
        player8Name.setFont(new Font(12.0));

        player4scour.setAlignment(javafx.geometry.Pos.CENTER);
        player4scour.setLayoutX(324.0);
        player4scour.setLayoutY(340.0);
        player4scour.setPrefHeight(27.0);
        player4scour.setPrefWidth(48.0);
        player4scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player4scour.setText("0");
        player4scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        player6scour.setAlignment(javafx.geometry.Pos.CENTER);
        player6scour.setLayoutX(324.0);
        player6scour.setLayoutY(390.0);
        player6scour.setPrefHeight(27.0);
        player6scour.setPrefWidth(48.0);
        player6scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player6scour.setText("0");
        player6scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        player8scour.setAlignment(javafx.geometry.Pos.CENTER);
        player8scour.setLayoutX(324.0);
        player8scour.setLayoutY(436.0);
        player8scour.setPrefHeight(27.0);
        player8scour.setPrefWidth(48.0);
        player8scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player8scour.setText("0");
        player8scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        player3scour.setAlignment(javafx.geometry.Pos.CENTER);
        player3scour.setLayoutX(605.0);
        player3scour.setLayoutY(293.0);
        player3scour.setPrefHeight(27.0);
        player3scour.setPrefWidth(48.0);
        player3scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player3scour.setText("0");
        player3scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        player5scour.setAlignment(javafx.geometry.Pos.CENTER);
        player5scour.setLayoutX(605.0);
        player5scour.setLayoutY(338.0);
        player5scour.setPrefHeight(27.0);
        player5scour.setPrefWidth(48.0);
        player5scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player5scour.setText("0");
        player5scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        player7scour.setAlignment(javafx.geometry.Pos.CENTER);
        player7scour.setLayoutX(605.0);
        player7scour.setLayoutY(390.0);
        player7scour.setPrefHeight(27.0);
        player7scour.setPrefWidth(48.0);
        player7scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player7scour.setText("0");
        player7scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        player9scour.setAlignment(javafx.geometry.Pos.CENTER);
        player9scour.setLayoutX(607.0);
        player9scour.setLayoutY(436.0);
        player9scour.setPrefHeight(27.0);
        player9scour.setPrefWidth(48.0);
        player9scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player9scour.setText("0");
        player9scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        player10scour.setAlignment(javafx.geometry.Pos.CENTER);
        player10scour.setLayoutX(485.0);
        player10scour.setLayoutY(492.0);
        player10scour.setPrefHeight(27.0);
        player10scour.setPrefWidth(48.0);
        player10scour.setStyle("-fx-border-color: #000; -fx-border-radius: 40;");
        player10scour.setText("0");
        player10scour.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);

        backBtn.setAccessibleText("about");
        backBtn.setId("backBtn");
        backBtn.setLayoutX(14.0);
        backBtn.setLayoutY(511.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setOnAction(this::back);
        backBtn.setPrefHeight(47.0);
        backBtn.setPrefWidth(85.0);
        backBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 40;");
        backBtn.setText("Back");
        backBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        backBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        backBtn.setWrapText(true);
        backBtn.setFont(new Font(22.0));

        label19.setId("ticTacToe");
        label19.setLayoutX(57.0);
        label19.setLayoutY(56.0);
        label19.setText("X");
        label19.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label19.setTextFill(javafx.scene.paint.Color.valueOf("#ffc201"));

        motionBlur.setRadius(3.0);
        label19.setEffect(motionBlur);

        label110.setId("ticTacToe");
        label110.setLayoutX(664.0);
        label110.setLayoutY(164.0);
        label110.setText("O");
        label110.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label110.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));

        motionBlur0.setRadius(3.0);
        label110.setEffect(motionBlur0);

        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(imageView);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(imageView0);
        getChildren().add(imageView1);
        getChildren().add(label5);
        getChildren().add(label6);
        getChildren().add(imageView2);
        getChildren().add(label7);
        getChildren().add(label8);
        getChildren().add(imageView3);
        getChildren().add(label9);
        getChildren().add(label10);
        getChildren().add(imageView4);
        getChildren().add(label11);
        getChildren().add(label12);
        getChildren().add(imageView5);
        getChildren().add(label13);
        getChildren().add(label14);
        getChildren().add(imageView6);
        getChildren().add(label15);
        getChildren().add(label16);
        getChildren().add(imageView7);
        getChildren().add(label17);
        getChildren().add(label18);
        getChildren().add(imageView8);
        getChildren().add(gameRecordLabel);
        getChildren().add(imageView9);
        getChildren().add(player1Name);
        getChildren().add(player1scour);
        getChildren().add(player2scour);
        getChildren().add(player2Name);
        getChildren().add(player3Name);
        getChildren().add(player4Name);
        getChildren().add(player5Name);
        getChildren().add(player7Name);
        getChildren().add(player9Name);
        getChildren().add(player10Name);
        getChildren().add(player6Name);
        getChildren().add(player8Name);
        getChildren().add(player4scour);
        getChildren().add(player6scour);
        getChildren().add(player8scour);
        getChildren().add(player3scour);
        getChildren().add(player5scour);
        getChildren().add(player7scour);
        getChildren().add(player9scour);
        getChildren().add(player10scour);
        getChildren().add(backBtn);
        getChildren().add(label19);
        getChildren().add(label110);

    }

   protected void back(javafx.event.ActionEvent actionEvent)
    {  
        signInScr.chooseModeScreen(actionEvent);
    }

}
