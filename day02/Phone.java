package cn.tedu.demo;

public class Phone {
	public String brand;
	int price;
	String color;
	double weight;
	//private ˽�еģ�ֻ���ڱ����з���
	private int height;
	public Phone() {
		System.out.println("�޲ι���");
	}
	public Phone(int a) {
		System.out.println("�вι���");
	}
	public Phone(String brand,int price,String color,double weight) {
		this(10);//���ڵ��ñ����еĹ��췽��������ֻ�ܷ��ڵ�һ��
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.weight=weight;
	}
	//public ������
	public void call() {
		System.out.println(this.height);
		System.out.println("��绰");
	}
	public void sendMessage() {
		System.out.println("������");
	}
	public void watch() {
		System.out.println("����Ƶ");
	}

}
