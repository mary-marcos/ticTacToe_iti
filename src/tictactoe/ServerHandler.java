package tictactoe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class ServerHandler 
{
    private Socket clientSocket;
    private DataInputStream dis;
    private DataOutputStream dos;
    String received;
    boolean isExist = false;
    boolean isRepeated =false;
    String currentUser;
    private static ServerHandler instance;
    int usersCount;
    ObservableList <Users> usersData = FXCollections.observableArrayList() ;
    String reciever;
    String sender;
    Thread readTh;
    
    private ServerHandler(){
        try {
            stablishConnection();
        } catch (IOException ex) {
            Logger.getLogger(ServerHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static synchronized ServerHandler obj() {
        if (instance == null) 
        {
            instance = new ServerHandler();
        }
        return instance;
    }
    
    public void stablishConnection() throws IOException
    {

        clientSocket = new Socket(InetAddress.getLocalHost(), 5005);
        dis = new DataInputStream(clientSocket.getInputStream());
        dos = new DataOutputStream(clientSocket.getOutputStream());
        readFromServer();
    }
    public void closeConnection () throws IOException
    {
        dos.close();
        readTh.interrupt();
        dis.close();
        clientSocket.close();
    }

     
    public void readFromServer() 
    {
       readTh =  new Thread(()->{
            
            while(!clientSocket.isClosed()){

                try {
                    
                    received = dis.readUTF();
                }catch (IOException ex){
                    
                    Logger.getLogger(ServerHandler.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println(received);
                String [] parts = received.split(",");

                switch (parts[0])
                {
                    case "exist":

                        isRepeated = true;

                      break;
                    case "notExist":

                        isRepeated = false;
                    break;

                    case "true":

                        isExist = true;
                        currentUser= parts[1];
                        TicTacToe.setScreen("chooseModeScreen");
                    break;
                    case"false":
                         Platform.runLater(() ->{
                          showAlert("Incorrect user name or password",
                                         "Please Check user name and Password", "ok");
                         try 
                         {
                            closeConnection();
                         } 
                         catch (IOException ex) 
                         {
                             Logger.getLogger(SignInScr.class.getName()).log(Level.SEVERE, null, ex);
                         }

                        });
                        break;

                    case "move":

                      break;
                    case "userData":
                        
                        readUsers(parts[1],parts[2],parts[3]);
                        
                        break;
                        
                      case "invitation recieved":
                          
                            reciever = parts[1];
                            sender = parts[2];
                            Platform.runLater(()->{

                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("Invitation");
                            alert.setHeaderText(parts[2]+" Invits you to play a game\nDo you accept");
                            alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);

                            alert.showAndWait().ifPresent(buttonType -> {
                                if (buttonType == ButtonType.YES) {
                                    try {
                                        invitationResponse("Accepted,"+reciever+","+sender);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ServerHandler.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    alert.close();
                                } else {
                                    try {
                                        invitationResponse("refused,"+reciever+","+sender);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ServerHandler.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    alert.close();
                                }
                             }); 
                            });

                    break;
                    case "Challenge accepted":
                    TicTacToe.setScreen("gameOnlineScreen");
                        sender = parts[1];
                        reciever = parts[2];
                        GameOnlineSrc.label5.setText(parts[1]);
                        GameOnlineSrc.label6.setText(parts[2]);
                {
                    try {
                        dos.writeUTF("updateAvailability"+","+sender+","+reciever);
                    } catch (IOException ex) {
                        Logger.getLogger(ServerHandler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                case "Challenge rejected":
                    System.out.println("challenge rejected");
                    Platform.runLater(()->{
                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setTitle("Invitation rejected");
                        alert.setHeaderText("Invitation rejected");
                        alert.getButtonTypes().setAll(ButtonType.OK);

                        alert.showAndWait().ifPresent(buttonType -> {
                            if (buttonType == ButtonType.OK) {
                                alert.close();
                            }
                        });
                    });
                            
                     
                    break;
                    case"gemeOver":
                        Platform.runLater(()->{
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("Game Over");
                            alert.setContentText(parts[1]+" left the game.\nCongrateulations you win.");
                            alert.getButtonTypes().setAll(ButtonType.OK);
                            alert.showAndWait().ifPresent(button->{

                                if (button == ButtonType.OK){
                                    TicTacToe.setScreen("multiModeScreen");
                                }
                            });
                        });
                        
                        break;
                    case"disableButtons":
                        GameOnlineSrc.setButtonsDisabled(true);
                        break;
                    case"responceMove":
                        Platform.runLater(()->{
                            if (parts[4].equals("enable")){
                            GameOnlineSrc.setButtonsDisabled(false);
                            }
                            if (parts[4].equals("disabled")){
                                GameOnlineSrc.setButtonsDisabled(true);
                            }
                            GameOnlineSrc.updateBoardFromUI(Integer.parseInt(parts[1]),Integer.parseInt(parts[2]) ,parts[3]);
                        });
                        
                        break;
                    
                }
            }
        });
       readTh.start();

    }
    public void readUsers(String userName,String status, String availability ){
        
        if (!userName.equals(currentUser)){
            Users user = new Users(userName ,status,availability);
            usersData.add(user);   
        }       
    }
      
    
    public void sendsignup(String userName, String password , String email) throws IOException 
    {
        String  data  = "signup,"+ userName+ "," +  password + "," + email ;
        dos.writeUTF(data);
        closeConnection();
    }
    
    public void sendsignIn(String userName, String password) throws IOException 
    {
        String  data  = "signIn,"+ userName+ "," +  password ;
        this.currentUser =userName;
        dos.writeUTF(data);
    }
    
    public void sendUserName(String userName) throws IOException
    {
        String userNameCheck = "checkUserName," + userName;
        dos.writeUTF(userNameCheck);
        
    }
    
    public void signOut() throws IOException
    {
        String checkSignOut = "signOut,"+currentUser;
        dos.writeUTF(checkSignOut);
    }
    
    protected void sendSignal() throws IOException
    {
        dos.writeUTF("getUsersData");
    }
    
    protected void sendUsersForRequist(String reciever) throws IOException
    {
        dos.writeUTF("Invitation,"+currentUser+","+reciever);
        System.out.println("from clint"+reciever+"current = "+currentUser);
        this.reciever = reciever;
    }
    
    protected void invitationResponse(String reply) throws IOException
    {
        dos.writeUTF(reply);
    }
//    protected void sendMovement(javafx.event.ActionEvent actionEvent) {
//        try {
//            dos.writeUTF(sendBox.getText());
//            sendBox.setText("");
//        } catch (IOException ex) {
//            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
     private void showAlert(String title, String message, String buttonText){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        ButtonType button = new ButtonType(buttonText);
        alert.getButtonTypes().setAll(button);
        alert.showAndWait();
    }
     protected void sendGemeExit() throws IOException{
         
         dos.writeUTF("ExitGame,"+sender);
         try {
                dos.writeUTF("returnAvailability,"+sender+","+reciever);
                } catch (IOException ex) {
                    Logger.getLogger(ServerHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
     }
     
    protected void sendMessage (String msg) throws IOException{
    
        dos.writeUTF(msg);
    }
    
}
