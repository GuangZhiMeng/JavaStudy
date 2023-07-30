package string;

public class RunTime {
    public static void main(String[] args) {
        // System.currentTimeMillis(); 获取1970年1月1日0时0分0秒 到当前时间所经历的毫秒值
        // 记录下面程序运行前的时间
        long star = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append(i);
        }

        // 记录程序运行完之后的时间
        long end = System.currentTimeMillis();
        // 计算出当前程序所花的时间
        // 1秒 = 1000毫秒
        System.out.println(end - star);
    }
}
