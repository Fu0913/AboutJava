package cn.tedu.demo;

import java.lang.reflect.Method;

public class BianLiang {
	/*成员变量 
	 * 1.定义在类当中，方法外边
	 * 2.成员变量在定义的时候没有赋值，那么系统都会给其一个默认的初始值*/
	
	static int c;
	static double d;
	static boolean g;
	int age=30;//成员变量
	public  void method() {
		//局部变量
		int e=1,f=2;
		int age=20;//局部变量
		System.out.println(e);
		System.out.println(f);
		System.out.println(age);//访问局部变量age=20
		System.out.println(this.age);//访问成员变量age=30
	}
	//static :静态的，优先于非静态加载进内存
	public static void main(String[] args) {
	/*局部变量 
	 * 1.定义在方法中
	 *2.局部变量在使用的时候必须初始化
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
