package cn.tedu.demo;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//1.����һ������ ��������[] ��������=new ��������[����Ĵ�С];
		int[] arr1=new int[5];//JVM�ṩĬ�ϵĳ�ʼֵ
		//2.�����������Ԫ��(����)  : ������[����ֵ];  ����ֵ�Ǵ�0��ʼ��
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[4]);
		arr1[0]=10;
		arr1[1]=20;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		//����һ��int���͵����飬���ĳ�����100�������1��100�ŵ����������
		int[] arr2=new int[100];
		//������
		for(int i=1;i<=100;i++) {
			arr2[i-1]=i;//arr2[99]=100
		}
		//��ȡ����
		for(int i=0;i<=99;i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		

	}

}
