package homework01;

public class ReferenceDemo1 {
        public static void main(String[] args) {
            Timer t1 = new Timer(9,10);
            Timer t2 = new Timer(11,12);
            t1.showTime();
            t2.showTime();
            System.out.println("使用 swapTime 方法交换 Timer实例后：");
            Timer.swapTime(t1,t2);
            t1.showTime();
            t2.showTime();
        }
    }
