package Lambda;

public class StringHandlerDemo {
    /*
        1.���ȴ���һ���ӿ� (StringHandler)
        2.�ڸýӿ��д���һ�����񷽷� (printMessage),�÷������в����޷���ֵ
        3.�ڲ����� (StringHandlerDemo) �д���һ������ (useStringHandler)
        �����ĵĲ����� StringHandler ���͵�
        �ڷ����ڲ������� StringHandler �� printMessage ����
     */
    public static void main(String[] args) {
        // ʹ�������ڲ�����ʵ��
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("���������ڲ���" + msg);
            }
        });

        // Lambda ʵ��
        useStringHandler((String msg) -> {System.out.println("����Lambda���ʽ" + msg);});

    }

    // �ڲ����� (StringHandlerDemo) �д���һ������ (useStringHandler)
    public static void useStringHandler(StringHandler stringHandler){
        stringHandler.printMessage("itheima");
    }
}

// ����һ���ӿ� (StringHandler)
interface StringHandler{
    // �ڸýӿ��д���һ�����񷽷� (printMessage),�÷������в����޷���ֵ
    void printMessage(String msg);
}