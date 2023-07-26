package homework01;

class Timer {
    int minute,second;
    public Timer(int m,int s){
        minute = m;
        second = s;
    }

    void showTime(){
        System.out.println("现在时间是：" + minute + "分" + second + "秒");
    }

        static void swapTime(Timer t1,Timer t2){
//        Timer t = t1;//定义了局部变量t，利用t交换t1和t2的值
//        t1 = t2;
//        t2 = t;
            //我们使用异或操作符将这两个变量的值进行异或运算，并将结果存储在变量 a 中。接下来，
            // 我们再次使用异或操作符将变量 a 和变量 b 的值进行异或运算，并将结果存储在变量 b 中。
            // 最后，我们再次使用异或操作符将变量 a 和变量 b 的值进行异或运算，并将结果存储在变量 a 中。
            // 这样，我们就成功地交换了变量 a 和变量 b 的值
            t1.minute = t1.minute ^ t2.minute;
            t2.minute = t1.minute ^ t2.minute;
            t1.minute = t1.minute ^ t2.minute;
            t1.second = t1.second ^ t2.second;
            t2.second = t1.second ^ t2.second;
            t1.second = t1.second ^ t2.second;
    }
}
