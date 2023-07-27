package Manager;

import java.util.ArrayList;

public class UserListInfo {
    private ArrayList<User> aUsers = new ArrayList<User>();
    public ArrayList<User> getaUsers(){
        return aUsers;
    }

    public void setaUsers(ArrayList<User> aUsers){
        this.aUsers = aUsers;
    }
}
