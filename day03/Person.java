package cn.tedu.demo;

public class Person {
	//属性：name，sex,age,height,weight  run();sleep();stduy()
	String name;
	char sex;
    int age;
	double height,weight;
	//自己的属性想要私有化 
	private int count;

	public  void run() {
		System.out.println("奔跑。。。。");
	}
	public  void sleep() {
		run();
		System.out.println(age);
		System.out.println("睡觉。。。。");//逻辑代码重写修改实现
	}
	public  void study() {
		System.out.println("学习。。。。");
	}
	//实现私有化，不想被别人访问到
	private void method() {
		System.out.println("私有的方法");
	}
	
	

}
