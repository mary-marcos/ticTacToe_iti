package tictactoe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

public class OnlineScr extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView icon;
    protected final Label onlineLabel;
    protected final Label label;
    protected final MotionBlur motionBlur;
    protected final Label label0;
    protected final MotionBlur motionBlur0;
    protected final AnchorPane anchorPane0;
    protected final TableView onlineTabel;
    protected final TableColumn playerNameC;
    protected final TableColumn status;
    protected final TableColumn Avilability;
    protected final Button backBtn;
    MultiPlayerModeSrc multiPlayerModeSrc;
    Stage stage;
    Scene scene;
    protected Clint clint;
//    Thread myThread;
    
    public OnlineScr(Stage _stage) {
        

        anchorPane = new AnchorPane();
        icon = new ImageView();
        onlineLabel = new Label();
        label = new Label();
        motionBlur = new MotionBlur();
        label0 = new Label();
        motionBlur0 = new MotionBlur();
        anchorPane0 = new AnchorPane();
        onlineTabel = new TableView();
        playerNameC = new TableColumn();
        status = new TableColumn();
        Avilability = new TableColumn();
        backBtn = new Button();
        stage = _stage;
        clint = Clint.obj();
//        myThread = new Thread(() -> {
//            while(true){
//                try {
//                    clint.readinvitation();
//                } catch (IOException ex) {
//                    Logger.getLogger(OnlineScr.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//         myThread.start();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(570.0);
        setPrefWidth(750.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(232.0);
        anchorPane.setPrefWidth(750.0);

        icon.setFitHeight(150.0);
        icon.setFitWidth(200.0);
        icon.setLayoutX(283.0);
        icon.setLayoutY(5.0);
        icon.setPickOnBounds(true);
        icon.setPreserveRatio(true);
        icon.setImage(new Image(getClass().getResource("/images/logo.png").toExternalForm()));

        onlineLabel.setId("ticTacToe");
        onlineLabel.setLayoutX(283.0);
        onlineLabel.setLayoutY(140.0);
        onlineLabel.setPrefHeight(103.0);
        onlineLabel.setPrefWidth(212.0);
        onlineLabel.setText("Online");
        onlineLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        onlineLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        onlineLabel.setWrapText(true);
        onlineLabel.setFont(new Font(70.0));

        label.setId("ticTacToe");
        label.setLayoutX(47.0);
        label.setLayoutY(46.0);
        label.setText("X");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#ffc201"));

        motionBlur.setRadius(3.0);
        label.setEffect(motionBlur);

        label0.setId("ticTacToe");
        label0.setLayoutX(654.0);
        label0.setLayoutY(154.0);
        label0.setText("O");
        label0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));

        motionBlur0.setRadius(3.0);
        label0.setEffect(motionBlur0);
        setTop(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(332.0);
        anchorPane0.setPrefWidth(750.0);

        onlineTabel.setLayoutX(130.0);
        onlineTabel.setLayoutY(13.0);
        onlineTabel.setPrefHeight(301.0);
        onlineTabel.setPrefWidth(491.0);
        onlineTabel.setStyle("-fx-background-color: #FFD758;");

        playerNameC.setPrefWidth(190.0);
        playerNameC.setStyle("-fx-border-color: #000; -fx-background-color: #FFD758;");
        playerNameC.setText("Player Name");

        status.setPrefWidth(113.0);
        status.setStyle("-fx-background-color: #FFD758; -fx-border-color: #000;");
        status.setText("Status");

        Avilability.setPrefWidth(185.5);
        Avilability.setStyle("-fx-background-color: #FFD758; -fx-border-color: #000;");
        Avilability.setText("Avilability");

        backBtn.setAccessibleText("about");
        backBtn.setId("backBtn");
        backBtn.setLayoutX(5.0);
        backBtn.setLayoutY(268.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setOnAction(this::back);
        backBtn.setPrefHeight(54.0);
        backBtn.setPrefWidth(96.0);
        backBtn.setStyle("-fx-background-color: #d72978; -fx-background-radius: 40;");
        backBtn.setText("Back");
        backBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        backBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        backBtn.setWrapText(true);
        backBtn.setFont(new Font(25.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(icon);
        anchorPane.getChildren().add(onlineLabel);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(label0);
        onlineTabel.getColumns().add(playerNameC);
        onlineTabel.getColumns().add(status);
        onlineTabel.getColumns().add(Avilability);
        anchorPane0.getChildren().add(onlineTabel);
        anchorPane0.getChildren().add(backBtn);

       playerNameC.setCellValueFactory(new PropertyValueFactory<Users, String>("userName"));
       status.setCellValueFactory(new PropertyValueFactory<Users, String>("status"));
       Avilability.setCellValueFactory(new PropertyValueFactory<Users, String>("availableity"));
       
       onlineTabel.getItems().addAll(clint.usersData);
       
       playerNameC.setCellFactory(new Callback<TableColumn<Users, String>, TableCell<Users, String>>() {
            @Override
            public TableCell<Users, String> call(TableColumn<Users, String> param) {
                return new TableCell<Users, String>() {
                    @Override
                    protected void updateItem(String userName, boolean empty) {
                        super.updateItem(userName, empty);
                        if (empty || userName == null) {
                            setText(null);
                        } else {
                            setText(userName);
                            setOnMouseClicked(event -> {
                                  if (!isEmpty() && event.getClickCount() == 2) {

                                      try {
                                          clint.sendUsersForRequist(userName);
                                          System.out.println("from Online sce "+userName);
                                      } catch (IOException ex) {
                                          Logger.getLogger(OnlineScr.class.getName()).log(Level.SEVERE, null, ex);
                                      }
                                  }
                                
                            });
                        }
                    }
                };
            }
        });
    }

    protected void back(ActionEvent actionEvent)
    {
        multiPlayerModeSrc = new MultiPlayerModeSrc(stage);
        multiPlayerModeSrc.setId("backG");
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(multiPlayerModeSrc,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        clint.myThread.suspend();
    }
    
    protected void toGameScreen(String reply)
    {
        if (reply.equals("Challenge accepted"))
        {
             GameOnlineSrc gameOnlineScr = new GameOnlineSrc(stage);
             gameOnlineScr.setId("backG");
            scene = new Scene(multiPlayerModeSrc,750,570);
            scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        }
    }
        
        

}
