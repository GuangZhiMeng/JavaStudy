package Study;

class Timer{
    int minute,second;
    public Timer(int m,int s){
        minute = m;
        second = s;
    }

    void showTimer(){
        System.out.println("现在时间是："+minute+"分"+second+"秒");
    }

    static void swapTime(Timer t1,Timer t2){
        Timer t = t1;
        t1 = t2;
        t2 = t;
    }
}

public class ReferenceDemo {
    public static void main(String[] args) {
        Timer t1 = new Timer(9,10);
        Timer t2 = new Timer(11,12);
        t1.showTimer();
        t2.showTimer();
        System.out.println("使用swapTimer方法交换Timer实例后：");
        Timer.swapTime(t1,t2);
        t1.showTimer();
        t2.showTimer();
    }
}
