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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SignUpScr extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Pane pane;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final TextField user_Name;
    protected final TextField E_Mail;
    protected final Label haveAcc;
    protected final Label label;
    protected final PasswordField passwordField;
    protected final PasswordField rePasswordField;
    protected final Button signUpBtn;
    protected final Label signInLabel;
    protected final Label userNameWarning;
    protected final Label EMailWarning;
    protected final Label passwordWarning;
    protected final Label rePasswordWarning;
    protected final ImageView imageView3;
    protected final Label ticTacToe;
    
    private SignInScr signInSrc;
    private Stage stage;
    private Scene scene;
    Clint clint;
    boolean successfulSignUp = false;

    public SignUpScr(Stage stage) {

        anchorPane = new AnchorPane();
        pane = new Pane();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        user_Name = new TextField();
        E_Mail = new TextField();
        haveAcc = new Label();
        label = new Label();
        passwordField = new PasswordField();
        rePasswordField = new PasswordField();
        signUpBtn = new Button();
        signInLabel = new Label();
        userNameWarning = new Label();
        EMailWarning = new Label();
        passwordWarning = new Label();
        rePasswordWarning = new Label();
        imageView3 = new ImageView();
        ticTacToe = new Label();
        
        clint = Clint.obj();
        anchorPane.setId("AnchorPane");
        anchorPane.setPrefHeight(534.0);
        anchorPane.setPrefWidth(752.0);

        pane.setLayoutX(33.0);
        pane.setLayoutY(57.0);
        pane.setPrefHeight(481.0);
        pane.setPrefWidth(323.0);
        pane.setStyle("-fx-background-color: E1C15C; -fx-background-radius: 20PX;");

        imageView.setFitHeight(44.0);
        imageView.setFitWidth(44.0);
        imageView.setLayoutX(9.0);
        imageView.setLayoutY(67.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        imageView0.setFitHeight(35.0);
        imageView0.setFitWidth(58.0);
        imageView0.setLayoutX(14.0);
        imageView0.setLayoutY(138.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/images/email_10678225.png").toExternalForm()));

        imageView1.setFitHeight(42.0);
        imageView1.setFitWidth(44.0);
        imageView1.setLayoutX(10.0);
        imageView1.setLayoutY(205.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("/images/padlock_301677.png").toExternalForm()));

        imageView2.setFitHeight(44.0);
        imageView2.setFitWidth(46.0);
        imageView2.setLayoutX(10.0);
        imageView2.setLayoutY(272.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("/images/reset-password_6195699.png").toExternalForm()));

        user_Name.setAlignment(javafx.geometry.Pos.CENTER);
        user_Name.setLayoutX(75.0);
        user_Name.setLayoutY(75.0);
        user_Name.setPrefHeight(38.0);
        user_Name.setPrefWidth(217.0);
        user_Name.setPromptText("user Name");
        user_Name.setStyle("-fx-background-radius: 40;");

        E_Mail.setAlignment(javafx.geometry.Pos.CENTER);
        E_Mail.setLayoutX(74.0);
        E_Mail.setLayoutY(141.0);
        E_Mail.setPrefHeight(38.0);
        E_Mail.setPrefWidth(217.0);
        E_Mail.setPromptText("E-Mail");
        E_Mail.setStyle("-fx-background-radius: 40;");

        haveAcc.setLayoutX(70.0);
        haveAcc.setLayoutY(430.0);
        haveAcc.setText("Have an account ?");
        haveAcc.setTextFill(javafx.scene.paint.Color.WHITE);

        label.setLayoutX(114.0);
        label.setLayoutY(14.0);
        label.setText("Sing Up");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("AGA Arabesque", 32.0));

        passwordField.setAlignment(javafx.geometry.Pos.CENTER);
        passwordField.setLayoutX(74.0);
        passwordField.setLayoutY(211.0);
        passwordField.setPrefHeight(38.0);
        passwordField.setPrefWidth(217.0);
        passwordField.setPromptText("Password");
        passwordField.setStyle("-fx-background-radius: 40;");

        rePasswordField.setAlignment(javafx.geometry.Pos.CENTER);
        rePasswordField.setLayoutX(74.0);
        rePasswordField.setLayoutY(279.0);
        rePasswordField.setPrefHeight(38.0);
        rePasswordField.setPrefWidth(217.0);
        rePasswordField.setPromptText("Repeat password");
        rePasswordField.setStyle("-fx-background-radius: 40;");

        signUpBtn.setAlignment(javafx.geometry.Pos.CENTER);
        signUpBtn.setLayoutX(108.0);
        signUpBtn.setLayoutY(350.0);
        signUpBtn.setMnemonicParsing(false);
        signUpBtn.setOnAction(this::signUp);
        signUpBtn.setPrefHeight(54.0);
        signUpBtn.setPrefWidth(122.0);
        signUpBtn.setStyle("-fx-background-color: #D72978; -fx-background-radius: 40;");
        signUpBtn.setText("Sign UP");
        signUpBtn.setTextFill(javafx.scene.paint.Color.WHITE);
        signUpBtn.setFont(new Font(25.0));

        signInLabel.setLayoutX(187.0);
        signInLabel.setLayoutY(426.0);
        signInLabel.setOnMouseClicked(this::backToSignIn);
        signInLabel.setText("Sign In");
        signInLabel.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        signInLabel.setFont(new Font(18.0));

        userNameWarning.setLayoutX(90.0);
        userNameWarning.setLayoutY(120.0);
        userNameWarning.setText("User name shouldn't have spaces");
        userNameWarning.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        userNameWarning.setTextFill(javafx.scene.paint.Color.valueOf("#f00808"));
        userNameWarning.setFont(new Font(12.0));
        userNameWarning.setVisible(false);

        EMailWarning.setLayoutX(90.0);
        EMailWarning.setLayoutY(184.0);
        EMailWarning.setText("User name shouldn't have spaces");
        EMailWarning.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        EMailWarning.setTextFill(javafx.scene.paint.Color.valueOf("#f00808"));
        EMailWarning.setFont(new Font(12.0));
        EMailWarning.setVisible(false);

        passwordWarning.setLayoutX(90.0);
        passwordWarning.setLayoutY(255.0);
        passwordWarning.setText("User name shouldn't have spaces");
        passwordWarning.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        passwordWarning.setTextFill(javafx.scene.paint.Color.valueOf("#f00808"));
        passwordWarning.setFont(new Font(12.0));
        passwordWarning.setVisible(false);

        rePasswordWarning.setLayoutX(115.0);
        rePasswordWarning.setLayoutY(320.0);
        rePasswordWarning.setText("Must match password");
        rePasswordWarning.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        rePasswordWarning.setTextFill(javafx.scene.paint.Color.valueOf("#f00808"));
        rePasswordWarning.setFont(new Font(12.0));
        rePasswordWarning.setVisible(false);

        imageView3.setFitHeight(112.0);
        imageView3.setFitWidth(134.0);
        imageView3.setLayoutX(449.0);
        imageView3.setLayoutY(114.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("/images/logo.png").toExternalForm()));

        ticTacToe.setId("ticTacToe");
        ticTacToe.setLayoutX(360.0);
        ticTacToe.setLayoutY(240.0);
        ticTacToe.setText("Tic Tac Toe");
        ticTacToe.setFont(new Font(70.0));
        ticTacToe.setTextFill(new LinearGradient(
            0, 0, 1, 0, true,  
            javafx.scene.paint.CycleMethod.NO_CYCLE,  
            new Stop(0, Color.rgb(255, 194, 1)),  
            new Stop(1, Color.rgb(215, 41, 120))
        ));
        setCenter(anchorPane);

        pane.getChildren().add(imageView);
        pane.getChildren().add(imageView0);
        pane.getChildren().add(imageView1);
        pane.getChildren().add(imageView2);
        pane.getChildren().add(user_Name);
        pane.getChildren().add(E_Mail);
        pane.getChildren().add(haveAcc);
        pane.getChildren().add(label);
        pane.getChildren().add(passwordField);
        pane.getChildren().add(rePasswordField);
        pane.getChildren().add(signUpBtn);
        pane.getChildren().add(signInLabel);
        pane.getChildren().add(userNameWarning);
        pane.getChildren().add(EMailWarning);
        pane.getChildren().add(passwordWarning);
        pane.getChildren().add(rePasswordWarning);
        anchorPane.getChildren().add(pane);
        anchorPane.getChildren().add(imageView3);
        anchorPane.getChildren().add(ticTacToe);

    }

    protected void signUp(ActionEvent actionEvent) {
        
        emptyWarnings();
        if (checkUserName())
        {
            if (checkEMail())
            {
                if (checkPassword())
                {
                    if (checkRePassword())
                    {
                        checkDublicatedUser();
                        if (successfulSignUp)
                        {
                            stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                            navigateToSignIn();
                        }
                    }
                }
                    
                    
            }
        }
        
    }

    protected void backToSignIn(MouseEvent mouseEvent)
    {
        stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        navigateToSignIn();
        
    }
    private void navigateToSignIn() {
        signInSrc = new SignInScr(stage);
        signInSrc.setId("backG");
        scene = new Scene(signInSrc, 750, 570);
        scene.getStylesheets().add(getClass().getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
   
    
    private void showAlert(String title, String message, String buttonText) 
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        ButtonType button = new ButtonType(buttonText);
        alert.getButtonTypes().setAll(button);
        alert.showAndWait().ifPresent(buttonType -> {
            if (buttonType == button) {
                alert.close();
            }
        });
    }
    private void checkDublicatedUser()
    {
        try 
        {
            clint.stablishConnection();
            clint.sendUserName(user_Name.getText());
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(SignUpScr.class.getName()).log(Level.SEVERE, null, ex);
        }
        clint.readFromServer();

        if (!clint.isRepeated) 
        {
            try 
            {
                clint.sendsignup(user_Name.getText(),passwordField.getText(), E_Mail.getText());
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(SignUpScr.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            showAlert("Successful", "Signed up Successfully", "ok");

            successfulSignUp = true;
        } 
        else 
        {
            Platform.runLater(() -> 
            showAlert("Duplicated user name", "Please choose another user name", "ok")
            );
            try 
            {
                clint.closeConnection();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(SignUpScr.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private boolean checkUserName()
    {
        if (user_Name.getText().contains(" "))
        {
            userNameWarning.setText("Spaces are not allowed");
            userNameWarning.setVisible(true);
            return false;
        }
        else if (user_Name.getText().length() < 2)
        {
            userNameWarning.setText("User name should be more than 1 char");
            userNameWarning.setVisible(true);
            return false;
        }
        else
        {
            return true;
        }
    }

    private boolean checkEMail()
    {
        if (!E_Mail.getText().contains(".com") || !E_Mail.getText().contains("@")||
                E_Mail.getText().contains(" "))
        {
            EMailWarning.setText("Enter a correct E-mail please");
            EMailWarning.setVisible(true);
            return false;
        }
        else 
        {
            return true;
        }
    }
    
    private boolean checkPassword()
    {
        if (passwordField.getText().contains(" "))
        {
            passwordWarning.setText("Spaces are not allowed");
            passwordWarning.setVisible(true);
            return false;
        }
        else if (passwordField.getText().length() < 8)
        {
            passwordWarning.setText("Password should be more than 7 characters");
            passwordWarning.setVisible(true);
            
            return false;
        }
        else 
        {
            return true;
        }
    }
    
    private boolean checkRePassword()
    {
        if (!passwordField.getText().equals(rePasswordField.getText()))
        {
            rePasswordWarning.setVisible(true);
            return false;
        }
        else
        {
            return true;
        }
    }
    private void emptyWarnings()
    {
        userNameWarning.setText("");
        EMailWarning.setText("");
        passwordWarning.setText("");
        rePasswordWarning.setText("");
    }
}
