package cn.tedu.demo;

public class StudentTest {
	//入口函数
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.name="张三";
		stu1.age=20;
		stu1.sex='男';
		stu1.classroom="2001班";//是每个学生个体共有的属性
		Student stu2=new Student("李四",'女',30,"2001班");
		Student stu3=new Student("王五",'女',35,"2001班");
		stu1.classroom="2002";
		System.out.println(stu1.classroom);//编译命令转换成Student.classroom 
		System.out.println(stu2.classroom);//编译命令转换成Student.classroom
		System.out.println(stu3.classroom);//编译命令转换成Student.classroom
		//访问静态属性(变量) 类名称.静态变量
		System.out.println(Student.classroom);
		stu1.play();//黄颜色：一种警告
		Student.play();
		
	}

}
