package cn.tedu.demo;

public class B extends A{
	int a=20;
	public B() {
		super();//用来调用父类的无参构造方法
		System.out.println("B的无参构造方法被执行了。。。");
	}
	public B(int aa) {
		System.out.println("B的有参构造方法被执行了。。。");
		int a=30;
		System.out.println(a);//30  就近原则
		System.out.println(this.a);//本类的成员变量a=20
		System.out.println(super.a);////父类的成员变量a=10
	}

	public static void main(String[] args) {
		B b=new B(10);//使用了无参构造方法来创建对象的


	}

}
