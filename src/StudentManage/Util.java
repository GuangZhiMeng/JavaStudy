package StudentManage;

import java.util.ArrayList;

public class Util {
    private static StuListInfo StuListInfo;

    public static boolean checkSameStudentName(String strName){
        boolean bSame = false;
        ArrayList<Student> uList = getStuListInfo().getaStus();
        for(Student Student : uList){
            if (Student.getName().equals(strName)){
                bSame = true;
                return bSame;
            }
        }
        return bSame;
    }

    private static StuListInfo stuListInfo;
    public static StuListInfo getStuListInfo(){
        if(stuListInfo == null){
            synchronized (Util.class){
                if(stuListInfo==null){
                    stuListInfo = new StuListInfo();
                }
            }
        }
        return  stuListInfo;
    }
}
