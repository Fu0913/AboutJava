package cn.tedu.demo;
//当前这个类的存放的位置
import java.util.Scanner;

//猜数字 给你一个数，你去把他猜出来。
public class Test4 {
	public static void main(String[] args) {
		int temp=50;//未知的一个数字
		System.out.println("请开始猜数字，范围是1到100");
		//创建scan对象
		Scanner scan=new Scanner(System.in);
		//定义一个开关
		boolean flag=true;
		//定义一个变量，统计猜数字的次数
		int count=0;
		//定义了一个死循环
		while(flag) {
			int guess=scan.nextInt();//将键盘输入的数据获取到并且给了guess
			count++;
			if(guess>temp) {
				System.out.println("猜大了");
			}else if(guess<temp) {
				System.out.println("猜小了");
			}else {
				System.out.println("猜对了");
				System.out.println("一共猜了"+count+"次数");
				flag=false;
			}
		}
		//休息10分钟，17：15继续
		
		
		
	}

}
