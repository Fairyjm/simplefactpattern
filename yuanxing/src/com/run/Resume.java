package com.run;

public class Resume implements Cloneable{
	
	private String name;
    private String birthday;
    private String sex;
    private String school;
    private String timeArea;
    private String company;
    
    /**
     * ���캯������ʼ��������ֵ����
     */
    public Resume(String name){
        this.name = name;
    }
    
    /**
     * @desc �趨���˻�����Ϣ
     * @param birthday ����
     * @param sex �Ա�
     * @param school ��ҵѧУ
     * @return void
     */
    public void setPersonInfo(String birthday,String sex,String school){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }
    
    /**
     * @desc �趨��������
     * @param timeArea ��������
     * @param company ���ڹ�˾
     * @return void
     */
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }
    
    /**
     * ��¡��ʵ��
     */
    public Object clone(){
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }
    
    public void display(){
        System.out.println("������" + name);
        System.out.println("����:" + birthday + ",�Ա�:" + sex + ",��ҵѧУ��" + school);
        System.out.println("��������:" + timeArea + ",��˾:" + company);
    }



}
