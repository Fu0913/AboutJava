package cn.tedu.demo;

public class Test1 {
	public static void arryCopy(int a) {
		//����һ��int��������arr1�����1��20��
		//�ٴζ��嶨��һ��int��������arr2,ȥ����arr1��ߵ�����
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
