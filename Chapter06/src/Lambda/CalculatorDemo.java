package Lambda;

public class CalculatorDemo {
    /*
        1. ���ȴ���һ���ӿ� (Calculator)
        2. �ڸýӿ��д���һ�����񷽷� (clc),�÷������в���Ҳ�з���ֵ
        3. �ڲ����� (CalculatorDemo) �д���һ������ (useCalculator)
           �����ĵĲ����� Calculato ���͵�
           �ڷ����ڲ������� Calculator �� calc ����
     */
    public static void main(String[] args) {
        // �����ڲ���ʵ��
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // lambdaʵ��
        // useCalculator((int a, int b) -> {return a + b;});
        // Lambda���ʽ��ʡ��ģʽ
        useCalculator((a, b) -> a + b);

    }

    // ����һ������ useCalculator
    public static void useCalculator(Calculator calculator){
        int result = calculator.calc(10,20);
        System.out.println(result);
    }
}


// 1.�ȴ���һ���ӿ�
interface Calculator{
    int calc(int a , int b);
}