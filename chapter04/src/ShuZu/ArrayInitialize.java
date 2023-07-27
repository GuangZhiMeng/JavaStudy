package ShuZu;

import java.util.Scanner;

public class ArrayInitialize {
    public static void main(String[] args) {
        /*
        一堆数组初始化
        （1）静态初始化：适用于一组数据是“已知”
        数组名 = new 元素的类型[]{元素1,元素2,……}

        当声明和静态初始化是在一个语句完成时，=右边的new 元素的数据类型[]可以省略，直接写{}就可以

        （2）动态初始化：适用于一组数据是“未知”，或需要通过计算得到，或者通过键盘输入得到的
        数组名 = new 元素的数据类型[长度];

        初始化的目的：
        （1）数组元素个数
        （2）数组的元素值
        静态初始化时，值直接确定
        动态初始化时，值是默认值

        整数类型：0
        小数类型：0.0
        boolean类型：false
        char类型：\u0000,编码值为0的字符
        引用数据类型，例如：String：null
         */

        int[] scores;
        scores = new int[]{89,96,100,75,88,99};
        System.out.println("第一个学员的成绩：" + scores[0]);
        // scores.length 计算数组的长度（元素个数）
        System.out.println("这个小组一共有：" + scores.length);
        /*
        相当于：
        int[] scores = {89,96,100,75,88,99};
         */

        /*
        动态初始化
        从键盘输入6个同学的成绩
         */
        int[] grades = new int[6];
        Scanner input = new Scanner(System.in);

        System.out.println("请输入第1个同学的成绩：");
        grades[0] = input.nextInt();

        System.out.println("请输入第2个同学的成绩：");
        grades[1] = input.nextInt();

        System.out.println("请输入第3个同学的成绩：");
        grades[2] = input.nextInt();
    }
}
