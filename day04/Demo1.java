package cn.tedu.demo;

public class Demo1 {
	static int age;
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.age=10;
		System.out.println(d.age);
		Demo1 d2=new Demo1();
		System.out.println(age);
	}

}
