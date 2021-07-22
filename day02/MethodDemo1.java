package cn.tedu.demo;
/*
 * 需求：求和1+2+3+...+100
 *1.在main方法中实现该功能
 *2.把它封装到一个方法里边，实现该功能。
 */
public class MethodDemo1 {
	//定义一个求和的方法
	//方法名要求：1.见名知意2.小驼峰命名法
	public static int getSum(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum=sum+i;
		}
		//抛出
		return sum;
		
	}
	//入口函数
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<101;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		//方法调用
		getSum(100);
		//求和1+2+3+...10
		getSum(10);
		//求和1+2+3+..100+20
		System.out.println(sum+20);
	}
}
