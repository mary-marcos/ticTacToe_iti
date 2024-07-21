package tictactoe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class GameOnlineSrc extends AnchorPane implements Runnable {

    boolean isXTurn;
    protected final Label label;
    protected final Label label0;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button btn1;
    protected final Button btn4;
    protected final Button btn03;
    protected final Button btn7;
    protected final Button btn6;
    protected final Button btn9;
    protected final Button btn2;
    protected final Button btn5;
    protected final Button btn8;
    protected final Label label1;
    protected final Label label2;
    protected final Button RecordBtn;
    protected final Button ScreenShotBtn;
    protected final Button backBtn;
    protected final TextArea textArea;
    protected final TextField chat_txt;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;
    protected final StackPane triangleButtonPane;
    protected final Button triangleButton;
   
    private String[][] board;

    // Thread thread;
    Socket so;
    DataInputStream din;
    DataOutputStream dout;
    MultiPlayerModeSrc multiplaysrc;
    Stage stage;
     private Scene scene;

    public GameOnlineSrc(Stage stage) {
        this.stage=stage;
        try {
            so = new Socket("10.178.240.79", 5005);
            din = new DataInputStream(so.getInputStream());
            dout = new DataOutputStream(so.getOutputStream());

        } catch (IOException ex) {
            Logger.getLogger(GameOnlineSrc.class.getName()).log(Level.SEVERE, null, ex);
        }

        label = new Label();
        label0 = new Label();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        btn1 = new Button();
        btn4 = new Button();
        btn03 = new Button();
        btn7 = new Button();
        btn6 = new Button();
        btn9 = new Button();
        btn2 = new Button();
        btn5 = new Button();
        btn8 = new Button();
        label1 = new Label();
        label2 = new Label();
        RecordBtn = new Button();
        ScreenShotBtn = new Button();
        backBtn = new Button();
        textArea = new TextArea();
        chat_txt = new TextField();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        triangleButtonPane = new StackPane();
        triangleButton = new Button();
        Thread t = new Thread(this);
        t.start();

        setId("ticTacToe");
        setPrefHeight(570.0);
        setPrefWidth(750.0);
        setStyle("-fx-border-color: black;");

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setId("ticTacToe");
        label.setLayoutX(100.0);
        label.setLayoutY(32.0);
        label.setPrefHeight(47.0);
        label.setPrefWidth(570.0);
        label.setText("multi players online");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        label.setFont(new Font(17.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setId("black");
        label0.setLayoutX(402.0);
        label0.setLayoutY(121.0);
        label0.setPrefHeight(27.0);
        label0.setPrefWidth(58.0);
        label0.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        label0.setText("0");
        label0.setFont(new Font(20.0));

        gridPane.setLayoutX(44.0);
        gridPane.setLayoutY(215.0);
        gridPane.setPrefHeight(252.0);
        gridPane.setPrefWidth(387.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        initializeButton(gridPane, btn1, 0, 0);
        initializeButton(gridPane, btn2, 0, 1);
        initializeButton(gridPane, btn03, 0, 2);
        initializeButton(gridPane, btn4, 1, 0);
        initializeButton(gridPane, btn5, 1, 1);
        initializeButton(gridPane, btn6, 1, 2);
        initializeButton(gridPane, btn7, 2, 0);
        initializeButton(gridPane, btn8, 2, 1);
        initializeButton(gridPane, btn9, 2, 2);

        label1.setId("yellow2");
        label1.setLayoutX(215.0);
        label1.setLayoutY(154.0);
        label1.setText("x");
        label1.setFont(new Font(18.0));

        label2.setId("pink");
        label2.setLayoutX(543.0);
        label2.setLayoutY(154.0);
        label2.setText("o");
        label2.setFont(new Font(18.0));

        RecordBtn.setLayoutX(323.0);
        RecordBtn.setLayoutY(512.0);
        RecordBtn.setMnemonicParsing(false);
        RecordBtn.setPrefHeight(38.0);
        RecordBtn.setPrefWidth(103.0);
        RecordBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        RecordBtn.setText("Record Game");
        RecordBtn.setTextFill(javafx.scene.paint.Color.valueOf("#f2f2f2"));

        ScreenShotBtn.setLayoutX(517.0);
        ScreenShotBtn.setLayoutY(512.0);
        ScreenShotBtn.setMnemonicParsing(false);
        ScreenShotBtn.setPrefHeight(38.0);
        ScreenShotBtn.setPrefWidth(103.0);
        ScreenShotBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        ScreenShotBtn.setText("Screen Shot");
        ScreenShotBtn.setTextFill(javafx.scene.paint.Color.valueOf("#fffefe"));

        backBtn.setLayoutX(117.0);
        backBtn.setLayoutY(512.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(103.0);
        backBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        backBtn.setText("back");
        backBtn.setTextFill(javafx.scene.paint.Color.valueOf("#fffafa"));
       backBtn.setOnAction(
                this::multiplaysrc);

        AnchorPane.setBottomAnchor(textArea, 155.0);
        textArea.setLayoutX(479.0);
        textArea.setLayoutY(215.0);
        textArea.setPrefHeight(197.0);
        textArea.setPrefWidth(200.0);
        textArea.setStyle("-fx-border-color: black; -fx-border-radius: 10px; -fx-background-radius: 60px;");

        chat_txt.setLayoutX(479.0);
        chat_txt.setLayoutY(422.0);
        chat_txt.setPrefHeight(38.0);
        chat_txt.setPrefWidth(200.0);
        chat_txt.setStyle("-fx-border-color: black; -fx-border-radius: 10px; -fx-background-radius: 15px;");

        label3.setAlignment(javafx.geometry.Pos.CENTER);
        label3.setId("black");
        label3.setLayoutX(291.0);
        label3.setLayoutY(123.0);
        label3.setPrefHeight(27.0);
        label3.setPrefWidth(58.0);
        label3.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        label3.setText("0");
        label3.setFont(new Font(18.0));

        label4.setId("black");
        label4.setLayoutX(374.0);
        label4.setLayoutY(127.0);
        label4.setText(":");
        label4.setFont(new Font(18.0));

        label5.setLayoutX(187.0);
        label5.setLayoutY(114.0);
        label5.setText("player 1");
        label5.setTextFill(javafx.scene.paint.Color.valueOf("#fffefe"));
        label5.setFont(new Font(18.0));

        label6.setLayoutX(511.0);
        label6.setLayoutY(108.0);
        label6.setText("player 2");
        label6.setTextFill(javafx.scene.paint.Color.valueOf("#fffefe"));
        label6.setFont(new Font(18.0));

        // Triangle button setup
        triangleButtonPane.setLayoutX(684.0);
        triangleButtonPane.setLayoutY(422.0);
        triangleButtonPane.setPrefHeight(38.0);
        triangleButtonPane.setPrefWidth(38.0);

        triangleButton.setMnemonicParsing(false);
        triangleButton.setPrefHeight(38.0);
        triangleButton.setPrefWidth(38.0);
        triangleButton.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 50%;");
        triangleButton.setText("▶");
        triangleButton.setFont(new Font(20.0));
        triangleButton.setTextFill(javafx.scene.paint.Color.valueOf("#fffafa"));

        triangleButtonPane.getChildren().add(triangleButton);

        getChildren().add(label);
        getChildren().add(label0);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(btn1);
        gridPane.getChildren().add(btn4);
        gridPane.getChildren().add(btn03);
        gridPane.getChildren().add(btn7);
        gridPane.getChildren().add(btn6);
        gridPane.getChildren().add(btn9);
        gridPane.getChildren().add(btn2);
        gridPane.getChildren().add(btn5);
        gridPane.getChildren().add(btn8);
        getChildren().add(gridPane);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(RecordBtn);
        getChildren().add(ScreenShotBtn);
        getChildren().add(backBtn);
        getChildren().add(textArea);
        getChildren().add(chat_txt);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(label5);
        getChildren().add(label6);
        getChildren().add(triangleButtonPane);
        board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "";
            }
        }

        isXTurn = true;

       
    }
    protected void multiplaysrc(ActionEvent action)
    {
        multiplaysrc = new MultiPlayerModeSrc(stage);
        multiplaysrc.setId("backG");
        stage = (Stage)((Node) action.getSource()).getScene().getWindow();
        scene = new Scene(multiplaysrc,750,570);
        scene.getStylesheets().add(getClass()
                .getResource("/style/CSS_StyleSheet.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    private void initializeButton(GridPane gridPane, Button button, int row, int column) {
        button.setMnemonicParsing(false);
        button.setPrefHeight(84.0);
        button.setPrefWidth(113.0);
        button.setStyle("-fx-background-color: white;");
        button.getStyleClass().add("ticTacToe");
        GridPane.setMargin(button, new Insets(5.0));
        GridPane.setRowIndex(button, row);
        GridPane.setColumnIndex(button, column);
        button.setFont(new Font(9.0));
        button.setId("yellow2");
        button.setOnAction(this::handleButtonAction);
    }

    public void handleButtonAction(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        
        checksbutton(clickedButton);
     
    }

    public void checksbutton(Button clickedButton) {

        if (clickedButton.getText().isEmpty()) {

            int row = GridPane.getRowIndex(clickedButton);
            int col = GridPane.getColumnIndex(clickedButton);

           
            String player = isXTurn ? "X" : "O";

            String move = "move," + row + "," + col + "," + player;
            
            try {
                
                dout.writeUTF(move);
                dout.flush();

            } catch (IOException ex) {
               
            }
             
            updateBoardFromUI(row, col, player);
            
             setButtonsDisabled(true);

            
        }
    }

    @Override
    public void run() {
        try {

            while (true) {
                String serverMessage = din.readUTF();
                System.out.println(serverMessage);
                String[] parts = serverMessage.split(",");

                if (parts.length >= 3) {
                    int row = Integer.parseInt(parts[1]);
                    int col = Integer.parseInt(parts[2]);
                    String player = parts[3];

                    
                    Platform.runLater(() -> {
                    updateBoardFromUI(row, col, player);
                    
                });
//               
                    isXTurn = !isXTurn;
//               

                } else {

                    System.err.println("Unexpected server message format: " + serverMessage);
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(GameOnlineSrc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Button getButtonAt(int row, int col) {
        for (Node node : gridPane.getChildren()) {
            if (node instanceof Button) {
                Button btn = (Button) node;
                if (GridPane.getRowIndex(btn) == row && GridPane.getColumnIndex(btn) == col) {
                    return btn;
                }
            }
        }
        return null; 
    }

    public void updateBoardFromUI(int row, int col, String player) {
        
        Button btn = getButtonAt(row, col);
        if (btn != null && btn.getText().isEmpty()) {
            btn.setText(player);
            btn.setId(player.equals("X") ? "yellow2" : "pink");
            board[row][col] = player;
            checkWinner();
            setButtonsDisabled(false);
        }

    }

    private void checkWinner() {

        if (checkRows() || checkColumns() || checkDiagonals()) {
            String winner = isXTurn ? "X" : "O";
            showAlert(winner + " wins!");
            resetBoard();
        } else if (isBoardFull()) {
            showAlert("It's a tie!");
            resetBoard();
        }
        ////isXTurn=!isXTurn;
    }

    private boolean checkRows() {

        for (int i = 0; i < 3; i++) {
            if (!board[i][0].isEmpty() && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (!board[0][i].isEmpty() && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        if (!board[0][0].isEmpty() && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return true;
        }
        if (!board[0][2].isEmpty() && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return true;
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

  
    private void showAlert(String message) {
        String title = "Game Over - " + message;
        VBox vbox = new VBox();
        vbox.setSpacing(20);

        String videoPath = getClass().getResource("/resources/videos/congrats.mp4").toExternalForm();
        Media media = new Media(videoPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.setFitWidth(400);
        mediaView.setFitHeight(300);
        mediaView.setPreserveRatio(true);
        mediaPlayer.setAutoPlay(true);

        Label labelResult = new Label();
        labelResult.setAlignment(javafx.geometry.Pos.CENTER);
        labelResult.setId("black");
        labelResult.setLayoutX(410.0);
        labelResult.setLayoutY(416.0);
        labelResult.setPrefHeight(38.0);
        labelResult.setPrefWidth(350.0);
        labelResult.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        labelResult.setText(title);
        labelResult.setFont(new Font(20.0));

        vbox.getChildren().addAll(mediaView, labelResult);

        Dialog<Void> dialog = new Dialog<>();
        DialogPane dialogPane = dialog.getDialogPane();
        dialog.setTitle(title);
        dialogPane.getStylesheets().add(getClass().getResource("/style/CSS_StyleSheet.css").toExternalForm());
        dialogPane.setContent(vbox);
        ButtonType okButtonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialogPane.getButtonTypes().add(okButtonType);
        dialogPane.setId("backG");

        dialog.showAndWait();
        mediaPlayer.stop();
    }

    private void resetBoard() {
        for (Node node : gridPane.getChildren()) {
            if (node instanceof Button) {
                Button btn = (Button) node;
                btn.setText("");
            }
        }
        isXTurn = true;
    }
    
    
    
    private void setButtonsDisabled(boolean disabled) {
    for (Node node : gridPane.getChildren()) {
        if (node instanceof Button) {
            Button btn = (Button) node;
            btn.setDisable(disabled);
        }
    }
}

}