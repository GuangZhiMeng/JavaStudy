package YiChang.practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // ����¼��ѧ��������������,��������Ϊ 18 - 25��,
        // ���������Χ���쳣���ݲ��ܸ�ֵ.��Ҫ����¼��,һֱ¼����ȷΪֹ��
        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("����������");
        String name = sc.nextLine();
        s.setName(name);
        while(true){
            System.out.println("����������");
            String ageStr = sc.nextLine();
            try {
                int age = Integer.parseInt(ageStr);
                s.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("������һ������");
                continue;
            }catch(RuntimeException e) {
                System.out.println("������һ�����Ϸ�Χ������");
                continue;
            }
//            if(age >= 18 && age <= 25){
//                s.setAge(age);
//                break;
//            }else{
//                System.out.println("���������Ҫ�������");
//                continue;
//            }
        }
        System.out.println(s);
    }
}
