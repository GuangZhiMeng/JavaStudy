package homework01;

class Timer {
    int minute,second;
    public Timer(int m,int s){
        minute = m;
        second = s;
    }

    void showTime(){
        System.out.println("����ʱ���ǣ�" + minute + "��" + second + "��");
    }

        static void swapTime(Timer t1,Timer t2){
//        Timer t = t1;//�����˾ֲ�����t������t����t1��t2��ֵ
//        t1 = t2;
//        t2 = t;
            //����ʹ������������������������ֵ����������㣬��������洢�ڱ��� a �С���������
            // �����ٴ�ʹ���������������� a �ͱ��� b ��ֵ����������㣬��������洢�ڱ��� b �С�
            // ��������ٴ�ʹ���������������� a �ͱ��� b ��ֵ����������㣬��������洢�ڱ��� a �С�
            // ���������Ǿͳɹ��ؽ����˱��� a �ͱ��� b ��ֵ
            t1.minute = t1.minute ^ t2.minute;
            t2.minute = t1.minute ^ t2.minute;
            t1.minute = t1.minute ^ t2.minute;
            t1.second = t1.second ^ t2.second;
            t2.second = t1.second ^ t2.second;
            t1.second = t1.second ^ t2.second;
    }
}
