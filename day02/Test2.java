package cn.tedu.demo;
/*
 *������һ����������ʵ��+ - *  /�Ĺ��� 
 *Ҫ�����ĸ�����ʵ�֣����ĸ�����Ҫ�󷽷���һ��
 * */
public class Test2 {
	public static void method(int a,int b) {
		System.out.println("a+b="+(a+b));
	}
	public static void method(int a,byte b) {
		System.out.println("a-b="+(a-b));
	}
	public static void method(int a,double b) {
		System.out.println("a*b="+(a*b));
	}
	
	public  static void method(int a,short b) {
		System.out.println("a/b="+(a/b));
	}

	public static void main(String[] args) {
		method(10,20);
		method(10,(byte)20);
		method(10,(double)20);
		method(10,(short)20);
		
	}

}
