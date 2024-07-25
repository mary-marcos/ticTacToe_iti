package tictactoe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Clint 
{
    private Socket clientSocket;
    private DataInputStream dis;
    private DataOutputStream dos;
    String received;
    boolean isExist = false;
    boolean isRepeated =false;
    String currentUser;
    private static Clint instance;
    int usersCount;
    Vector <Users> usersData = new Vector <>();
    Thread myThread;
    String reciever;
    String sender;
//    Stage stage;
//    = TicTacToe.getStage();
//    OnlineScr onlineScr = new OnlineScr( stage);
    private Clint()
    {
        myThread = new Thread(()->{
            
            while(true){
                try {
                    readinvitation();
                } catch (IOException ex) {
                    Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
     public static synchronized Clint obj() {
        if (instance == null) 
        {
            instance = new Clint();
        }
        return instance;
    }
    
    public void stablishConnection() throws IOException
    {

        clientSocket = new Socket(InetAddress.getLocalHost(), 5005);
        dis = new DataInputStream(clientSocket.getInputStream());
        dos = new DataOutputStream(clientSocket.getOutputStream());
    }
    public void closeConnection () throws IOException
    {
        dos.writeUTF("signOut");
        dos.close();
        dis.close();
        clientSocket.close();
    }

     
    public void readFromServer() 
    {
           
        try 
        {
            received = dis.readUTF();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
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
                
            break;
                  
            case "move":
                            
              break;
            case "vectorSize":
                
                usersCount =Integer.parseInt(parts[1]) ;
                readUsers();
              break;

        }

    }
    public void readUsers()
    {
        if (!usersData.isEmpty())
        {
           usersData.removeAllElements();
        }
        try {
            for (int i = 0 ; i < usersCount; i++)
            {
                String received = dis.readUTF();
                String[] parts = received.split(",");
                if (parts[1].equals(currentUser))
                {
                    continue;
                }
                Users user = new Users(parts[1] ,parts[2],parts[3]);
                usersData.add(user);
            }
        } catch (IOException ex) {
            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
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
    
    protected void readinvitation() throws IOException
    {
        String x = dis.readUTF();
        
        String [] parts = x.split(",");
        
        switch (parts[0])
        {
            case "invitation recieved":
                reciever = parts[1];
                sender = parts[2];
                Platform.runLater(()->{
        
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Invitation");
                alert.setHeaderText(parts[2]+" Invits you to paly a game\nDo you accept");
                alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);

                alert.showAndWait().ifPresent(buttonType -> {
                    if (buttonType == ButtonType.YES) {
                        try {
                            invitationResponse("Accepted,"+reciever+","+sender);
                        } catch (IOException ex) {
                            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        alert.close();
                    } else {
                        try {
                            invitationResponse("refused,"+reciever+","+sender);
                        } catch (IOException ex) {
                            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        alert.close();
                    }
                 }); 
                });

                    break;
                case "Challenge accepted":
    //                onlineScr.toGameScreen("Challenge accepted");
                    System.out.println("challenge accepted");
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
            }
        
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
    
    
    
    
}
