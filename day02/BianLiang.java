package cn.tedu.demo;

import java.lang.reflect.Method;

public class BianLiang {
	/*��Ա���� 
	 * 1.�������൱�У��������
	 * 2.��Ա�����ڶ����ʱ��û�и�ֵ����ôϵͳ�������һ��Ĭ�ϵĳ�ʼֵ*/
	
	static int c;
	static double d;
	static boolean g;
	int age=30;//��Ա����
	public  void method() {
		//�ֲ�����
		int e=1,f=2;
		int age=20;//�ֲ�����
		System.out.println(e);
		System.out.println(f);
		System.out.println(age);//���ʾֲ�����age=20
		System.out.println(this.age);//���ʳ�Ա����age=30
	}
	//static :��̬�ģ������ڷǾ�̬���ؽ��ڴ�
	public static void main(String[] args) {
	/*�ֲ����� 
	 * 1.�����ڷ�����
	 *2.�ֲ�������ʹ�õ�ʱ������ʼ��
	 **/	
		int a=10;
		int b;
		int age=20;
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(g);
		
	}
		
}
