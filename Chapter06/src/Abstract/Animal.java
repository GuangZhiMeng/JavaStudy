package Abstract;

public abstract class Animal {
    // ��ˮ����
    public void drink(){
        System.out.println("��ˮ");
    }

    // �Է�����
    // ���÷�����ȡ������Animal֮������������ˣ���Ϊè���㣬������
    // ���аѸ÷�������Ϊ���󷽷�
    // ע�����󷽷���Ҫ���������С����Ѹ��ඨ��Ϊ�����࣬��classǰ����abstract
    public abstract void eat();
}
