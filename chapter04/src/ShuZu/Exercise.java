package ShuZu;

public class Exercise {
    public static void main(String[] args) {
        /*
        考试满分是100分
        小王考了满分
        小李考了比满分低1分
        小郑考了一半分

        满分错了，要纠正为150，如果下面这么写，需要修改4个地方
         */
        /*
        int max = 100;
        int wang = 100;
        int li = 100-1;
        int zheng = 100/2;

        System.out.println("满分：" + max);
        System.out.println("小王：" + wang);
        System.out.println("小李：" + li);
        System.out.println("小郑：" + zheng);
         */

        final int MAX = 150;
        int wang = MAX;
        int li = MAX - 1;
        int zheng = MAX/2;

        System.out.println("满分：" + MAX);
        System.out.println("小王：" + wang);
        System.out.println("小李：" + li);
        System.out.println("小郑：" + zheng);
    }
}
