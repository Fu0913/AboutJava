package cn.tedu.demo;

public class GouZaoMethod {
	int a;
	int b;
	public GouZaoMethod() {
		System.out.println("无参构造方法执行了。。。");
	}
	public GouZaoMethod(int a) {
		this.a=a;//this.a  指的是成员变量a; a:指的是局部变量a
		System.out.println("有参构造方法执行了。。。");
	}
	

	

}
