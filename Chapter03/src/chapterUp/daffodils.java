package chapterUp;

public class daffodils {
    public static void main(String[] args) {
        //所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如：
        // 153 = 1\*1\*1 + 5\*5\*5 + 3\*3\*3，找出所有的水仙花数，并统计他们有几个。

        int count = 0;//统计个数
        System.out.println("所有的水仙花数为：");
        for(int num = 100;num <= 999;num++){
            int ge = num % 10;
            int shi = (num % 100) / 10;
            int bai= num / 100;
        if(num == (ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai)){
            System.out.println(num);
            count++;
            }
        }
        System.out.println("水仙花的总个数：" + count);
    }
}
