package cn.tedu.demo;

public class GouZaoMethodTest {

	public static void main(String[] args) {
		GouZaoMethod g1=new GouZaoMethod();
		System.out.println(g1.a);
		g1.a=10;
		System.out.println(g1.a);
		//ͨ�����췽�����������ʱ����һ����ʼ������
		GouZaoMethod g2=new GouZaoMethod(10);
		System.out.println(g2.a);//
		/*
		 * ��дһ���ֻ���Phone,�۸���ɫ��Ʒ�ƣ�����
		 * ���ܣ���绰�������ţ�����Ƶ
		 * ��дһ���ֻ��������PhoneTest��Ҫ�󴴽�����Ʒ�Ƶ��ֻ�����
		 * */
		
	}

}
