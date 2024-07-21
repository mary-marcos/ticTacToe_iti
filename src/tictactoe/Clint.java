package tictactoe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clint 
{
    private Socket clientSocket;
    private DataInputStream dis;
    private DataOutputStream dos;
    String received;
    boolean isExist = false;
    boolean isRepeated =false;
    String userName;
    private static Clint instance;
    
    private Clint()
    {
        
    }
     public static synchronized Clint obj() {
        if (instance == null) {
            instance = new Clint();
        }
        return instance;
    }
    
    public void satablishConnection ()
    {
        try {
            
            clientSocket = new Socket(InetAddress.getLocalHost(), 5005);
            dis = new DataInputStream(clientSocket.getInputStream());
            dos = new DataOutputStream(clientSocket.getOutputStream());
            
        } catch (IOException ex) {
            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void closeConnection () throws IOException
    {
        dos.close();
        dis.close();
        clientSocket.close();
    }

     
    public void readFromServer() 
    {
           
        try {
            received = dis.readUTF();
        } catch (IOException ex) {
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
            }

    }
      
    
    public void sendsignup(String userName, String password , String email) throws IOException 
    {
        satablishConnection();
        String  data  = "signup,"+ userName+ "," +  password + "," + email ;
        dos.writeUTF(data);
        closeConnection();
    }
    public void sendsignIn(String userName, String password) throws IOException 
    {
        satablishConnection();
        String  data  = "signIn,"+ userName+ "," +  password ;
        this.userName =userName;
        dos.writeUTF(data);
    }
    public void sendUserName(String userName) throws IOException
    {
        String userNameCheck = "checkUserName," + userName;
        dos.writeUTF(userNameCheck);
        
    }
    public void signOut() throws IOException
    {
        String checkSignOut = "signOut,"+userName;
        dos.writeUTF(checkSignOut);
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
