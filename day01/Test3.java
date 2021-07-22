package cn.tedu.demo;
/*
 * 练习3:打印下方一个正方体
 * ******  满5个星星，切换一行
 * ******
 * ******
 * ******
 * 
 */
public class Test3 {

	public static void main(String[] args) {
		int a=4;
		int b=6;
		//方法一
		for(int i=1;i<=a*b;i++) {
			if(i%b==0) {
				System.out.println("*");
			}else {
				System.out.print("*");
			}
		}
		System.out.println("=================");
		//方法二 双层for()循环实现
		for(int i=1;i<=a;i++) {//外层控制行
			for(int j=1;j<=b;j++) {//内层控制列
				System.out.print("*");
			}
			//换行符操作
			System.out.println();
		}
		
		
		
	}

}
