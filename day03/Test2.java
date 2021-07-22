package cn.tedu.demo;
//用来指定PersonDemo2的存放路径
import demo2.PersonDemo2;
/*
 * public 同包类下、同项目不同包下、父子类中也可以访问
 * private 只能在当前类中访问
 * 
 * */
public class Test2 {
	public static void main(String[] args) {
		
		//通过创建Animal对象
		Animal an=new Animal();
		//通过对象去访问该类的属性和方法
		System.out.println(an.color);
		an.eat();
		PersonDemo2 per=new PersonDemo2();
		per.run();
		System.out.println(per.age);
		
		
		
		
		
	}

}
