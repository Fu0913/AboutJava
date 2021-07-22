package cn.tedu.demo;

public class GouZaoMethodTest {

	public static void main(String[] args) {
		GouZaoMethod g1=new GouZaoMethod();
		System.out.println(g1.a);
		g1.a=10;
		System.out.println(g1.a);
		//通过构造方法创建对象的时候，起到一个初始化对象
		GouZaoMethod g2=new GouZaoMethod(10);
		System.out.println(g2.a);//
		/*
		 * 编写一个手机类Phone,价格，颜色，品牌，重量
		 * 功能：打电话，发短信，看视频
		 * 编写一个手机类测试类PhoneTest，要求创建两个品牌的手机对象。
		 * */
		
	}

}
