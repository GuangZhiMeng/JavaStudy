package string;

import java.util.Scanner;

public class StringLogin {
    public static void main(String[] args) {
        String name1 = "��֮��";
        String pas1 = "777";

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<=3; i++) {
            System.out.println("�������û�����");
            String name2 = sc.nextLine();
            System.out.println("���������룺");
            String pas2 = sc.nextLine();
            if(name2.equals(name1) && pas2.equals(pas1)){
                System.out.println("��¼�ɹ�");
                break;
            }else {
                if (i == 3){
                    System.out.println("��¼ʧ��,���ĵ�¼�����Ѵ�������ޣ�����������");
                }else {
                    System.out.println("��¼ʧ�ܣ�����ʣ��" + (3-i) + "�λ���");
                }
            }
        }

    }
}
