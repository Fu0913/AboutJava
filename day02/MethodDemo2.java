package cn.tedu.demo;

public class MethodDemo2 {
	//��������  ��������eat �����б��޲���
	public static void eat() {
		System.out.println("���緹");
	}
	//��������  ��������eat �����б�int a
	public static void eat(int a) {
		System.out.println("���緹");
	}
	
	public static void method() {
		System.out.println("����һ���޲����޷���ֵ�ķ���");
	}
	public static void method(int a) {
		System.out.println("����һ���޲����޷���ֵ�ķ���");
	}
	//�����б�ĸ�����ͬ
	public static void method(int a,int b) {
		System.out.println(a+b);
	}
	//�����б�����Ͳ�ͬ
	public static void method(int a,byte b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		eat();
		eat(80);
		//10:int 20:int 
		method(10,20);
		//ǿ��ת����int���͵�20->byte���͵�20
		method(10,(byte)20);
	}

}
