package cn.tedu.demo;

public class Test {
	public static void main(String[] args) {
		StudentDemo stu=new StudentDemo();
		System.out.println("����"+stu.name+"����"+stu.age);
		stu.play();
		stu.study();
		stu.sleep();
		stu.run();
		Teacher th=new Teacher();
		System.out.println("����"+th.name+"����"+th.age+"��Ŀ��"+th.subject);
		th.run();
		th.study();
		th.sleep();
	}

}
