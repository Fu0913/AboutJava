package cn.tedu.demo;

public class Test {
	public static void main(String[] args) {
		StudentDemo stu=new StudentDemo();
		System.out.println("姓名"+stu.name+"年龄"+stu.age);
		stu.play();
		stu.study();
		stu.sleep();
		stu.run();
		Teacher th=new Teacher();
		System.out.println("姓名"+th.name+"年龄"+th.age+"科目："+th.subject);
		th.run();
		th.study();
		th.sleep();
	}

}
