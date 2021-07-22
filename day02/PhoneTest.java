package cn.tedu.demo;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建对象
		Phone phone1=new Phone();
		phone1.brand="华为";
		phone1.color="黑色";
		phone1.price=4999;
		phone1.weight=180;
	
		System.out.println("手机是："+phone1.brand+"颜色是："+phone1.color+"价格是："+phone1.price+"重量是："+phone1.weight);
		phone1.call();
		phone1.sendMessage();
		phone1.watch();
		
		Phone phone2=new Phone("小米",3999,"白色",190);
		System.out.println("手机是："+phone2.brand+"颜色是："+phone2.color+"价格是："+phone2.price+"重量是："+phone2.weight);
		phone2.call();
		phone2.sendMessage();
		phone2.watch();
		Phone phone3=new Phone("苹果",6999,"蓝色",200);
		phone3.call();
		phone3.sendMessage();
		phone3.watch();
		
		
	}

}
