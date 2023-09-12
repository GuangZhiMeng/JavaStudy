package Lambda;

import java.util.Random;

public class RandomNumHandler2 {
    /*
        1. ���ȴ���һ���ӿ� (RandomNumHandler)
        2. �ڸýӿ��д���һ�����󷽷� (getNumber),�÷������޲��������з���ֵ
        3. �ڲ����� (RandomNumHandlerDemo���д���һ������ (useRandomNumHandler)
           �����ĵĲ����� RandomNumHandler ���͵�
           �ڷ����ڲ������� RandomNumHandler �� getNumber ����
     */
    public static void main(String[] args) {
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                Random r = new Random();
                int num = r.nextInt(10) + 1;
                return num;
            }
        });

        useRandomNumHandler( () -> {
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            return num;
            // ע�⣺���Lambda�������Ľӿ��еķ������з���ֵ��һ��Ҫͨ��return��䣬���������
            // �������ֱ������
        } );
    }

    // ����һ������ (useRandomNumHandler)
    public static void useRandomNumHandler(RandomNumHandler randomNumHandler){
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }

}

// ���ȴ���һ���ӿ� (RandomNumHandler)
interface RandomNumHandler{
    // �ڸýӿ��д���һ�����󷽷� (getNumber),�÷������޲��������з���ֵ
    int getNumber();
}
