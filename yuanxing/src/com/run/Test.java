package com.run;

public class Test {
	public static void main(String[] args) {
        //ԭ��A����
        Resume a = new Resume("С����");
        a.setPersonInfo("2.16", "��", "XX��ѧ");
        a.setWorkExperience("2012.09.05", "XX�Ƽ����޹�˾");
        
        //��¡B����
        Resume b = (Resume) a.clone();
        
        //���A��B����
        System.out.println("----------------A--------------");
        a.display();
        System.out.println("----------------B--------------");
        b.display();
        
        /*
         * ����A==B?
         * ���κεĶ���x������x.clone() !=x������¡������ԭ������ͬһ������
         */
        System.out.print("A==B?");
        System.out.println( a == b);
        
        /*
         * ���κεĶ���x������x.clone().getClass()==x.getClass()������¡������ԭ���������һ����
         */
        System.out.print("A.getClass()==B.getClass()?");
        System.out.println(a.getClass() == b.getClass());
    }


}
