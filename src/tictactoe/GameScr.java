package tictactoe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import tictactoe.MultiPlayerModeSrc;
import tictactoe.SinglePlayerModeSrc;
import javafx.application.Platform;
import javafx.stage.FileChooser;


public  class GameScr extends AnchorPane {
    int counteRrecord;
    protected final List<String> moves;
    protected final List<String> rMoves;
   protected final Label play1Label;
   protected final Label play2Label;
    protected final Label label;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final Label label0;
     protected final Label label02;
      protected final Label label03;
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
    protected final Button resetBtn;
     private Stage stage;
    private Scene scene;
    SinglePlayerModeSrc singleMode;
   boolean isSinglemode=false;
   boolean isXTurn=true;
   int xScore=0;
   int oScore=0;
   int level=0;  
   boolean isRecording;
 MultiPlayerModeSrc multiplaysrc;
    public GameScr(Stage stage,boolean isSinglemode,int level) { 
        counteRrecord=0;
        isRecording=false;
        moves = new ArrayList<>();
        rMoves = new ArrayList<>();
        this.isSinglemode=isSinglemode;
        this.level=level;
        label = new Label();
        imageView = new ImageView();
        imageView0 = new ImageView();
        play2Label = new Label();
        play1Label= new Label();
        label0 = new Label();
        label02= new Label();
        label03 = new Label();
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
        resetBtn = new Button();

        setId("ticTacToe");
        setPrefHeight(570.0);
        setPrefWidth(750.0);
String tittle= " multi players";
if(this.isSinglemode){
 switch(level){
        case 1 :tittle="easy mode";
        break;
        case 2: tittle="medium mode";
         break;
         case 3: tittle="hard mode";
         break;
    }

}
        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setId("ticTacToe");
        label.setLayoutX(180.0);
        label.setLayoutY(20.0);
        label.setPrefHeight(40.0);
        label.setPrefWidth(420.0);
        label.setText(tittle);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        label.setFont(new Font(17.0));

        imageView.setFitHeight(60.0);
        imageView.setFitWidth(60.0);
        imageView.setLayoutX(193.0);
        imageView.setLayoutY(94.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/images/boy_145865.png").toExternalForm()));

        imageView0.setFitHeight(60.0);
        imageView0.setFitWidth(60.0);
        imageView0.setLayoutX(501.0);
        imageView0.setLayoutY(94.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("/images/monitor_303572.png").toExternalForm()));



        play1Label.setAlignment(javafx.geometry.Pos.CENTER);
        //play1Label.setId("black");
        play1Label.setLayoutX(193.0);
        play1Label.setLayoutY(94.0);
        play1Label.setPrefHeight(38.0);
        play1Label.setPrefWidth(80.0);
        play1Label.setTextFill(javafx.scene.paint.Color.valueOf("#fffefe"));
        play1Label.setText("player 1");
        play1Label.setFont(new Font(20.0));


         play2Label.setAlignment(javafx.geometry.Pos.CENTER);
       // play2Label.setId("black");
        play2Label.setLayoutX(501.0);
        play2Label.setLayoutY(94.0);
        play2Label.setPrefHeight(38.0);
        play2Label.setPrefWidth(80.0);
        play2Label.setTextFill(javafx.scene.paint.Color.valueOf("#fffefe"));
        play2Label.setText("player 2");
        play2Label.setFont(new Font(20.0));




        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setId("black");
        label0.setLayoutX(280.0);
        label0.setLayoutY(116.0);
        label0.setPrefHeight(38.0);
        label0.setPrefWidth(50.0);
        label0.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        label0.setText("0");
        label0.setFont(new Font(20.0));


        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setId("black");
        label0.setLayoutX(280.0);
        label0.setLayoutY(116.0);
        label0.setPrefHeight(38.0);
        label0.setPrefWidth(50.0);
        label0.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        label0.setText("0");
        label0.setFont(new Font(20.0));



        label02.setAlignment(javafx.geometry.Pos.CENTER);
        label02.setId("black");
        label02.setLayoutX(351.0);
        label02.setLayoutY(116.0);
        label02.setPrefHeight(38.0);
        label02.setPrefWidth(50.0);
       // label02.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        label02.setText(":");
        label02.setFont(new Font(20.0));


        label03.setAlignment(javafx.geometry.Pos.CENTER);
        label03.setId("black");
        label03.setLayoutX(410.0);
        label03.setLayoutY(116.0);
        label03.setPrefHeight(38.0);
        label03.setPrefWidth(50.0);
        label03.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        label03.setText("0");
        label03.setFont(new Font(20.0));

        gridPane.setLayoutX(231.0);
        gridPane.setLayoutY(215.0);
        gridPane.setPrefHeight(250.0);
        gridPane.setPrefWidth(320.0);

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
        label1.setLayoutX(177.0);
        label1.setLayoutY(154.0);
        label1.setText("x");
        label1.setFont(new Font(18.0));

        label2.setId("pink");
        label2.setLayoutX(568.0);
        label2.setLayoutY(154.0);
        label2.setText("o");
        label2.setFont(new Font(18.0));

        RecordBtn.setLayoutX(405.0);
        RecordBtn.setLayoutY(512.0);
        RecordBtn.setMnemonicParsing(false);
        RecordBtn.setPrefHeight(38.0);
        RecordBtn.setPrefWidth(103.0);
        RecordBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        RecordBtn.setText("Record Game");
        RecordBtn.setOnAction(
                this::startrecord);
        RecordBtn.setTextFill(javafx.scene.paint.Color.valueOf("#f2f2f2"));

        ScreenShotBtn.setLayoutX(580.0);
        ScreenShotBtn.setLayoutY(512.0);
        ScreenShotBtn.setMnemonicParsing(false);
        ScreenShotBtn.setPrefHeight(38.0);
        ScreenShotBtn.setPrefWidth(103.0);
        ScreenShotBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        ScreenShotBtn.setText("Show Record");
        ScreenShotBtn.setTextFill(javafx.scene.paint.Color.valueOf("#fffefe"));

        backBtn.setLayoutX(90.0);
        backBtn.setLayoutY(512.0);;
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(103.0);
        backBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        backBtn.setOnAction(
                this::singlePlayerMode);
        backBtn.setText("back");
        backBtn.setTextFill(javafx.scene.paint.Color.valueOf("#fffafa"));

        resetBtn.setLayoutX(240.0);
        resetBtn.setLayoutY(512.0);
        resetBtn.setMnemonicParsing(false);
        resetBtn.setPrefHeight(38.0);
        resetBtn.setPrefWidth(103.0);
        resetBtn.setStyle("-fx-background-color: #FFC201; -fx-background-radius: 20px;");
        resetBtn.setOnAction(
                this::resetBoard);
        ;
        resetBtn.setText("Reset");
     resetBtn.setTextFill(javafx.scene.paint.Color.valueOf("#fffdfd"));
     
     
     
       ScreenShotBtn.setOnAction( this::loadMovesFromFile);
       
       
  
        getChildren().add(label);
        if(isSinglemode){getChildren().add(imageView);
        getChildren().add(imageView0);
        }else{getChildren().add(play1Label);
        getChildren().add(play2Label);
        }


        getChildren().add(label0);
        getChildren().add(label02);
        getChildren().add(label03);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);

        getChildren().add(gridPane);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(RecordBtn);
        getChildren().add(ScreenShotBtn);
        getChildren().add(backBtn);
        getChildren().add(resetBtn);

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
       // button.setText("1");
        button.setOnAction(this::handleButtonAction);
        gridPane.getChildren().add(button);

    }



    private void handleButtonAction(ActionEvent event) {
    Button clickedButton = (Button) event.getSource();
    if (clickedButton.getText().isEmpty()) {
        clickedButton.setText(isXTurn ? "X" : "O");
        clickedButton.setId(isXTurn ? "yellow2" : "pink");
        isXTurn = !isXTurn;
        
       if(isRecording&& !isSinglemode){recordMove(clickedButton);}
       checkWinner();
        if (isSinglemode && !isXTurn) { 
            makeComputerMove();
            isXTurn = true;
            checkWinner();
        }
    }
}
    
 
private void checkWinner() {
    String[][] board = new String[3][3];
    for (Node node : gridPane.getChildren()) {
        if (node instanceof Button) {
            Button btn = (Button) node;
            int row = GridPane.getRowIndex(btn);
            int col = GridPane.getColumnIndex(btn);
            board[row][col] = btn.getText();
        }
    }

    if (checkRows(board) || checkColumns(board) || checkDiagonals(board)) {
        String winner = isXTurn ? "O" : "X";
        showAlert(winner + " wins!");
        if(isRecording){counteRrecord++;
            recordMovesToFile();
        
        }
        
        resetBoard(new ActionEvent());
        
        
          if(winner =="X")
        {
        xScore++;
        String strx=String.valueOf(xScore);
       label0.setText(strx);
        }
        else if (winner=="O")
        {
            oScore++;
            String strx=String.valueOf(oScore);
       label03.setText(strx);
        }
        
        
    } else if (isBoardFull(board)) {
        showAlert("It's a tie!");
        if(isRecording){counteRrecord++;
            recordMovesToFile();}
        resetBoard(new ActionEvent());
    }
    
    
    
  
    
    
    
    
    
}

private boolean checkRows(String[][] board) {
    for (int i = 0; i < 3; i++) {
        if (!board[i][0].isEmpty() && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
            return true;
        }
    }
    return false;
}

private boolean checkColumns(String[][] board) {
    for (int i = 0; i < 3; i++) {
        if (!board[0][i].isEmpty() && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
            return true;
        }
    }
    return false;
}

private boolean checkDiagonals(String[][] board) {
    if (!board[0][0].isEmpty() && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
        return true;
    }
    if (!board[0][2].isEmpty() && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
        return true;
    }
    return false;
}

private boolean isBoardFull(String[][] board) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j].isEmpty()) {
                return false;
            }
        }
    }
    return true;
}

private void makeComputerMove() {
    switch(level){
        case 1 :easyMode();
        break;
        case 2: mediumMode();
         break;
         case 3: hardMode();
         break;
    }


}
private void easyMode(){
 List<Button> availableButtons = new ArrayList<>();
    for (Node node : gridPane.getChildren()) {
        if (node instanceof Button) {
            Button btn = (Button) node;
            if (btn.getText().isEmpty()) {
                availableButtons.add(btn);
            }
        }
    }
    if (!availableButtons.isEmpty()) {
        Button randomButton = availableButtons.get(new Random().nextInt(availableButtons.size()));
        randomButton.setText("O");
        randomButton.setId("pink");
    }
}
private void mediumMode(){}
private void hardMode(){}



private void showAlert(String message) {
 String videos = null;
    String videoPath = null;

    if (isSinglemode && "O wins!".equals(message)) {
        videos = "/resources/videos/sad.mp4";
    } else if ("X wins!".equals(message)) {
        videos = "/resources/videos/congrats.mp4";
    }else if ("O wins!".equals(message)) {
        videos = "/resources/videos/congrats.mp4";}

    if (videos != null) {
        videoPath = getClass().getResource(videos).toExternalForm();
    }
    String tittles="Game Over  "+message;
    VBox vbox = new VBox();

    vbox.setSpacing(20);

    //String videoPath = getClass().getResource("/resources/videos/congrats.mp4").toExternalForm();


    Media media = new Media(videoPath);
    MediaPlayer mediaPlayer = new MediaPlayer(media);
    MediaView mediaView = new MediaView(mediaPlayer);


    mediaView.setFitWidth(400);
    mediaView.setFitHeight(300);
    mediaView.setPreserveRatio(true);


    mediaPlayer.setAutoPlay(true);



     Label labelresult = new Label();


        labelresult.setAlignment(javafx.geometry.Pos.CENTER);
        labelresult.setId("black");
        labelresult.setLayoutX(410.0);
        labelresult.setLayoutY(416.0);
        labelresult.setPrefHeight(38.0);
        labelresult.setPrefWidth(350.0);
        labelresult.setStyle("-fx-background-color: white; -fx-background-radius: 20px;");
        labelresult.setText(tittles);
        labelresult.setFont(new Font(20.0));


    vbox.getChildren().addAll(mediaView,labelresult);

    Dialog<Void> dialog = new Dialog<>();
    DialogPane  dialogbane  =dialog.getDialogPane();

    dialog.setTitle(tittles);
    dialogbane.getStylesheets().add(getClass().getResource("/style/CSS_StyleSheet.css").toExternalForm());
    dialogbane.setContent(vbox);



   ButtonType okButtonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);

  dialogbane.getButtonTypes().add(okButtonType);
  dialogbane.setId("backG");

    dialog.showAndWait();

    mediaPlayer.stop();
}


private void resetBoard(ActionEvent actionEvent) {
    for (Node node : gridPane.getChildren()) {
        if (node instanceof Button) {
            Button btn = (Button) node;
            btn.setText("");
        }
    }
    isXTurn = true;
}


private void startrecord(ActionEvent actionEvent) {
    if(!isSinglemode){ isRecording=true;System.out.println("record started");}
    
  
  
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
    protected void singlePlayerMode(ActionEvent actionEvent)
    {
        if(isSinglemode)
        {toSinglePlaySrc(actionEvent);}
        else{multiplaysrc( actionEvent);}

    }
    


    
    protected void recordMovesToFile() {
        String c=String.valueOf(counteRrecord);
        Date date =new Date();
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String formattedDate = dateFormat.format(date);
        //String name_file="Record History" +c+".txt";
         String filename = "Record_History_" + formattedDate + "_" + counteRrecord + ".txt";

        try  {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
           
//            writer.write(XN.getText()+"!"+ON.getText()+"!"+String.valueOf(xCount)+"!"+String.valueOf(oCount)+"!?#");
            for (int i = 0 ; i<moves.size();i++) {
                writer.write(moves.get(i));
                writer.write("#");
                if(i==moves.size()-1)
                {  
                    writer.newLine();
                    writer.write("&");
                    writer.newLine();
                }
         
            }
            moves.clear();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void recordMove(Button btn) {
        int row = gridPane.getRowIndex(btn);
        int col = gridPane.getColumnIndex(btn);
        String move = String.format("%s,%s,%s", btn.getText(), row, col);
        moves.add(move);
        
    }
    protected void loadMovesFromFile(ActionEvent event) {
        String fileContent;
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Game Record");
        File replayFile = fileChooser.showOpenDialog(null);
        if (replayFile != null) {
            fileContent = readFileToString(replayFile);
            // Now you can process the fileContent as needed
            processFileContent(fileContent);
        }
            
        }
    private String readFileToString(File file) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

   
    private void processFileContent(String content) {
  
        System.out.println(content);
       
        processMoves(content);
    }
    private void processMoves(String allMoves) {
        String[] moves = allMoves.split("#");

        new Thread(() -> {
            for (String move : moves) {
                if (!move.trim().isEmpty()) {
                    // Ensure UI updates are on the JavaFX Application Thread
                    Platform.runLater(() -> {
                        updateBoard(move.trim());
                    });
                }
                try {
                    Thread.sleep(1000); // Adjust delay as needed
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    private void updateBoard(String move) {
        if (move.length() >= 5) {
            char player = move.charAt(0);
            int row = Character.getNumericValue(move.charAt(2));
            int col = Character.getNumericValue(move.charAt(4));

            Button button = (Button) getNodeByRowColumnIndex(row, col, gridPane);
            if (button != null) {
                button.setText(Character.toString(player));
            }
        }
    }
     public Node getNodeByRowColumnIndex(final int row, final int column, GridPane gridPane) {
        Node result = null;
        for (Node node : gridPane.getChildren()) {
            Integer nodeRow = GridPane.getRowIndex(node);
            Integer nodeCol = GridPane.getColumnIndex(node);
            if (nodeRow != null && nodeCol != null && nodeRow == row && nodeCol == column) {
                result = node;
                break;
            }
        }
        return result;
    }

    }