package Manager;

import java.util.ArrayList;

public class Util {
    private static UserListInfo userListInfo;
    public static UserListInfo getUserListInfo(){
        if(userListInfo == null){
            synchronized (Util.class){
                if(userListInfo == null){
                    userListInfo = new UserListInfo();
                    //load from json file

                    User user = new User();
                    user.setName("666");
                    user.setPwd("666");
                    userListInfo.getaUsers().add(user);

                    user = new User();
                    user.setName("999");
                    user.setPwd("999");
                    userListInfo.getaUsers().add(user);
                }
            }
        }
        return userListInfo;
    }

    public static boolean checkSameUserName(String strName){
        boolean bSame = false;
        ArrayList<User> uList = getUserListInfo().getaUsers();
        for(User user : uList){
            if (user.getName().equals(strName)){
                bSame = true;
                return bSame;
            }
        }
        return bSame;
    }
}
