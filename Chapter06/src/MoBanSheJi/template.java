package MoBanSheJi;
/*
    作文模板类
 */
public abstract class template {

    public void write(){
        System.out.println("<跨越，再跨越>");

        body();

        System.out.println("这就是我的作文");
    }

    // 每人的作文内容都不同，描述不清
    // 所以把该方法定义为抽象方法
    // 抽象方法需要存活到抽象类中
    public abstract void body();
}
