package Lambda;

public class TestLambda {
    /*
        Lambda表达式的使用前提
        1. 有一个接口（Lambda只能操作接口，不能操作类）
        2. 接口中有且仅有一个抽象方法

        1.编写一个接口 (ShowHandler)
        2.在该接口中存在一个抽象方法 (show),该方法是无参数无返回值
        3.在测试类 (ShowHandlerDemo) 中存在一个方法 (useShowHandler),方法的的参数是 ShowHandle 类型的，在方法内部调用了 ShowHandler 的 show 方法
    */

    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类中的show方法");
            }
        });

        // lambda 实现
        // 函数式编程思想，重点关注做什么
        useShowHandler( () -> {System.out.println("我是Lambda中的show方法");} );
    }

    // 3
    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();
    }
}

// 1,2
interface ShowHandler{
    void show();
}
