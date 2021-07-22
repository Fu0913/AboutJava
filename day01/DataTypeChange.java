package cn.tedu.demo;

public class DataTypeChange {

	public static void main(String[] args) {
		byte a=10;
		int b=20;
		//数据类型的自动转换（小转大）
		b=a+10;//byte=byte+int=>int+int=>int
		//数据类型的强制转换（大转小）
		a=(byte)(a+10);//byte=byte+int=>int+int=>int=>byte
		double c=2.9;
		//缺点 1.精度缺失
		b=(int)c;
		System.out.println(b);
		byte d;//-128~127;
		//缺点 2.数据溢出
		d=(byte)-129;
		System.out.println(d);
		
		//布尔类型  接受两种结果，true false
		boolean e=true;
		e=3<0;
		System.out.println(e);
		
		
		
		

	}

}
