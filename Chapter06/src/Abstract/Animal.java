package Abstract;

public abstract class Animal {
    // 喝水方法
    public void drink(){
        System.out.println("喝水");
    }

    // 吃饭方法
    // 但该方法抽取到父类Animal之后就描述不清了，因为猫吃鱼，狗吃肉
    // 所有把该方法定义为抽象方法
    // 注：抽象方法需要存活到抽象类中——把父类定义为抽象类，在class前加上abstract
    public abstract void eat();
}
