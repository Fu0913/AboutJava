package cn.tedu.demo;

public class Person {
	//�������������� ��Ա����
	//String ���������ͣ���Ϊ��Ա����������Ĭ��ֵ��NULL
	static String name;
	int age;
	double height;
	double weight;
	char sex;
	//���������й��췽��ʱ��JVM�����ṩ�޲ι��췽��
	public Person(int a) {
		System.out.println("�вι���");
	}
	public Person() {
		System.out.println("�޲ι���");
	}
	//����������Ϊ ����
	public void study() {
		System.out.println("ѧϰ");
	}
	public void eat() {
		System.out.println("�Է�");
	}
	public void play() {
		System.out.println("����Ϸ");
		
	}
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.name);
		p.name="����";
		System.out.println(p.name);
		Person p2=new Person();
		System.out.println(p2.name);
	}
	
}
