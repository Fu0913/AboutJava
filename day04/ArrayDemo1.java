package cn.tedu.demo;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		//����һ��byte���͵����飬���1��10;��ȡ�������ŵ�ÿһ������
		//����Ķ���1. ��������[] ��������=new ��������[����Ĵ�С];
		byte[] arr1=new byte[10];
		//2.������  ����ı���
		for(byte i=1;i<=10;i++) {
			arr1[i-1]=i;
		}
		//3.��ȡ�����е�ÿ������   ����ı���
		for(byte i=1;i<=10;i++) {
			System.out.println(arr1[i-1]);
		}
		//����һ��String�������飬���"����","����","����";��ȡ��ߵ�ÿ������
		String[] arr2=new String[3];
		arr2[0]="����";
		arr2[1]="����";
		arr2[2]="����";
		for(byte i=0;i<=2;i++) {
			System.out.println(arr2[i]);
		}
		//����Ķ���2.�ڶ����ʱ��ͬʱ��ʼ�� ��������[] ��������={���ݴ�ŵ�����};
		String[] arr3= {"����","����","����"};//��ӵ�ȷ��������ĳ���
		System.out.println(arr3[0]+arr3[1]+arr3[2]);
		//���鳣���쳣  �쳣��������ִ��󣬿��Կ��ƽ����
		//			    ���� Error ������ִ��󣬵����޷������ֻ��ǿ��ͨ���޸Ĵ���
		//1.ArrayIndexOutOfBoundsException  �����±�Խ���쳣
		//System.out.println(arr3[3]);
		//2.NullPointerException ��ָ���쳣
//		arr3=null;
//		System.out.println(arr3[0]);
		//��ȡ����ĳ���  ������.length;
		System.out.println(arr3.length);
		int tmep=20;
		int[] arr4=new int[tmep];
		for(int i=0;i<arr4.length;i++) {
			arr4[i]=i;
		}
		for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		//����һ��int��������arr1�����1��20��
		//�ٴζ��嶨��һ��int��������arr2,ȥ����arr1��ߵ�����
		//��̬�����ĵ���  ����.������();
		Test1.arryCopy(10);
		
	}

}
