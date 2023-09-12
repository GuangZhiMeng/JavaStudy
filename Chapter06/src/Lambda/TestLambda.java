package Lambda;

public class TestLambda {
    /*
        Lambda���ʽ��ʹ��ǰ��
        1. ��һ���ӿڣ�Lambdaֻ�ܲ����ӿڣ����ܲ����ࣩ
        2. �ӿ������ҽ���һ�����󷽷�

        1.��дһ���ӿ� (ShowHandler)
        2.�ڸýӿ��д���һ�����󷽷� (show),�÷������޲����޷���ֵ
        3.�ڲ����� (ShowHandlerDemo) �д���һ������ (useShowHandler),�����ĵĲ����� ShowHandle ���͵ģ��ڷ����ڲ������� ShowHandler �� show ����
    */

    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("���������ڲ����е�show����");
            }
        });

        // lambda ʵ��
        // ����ʽ���˼�룬�ص��ע��ʲô
        useShowHandler( () -> {System.out.println("����Lambda�е�show����");} );
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
