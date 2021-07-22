package cn.tedu.demo;

public class Person {
	//定义了它的属性 成员变量
	//String 是引用类型，作为成员变量，它的默认值是NULL
	static String name;
	int age;
	double height;
	double weight;
	char sex;
	//当该类中有构造方法时，JVM不在提供无参构造方法
	public Person(int a) {
		System.out.println("有参构造");
	}
	public Person() {
		System.out.println("无参构造");
	}
	//定义它的行为 方法
	public void study() {
		System.out.println("学习");
	}
	public void eat() {
		System.out.println("吃饭");
	}
	public void play() {
		System.out.println("玩游戏");
		
	}
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.name);
		p.name="张三";
		System.out.println(p.name);
		Person p2=new Person();
		System.out.println(p2.name);
	}
	
}
