package MoBanSheJi;
/*
    ����ģ����
 */
public abstract class template {

    public void write(){
        System.out.println("<��Խ���ٿ�Խ>");

        body();

        System.out.println("������ҵ�����");
    }

    // ÿ�˵��������ݶ���ͬ����������
    // ���԰Ѹ÷�������Ϊ���󷽷�
    // ���󷽷���Ҫ����������
    public abstract void body();
}
