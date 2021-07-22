package cn.tedu.demo;

public class DuiXiangTest {

	public static void main(String[] args) {
		//1.创建对象  类名 对象名=new 类名称();
		DuiXiang d=new DuiXiang();
		//2.通过这个对象去访问它的属性，方法 
		//2.1访问属性：对象名.变量名
	System.out.println(d.a);
	System.out.println(d.b);
	//2.2访问它的方法:对象名.方法名();
	d.getSum();
	d.a=100;
	System.out.println(d.a);
	//打印出这个对象d的地址值
		System.out.println(d);//cn.tedu.demo.DuiXiang@15db9742
		d=null;
		int a=10;
		int b=20;
		System.out.println(d.a);//NullPointerException
		d.getSum();
		/*创建一个Person类，定义他的属性（变量）年龄，性别，身高，体重，名字
		 * 定义他的一些行为(方法)，学习行为，吃饭行为，打游戏
		 * 在创建一个类PersonTest,通过对象获取他的属性和行为
		 * */


	}

}
