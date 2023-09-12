package Lambda;

public class StringHandlerDemo {
    /*
        1.首先存在一个接口 (StringHandler)
        2.在该接口中存在一个抽像方法 (printMessage),该方法是有参数无返回值
        3.在测试类 (StringHandlerDemo) 中存在一个方法 (useStringHandler)
        方法的的参数是 StringHandler 类型的
        在方法内部调用了 StringHandler 的 printMessage 方法
     */
    public static void main(String[] args) {
        // 使用匿名内部类来实现
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("我是匿名内部类" + msg);
            }
        });

        // Lambda 实现
        useStringHandler((String msg) -> {System.out.println("我是Lambda表达式" + msg);});

    }

    // 在测试类 (StringHandlerDemo) 中存在一个方法 (useStringHandler)
    public static void useStringHandler(StringHandler stringHandler){
        stringHandler.printMessage("itheima");
    }
}

// 创建一个接口 (StringHandler)
interface StringHandler{
    // 在该接口中存在一个抽像方法 (printMessage),该方法是有参数无返回值
    void printMessage(String msg);
}