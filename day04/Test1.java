package cn.tedu.demo;

public class Test1 {
	public static void arryCopy(int a) {
		//定义一个int类型数组arr1，存放1到20；
		//再次定义定义一个int类型数组arr2,去接受arr1里边的数据
		int temp=a;
		int[] arr1=new int[temp];
		for(int i=1;i<arr1.length+1;i++) {
			arr1[i-1]=i;
		}
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
	
	public static void main(String[] args) {
		arryCopy(3);
	}

}
