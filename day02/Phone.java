package cn.tedu.demo;

public class Phone {
	public String brand;
	int price;
	String color;
	double weight;
	//private 私有的，只限于本类中访问
	private int height;
	public Phone() {
		System.out.println("无参构造");
	}
	public Phone(int a) {
		System.out.println("有参构造");
	}
	public Phone(String brand,int price,String color,double weight) {
		this(10);//用于调用本类中的构造方法，而且只能放在第一行
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.weight=weight;
	}
	//public 公开的
	public void call() {
		System.out.println(this.height);
		System.out.println("打电话");
	}
	public void sendMessage() {
		System.out.println("发短信");
	}
	public void watch() {
		System.out.println("看视频");
	}

}
