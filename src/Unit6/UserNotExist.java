package Unit6;

public class UserNotExist extends Exception {
    public UserNotExist(){
        super(); //重载
    }
    public String toString(){
        return ("The User does not exist!");
    }
}
