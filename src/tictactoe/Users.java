package tictactoe;


public class Users 
{
    String userName;
    String status;
    String availableity;

    public Users(String userName, String status, String availableity) {
        this.userName = userName;
        this.status = status;
        this.availableity = availableity;
    }

    public Users() 
    {
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String isAvailableity() {
        return availableity;
    }

    public void setAvailableity(String availableity) {
        this.availableity = availableity;
    }
    
}
