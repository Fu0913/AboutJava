package cn.tedu.demo;
/*
 * 练习1：平年闰年
 *判断是否是闰年。两个条件：
* 1、能被4整除，并且不能被100整除 year%4==0&year%100!=0;
* 2、或者能被400整除 year%400==0
 *
 */
public class Test1 {

	public static void main(String[] args) {
		int year=2021;
		if((year%4==0&year%100!=0)|year%400==0) {
			System.out.println("闰年");
		}else {
			System.out.println("平年");
		}
		

	}

}
