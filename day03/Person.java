package cn.tedu.demo;

public class Person {
	//���ԣ�name��sex,age,height,weight  run();sleep();stduy()
	String name;
	char sex;
    int age;
	double height,weight;
	//�Լ���������Ҫ˽�л� 
	private int count;

	public  void run() {
		System.out.println("���ܡ�������");
	}
	public  void sleep() {
		run();
		System.out.println(age);
		System.out.println("˯����������");//�߼�������д�޸�ʵ��
	}
	public  void study() {
		System.out.println("ѧϰ��������");
	}
	//ʵ��˽�л������뱻���˷��ʵ�
	private void method() {
		System.out.println("˽�еķ���");
	}
	
	

}
