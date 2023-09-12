package Lambda;

public class CalculatorDemo {
    /*
        1. 首先存在一个接口 (Calculator)
        2. 在该接口中存在一个抽像方法 (clc),该方法是有参数也有返回值
        3. 在测试类 (CalculatorDemo) 中存在一个方法 (useCalculator)
           方法的的参数是 Calculato 类型的
           在方法内部调用了 Calculator 的 calc 方法
     */
    public static void main(String[] args) {
        // 匿名内部类实现
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // lambda实现
        // useCalculator((int a, int b) -> {return a + b;});
        // Lambda表达式的省略模式
        useCalculator((a, b) -> a + b);

    }

    // 创建一个方法 useCalculator
    public static void useCalculator(Calculator calculator){
        int result = calculator.calc(10,20);
        System.out.println(result);
    }
}


// 1.先创建一个接口
interface Calculator{
    int calc(int a , int b);
}