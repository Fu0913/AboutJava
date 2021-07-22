package cn.tedu.demo;

public class MethodDemo2 {
	//方法重载  方法名：eat 参数列表：无参数
	public static void eat() {
		System.out.println("吃早饭");
	}
	//方法重载  方法名：eat 参数列表：int a
	public static void eat(int a) {
		System.out.println("吃午饭");
	}
	
	public static void method() {
		System.out.println("这是一个无参数无返回值的方法");
	}
	public static void method(int a) {
		System.out.println("这是一个无参数无返回值的方法");
	}
	//参数列表的个数不同
	public static void method(int a,int b) {
		System.out.println(a+b);
	}
	//参数列表的类型不同
	public static void method(int a,byte b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		eat();
		eat(80);
		//10:int 20:int 
		method(10,20);
		//强制转换：int类型的20->byte类型的20
		method(10,(byte)20);
	}

}
