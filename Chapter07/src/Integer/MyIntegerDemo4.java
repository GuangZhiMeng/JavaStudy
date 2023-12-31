package Integer;

public class MyIntegerDemo4 {
    //需求：有一个字符串：“91 27 46 38 50”，把其中的每一个数存到int类型的数组中
    //思路：
    //① 定义一个字符串
    //② 把字符串中的数字数据存储到一个int类型的数组中
    //③ 遍历数组输出结果
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        // 获取字符串中的每一个数字,按照空格进行分割
        String[] strArr = s.split(" ");

        // 创建一个int类型的数组
        int [] numberArr = new int[strArr.length];

        // 把strArr中的数据进行类型转换并存入到int数组中
        for (int i = 0; i < numberArr.length; i++) {
            int number = Integer.parseInt(strArr[i]);
            numberArr[i] = number;
        }

        // 遍历int类型的数组
        for (int i = 0; i < numberArr.length; i++) {
            System.out.println(numberArr[i]);
        }
    }
}
