package tictactoe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SignInScr extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final Label label;
    protected final AnchorPane anchorPane0;
    protected final TextField userNameTxt;
    protected final ImageView imageView0;
    protected final Label signInLabel;
    protected final ImageView imageView1;
    protected final PasswordField passwordTxt;
    protected final Button button;
    protected final Label label1;
    protected final Label signUpTxt;
    protected final Label label3;
    protected final Label geustTxt;
    
    private SignUpScr signUpSrc;
    private ChooseModeScr chooseModeSrc;
    private Stage stage;
    private Scene scene;
    Clint clint = Clint.obj();
   

    public SignInScr(Stage _stage) {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        label = new Label();
        anchorPane0 = new AnchorPane();
        userNameTxt = new TextField();
        imageView0 = new ImageView();
        signInLabel = new Label();
        imageView1 = new ImageView();
        passwordTxt = new PasswordField();
        button = new Button();
        label1 = new Label();
        signUpTxt = new Label();
        label3 = new Label();
        geustTxt = new Label();

        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(750.0);

        anchorPane.setMaxHeight(USE_PREF_SIZE);
        anchorPane.setMaxWidth(USE_PREF_SIZE);
        anchorPane.setMinHeight(USE_PREF_SIZE);
        anchorPane.setMinWidth(USE_PREF_SIZE);
        anchorPane.setPrefHeight(600.0);
        anchorPane.setPrefWidth(750.0);

        imageView.setFitHeight(165.0);
        imageView.setFitWidth(206.0);
        imageView.setLayoutX(448.0);
        imageView.setLayoutY(112.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/images/logo.png").toExternalForm()));

        label.setId("ticTacToe");
        label.setLayoutX(384.0);
        label.setLayoutY(300.0);
        label.setText("Tic Tac Toe");
        label.setFont(new Font(70.0));
        BorderPane.setMargin(anchorPane, new Insets(0.0, 350.0, 0.0, 0.0));
        label.setTextFill(new LinearGradient(
            0, 0, 1, 0, true,  
            javafx.scene.paint.CycleMethod.NO_CYCLE,  
            new Stop(0, Color.rgb(255, 194, 1)),  
            new Stop(1, Color.rgb(215, 41, 120))
        ));
        setCenter(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(453.0);
        anchorPane0.setPrefWidth(323.0);
        anchorPane0.setStyle("-fx-background-color: E1C15C; -fx-background-radius: 40;");

        userNameTxt.setAlignment(javafx.geometry.Pos.CENTER);
        userNameTxt.setLayoutX(86.0);
        userNameTxt.setLayoutY(91.0);
        userNameTxt.setPrefHeight(38.0);
        userNameTxt.setPrefWidth(217.0);
        userNameTxt.setPromptText("User Name");
        userNameTxt.setStyle("-fx-background-radius: 40;");

        imageView0.setFitHeight(61.0);
        imageView0.setFitWidth(60.0);
        imageView0.setLayoutX(14.0);
        imageView0.setLayoutY(80.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        signInLabel.setLayoutX(112.0);
        signInLabel.setLayoutY(14.0);
        signInLabel.setText("Sign In");
        signInLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        signInLabel.setFont(new Font(38.0));

        imageView1.setFitHeight(55.0);
        imageView1.setFitWidth(60.0);
        imageView1.setLayoutX(17.0);
        imageView1.setLayoutY(176.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/images/padlock_301677.png").toExternalForm()));

        passwordTxt.setAlignment(javafx.geometry.Pos.CENTER);
        passwordTxt.setLayoutX(86.0);
        passwordTxt.setLayoutY(185.0);
        passwordTxt.setPrefHeight(38.0);
        passwordTxt.setPrefWidth(217.0);
        passwordTxt.setPromptText("Password");
        passwordTxt.setStyle("-fx-background-radius: 40;");

        button.setLayoutX(115.0);
        button.setLayoutY(275.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::signIn);
        button.setStyle("-fx-background-color: D72978; -fx-background-radius: 40;");
        button.setText("Sign In");
        button.setTextFill(javafx.scene.paint.Color.WHITE);
        button.setFont(new Font(25.0));

        label1.setLayoutX(72.0);
        label1.setLayoutY(359.0);
        label1.setText("Don't have account?");
        label1.setTextFill(javafx.scene.paint.Color.WHITE);

        signUpTxt.setLayoutX(205.0);
        signUpTxt.setLayoutY(355.0);
        signUpTxt.setOnMouseClicked(this::signUp);
        signUpTxt.setText("Sign Up");
        signUpTxt.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        signUpTxt.setFont(new Font(18.0));

        label3.setLayoutX(100.0);
        label3.setLayoutY(395.0);
        label3.setText("or play as a");
        label3.setTextFill(javafx.scene.paint.Color.WHITE);

        geustTxt.setLayoutX(175.0);
        geustTxt.setLayoutY(392.0);
        geustTxt.setOnMouseClicked(this::guest);
        geustTxt.setText("Guest");
        geustTxt.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        geustTxt.setFont(new Font(18.0));
        BorderPane.setMargin(anchorPane0, new Insets(50.0, 0.0, 50.0, 20.0));
        setLeft(anchorPane0);

        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(label);
        anchorPane0.getChildren().add(userNameTxt);
        anchorPane0.getChildren().add(imageView0);
        anchorPane0.getChildren().add(signInLabel);
        anchorPane0.getChildren().add(imageView1);
        anchorPane0.getChildren().add(passwordTxt);
        anchorPane0.getChildren().add(button);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(signUpTxt);
        anchorPane0.getChildren().add(label3);
        anchorPane0.getChildren().add(geustTxt);

    }
    
    protected void chooseModeScreen (Event action)
    {
        chooseModeSrc = new ChooseModeScr(stage);
        chooseModeSrc.setId("backG");
        stage = (Stage)((Node)action.getSource()).getScene().getWindow();
        scene = new Scene(chooseModeSrc,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

   protected void signIn(ActionEvent actionEvent)
    {
        try 
        {
            clint.stablishConnection();
            clint.sendsignIn(userNameTxt.getText(), passwordTxt.getText());
        } catch (IOException ex) 
        {
            Logger.getLogger(SignInScr.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        clint.readFromServer();
        if (clint.isExist)
        {                    
            chooseModeScreen(actionEvent);
        } 
         else
         {
            Platform.runLater(() ->
            {
              showAlert("Incorrect user name or password",
                             "Please Check user name and Password", "ok");
             try 
             {
                 clint.closeConnection();
             } 
             catch (IOException ex) 
             {
                 Logger.getLogger(SignInScr.class.getName()).log(Level.SEVERE, null, ex);
             }

            });
         }
        

    }
       

    protected void signUp(javafx.scene.input.MouseEvent mouseEvent)
    {
        signUpSrc = new SignUpScr(stage);
        signUpSrc.setId("backG");
        stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        scene = new Scene(signUpSrc,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        
    }

    protected void guest(Event mouseEvent)
    {
        chooseModeScreen(mouseEvent);
        chooseModeSrc.button3.setVisible(false);
        chooseModeSrc.button1.setVisible(false);
        
    }
    private void showAlert(String title, String message, String buttonText) 
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        ButtonType button = new ButtonType(buttonText);
        alert.getButtonTypes().setAll(button);
        alert.showAndWait();
    }

}
