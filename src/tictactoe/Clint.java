
package tictactoe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clint implements Runnable
{
    private Thread thread;
    private Socket clientSocket;
    private DataInputStream dis;
    private DataOutputStream dos;
    boolean isRebeated;
    
    Clint()
    {
      
    }
    public void satablishConnection ()
    {
        try {
            
            clientSocket = new Socket("10.178.240.79", 5005);
            dis = new DataInputStream(clientSocket.getInputStream());
            dos = new DataOutputStream(clientSocket.getOutputStream());
            
        } catch (IOException ex) {
            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
        }

        thread = new Thread(this);
        thread.start();
    }

     @Override
    public void run() {
           
            while (!clientSocket.isClosed() ) {
                try {
                    String input = dis.readUTF();
                    System.out.println(input);
                    isRebeated = input.equals("exist");
                } catch (IOException ex) {
                    Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
    }
    
    public void sendsignup(String userName, String password , String email) throws IOException 
    {
        satablishConnection();
        String  data  = "signup"+","+ userName+ "," +  password + "," + email ;
        dos.writeUTF(data);
        
//        clientSocket.close();
//        dos.close();
 
    }
    
//    public void sendUserName(String userName)
//    {
//        try {
//            String userNameCheck = "checkUserName"+","+userName;
//            dos.writeUTF(userNameCheck);
//            
//        } catch (IOException ex) {
//            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    
    
//    protected void sendMovement(javafx.event.ActionEvent actionEvent) {
//        try {
//            dos.writeUTF(sendBox.getText());
//            sendBox.setText("");
//        } catch (IOException ex) {
//            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
}
