package cn.tedu.demo;

public class PersonTest {

	public static void main(String[] args) {
		//创建Person类对象 
		//new Person();  就是调用Person()类的无参构造
		Person per=new Person();
		
		//对象名.变量名
		System.out.println(per.age);
		System.out.println(per.name);
		//调用方法  对象名.方法名();
		per.study();
		per.eat();
		per.play();
		per.name="张三";
		per.age=20;
		System.out.println(per.name);
		System.out.println(per.age);
		Person per2=new Person();
		per2.name="李四";
		per2.age=30;
		System.out.println("姓名："+per2.name+"年龄："+per2.age);
		System.out.print("=========================");
		System.out.println();//syso  Alt+/ 代码补全
	}

}
