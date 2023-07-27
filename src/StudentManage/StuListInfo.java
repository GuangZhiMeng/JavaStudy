package StudentManage;

import java.util.ArrayList;

public class StuListInfo {
    private ArrayList<Student> aStus = new ArrayList<Student>();

    public ArrayList<Student> getaStus(){
        return aStus;
    }

    public void setaStus(ArrayList<Student> aStus){
        this.aStus = aStus;
    }
}
