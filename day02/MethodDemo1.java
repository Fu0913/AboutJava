package cn.tedu.demo;
/*
 * �������1+2+3+...+100
 *1.��main������ʵ�ָù���
 *2.������װ��һ��������ߣ�ʵ�ָù��ܡ�
 */
public class MethodDemo1 {
	//����һ����͵ķ���
	//������Ҫ��1.����֪��2.С�շ�������
	public static int getSum(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum=sum+i;
		}
		//�׳�
		return sum;
		
	}
	//��ں���
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<101;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		//��������
		getSum(100);
		//���1+2+3+...10
		getSum(10);
		//���1+2+3+..100+20
		System.out.println(sum+20);
	}
}
