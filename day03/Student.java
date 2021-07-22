package cn.tedu.demo;
//创建一个学生类Student类，属性：姓名，性别，年龄，班级，行为：学习，玩游戏，看电视
//创建一个学生类Student类的测试类StudentTest类，创建Student类对象，去给该对象赋值。
public class Student  {
	String name;
	char sex;
	int age;
	//静态变量
	static String classroom;//一旦修饰一个变量的时候，那么这个变量属于类的，不在属于对象
	//构造方法：public 类名(){} 创建对象
	public Student() {
		
	}
	public Student(String name,char sex,int age,String classroom) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.classroom=classroom;
	}
	
	public void study() {
		//非静态可以访问非静态
		System.out.println(name);
		//非静态可以访问静态
		System.out.println(classroom);
		System.out.println("学习");
	}
	public static void play() {
		//静态不能访问非静态
		//System.out.println(name);
		//静态可以访问静态
		
		System.out.println("玩游戏");
	}
	public void watch() {
		//访问成员变量
		this.name="张三";
		
		Student.classroom="12312313";
		System.out.println("看视频");
	}
	

}
