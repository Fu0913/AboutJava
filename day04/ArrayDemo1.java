package cn.tedu.demo;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		//定义一个byte类型的数组，存放1到10;获取数组里存放的每一个数据
		//数组的定义1. 数据类型[] 数组名称=new 数据类型[数组的大小];
		byte[] arr1=new byte[10];
		//2.存数据  数组的遍历
		for(byte i=1;i<=10;i++) {
			arr1[i-1]=i;
		}
		//3.获取数组中的每个数据   数组的便利
		for(byte i=1;i<=10;i++) {
			System.out.println(arr1[i-1]);
		}
		//定义一个String类型数组，存放"张三","李四","王五";获取里边的每个数据
		String[] arr2=new String[3];
		arr2[0]="张三";
		arr2[1]="李四";
		arr2[2]="王五";
		for(byte i=0;i<=2;i++) {
			System.out.println(arr2[i]);
		}
		//数组的定义2.在定义的时候同时初始化 数据类型[] 数组名称={数据存放的数据};
		String[] arr3= {"张三","李四","王五"};//间接的确定了数组的长度
		System.out.println(arr3[0]+arr3[1]+arr3[2]);
		//数组常见异常  异常：程序出现错误，可以控制解决的
		//			    错误： Error 程序出现错误，但是无法解决，只能强行通过修改代码
		//1.ArrayIndexOutOfBoundsException  数组下标越界异常
		//System.out.println(arr3[3]);
		//2.NullPointerException 空指针异常
//		arr3=null;
//		System.out.println(arr3[0]);
		//获取数组的长度  数组名.length;
		System.out.println(arr3.length);
		int tmep=20;
		int[] arr4=new int[tmep];
		for(int i=0;i<arr4.length;i++) {
			arr4[i]=i;
		}
		for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		//定义一个int类型数组arr1，存放1到20；
		//再次定义定义一个int类型数组arr2,去接受arr1里边的数据
		//静态方法的调用  类名.方法名();
		Test1.arryCopy(10);
		
	}

}
