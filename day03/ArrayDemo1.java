package cn.tedu.demo;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//1.定义一个数组 数据类型[] 数组名称=new 数据类型[数组的大小];
		int[] arr1=new int[5];//JVM提供默认的初始值
		//2.访问数组里的元素(数据)  : 数组名[索引值];  索引值是从0开始的
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[4]);
		arr1[0]=10;
		arr1[1]=20;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		//定义一个int类型的数组，它的长度是100；我想把1到100放到这个数组里
		int[] arr2=new int[100];
		//存数据
		for(int i=1;i<=100;i++) {
			arr2[i-1]=i;//arr2[99]=100
		}
		//获取数据
		for(int i=0;i<=99;i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		

	}

}
