package cn.tedu.demo;

public class DuiXiangTest {

	public static void main(String[] args) {
		//1.��������  ���� ������=new ������();
		DuiXiang d=new DuiXiang();
		//2.ͨ���������ȥ�����������ԣ����� 
		//2.1�������ԣ�������.������
	System.out.println(d.a);
	System.out.println(d.b);
	//2.2�������ķ���:������.������();
	d.getSum();
	d.a=100;
	System.out.println(d.a);
	//��ӡ���������d�ĵ�ֵַ
		System.out.println(d);//cn.tedu.demo.DuiXiang@15db9742
		d=null;
		int a=10;
		int b=20;
		System.out.println(d.a);//NullPointerException
		d.getSum();
		/*����һ��Person�࣬�����������ԣ����������䣬�Ա���ߣ����أ�����
		 * ��������һЩ��Ϊ(����)��ѧϰ��Ϊ���Է���Ϊ������Ϸ
		 * �ڴ���һ����PersonTest,ͨ�������ȡ�������Ժ���Ϊ
		 * */


	}

}
