package cn.tedu.demo;
/*
 * ʵ�־žų˷���
 * 1*1=1;
 * 2*1=2;2*2=4;
 * ........
 * 9*1=9...........9*9=81;
 * */
public class Test1 {
  //���η�       ����ֵ������(����)         {������;}
	public static void main(String[] args) {
		//�������� ��ʽ:������()��
		daYin();
		System.out.println("123123123");
		System.out.println("123123123");
		System.out.println("123123123");
		System.out.println("123123123");
		System.out.println("123123123");
		daYin();
	}
	//���η�:public ����ֵ��void(�޷���ֵ) ��������daYin �������޲��� ������{}
	public static void daYin() {
		for(int i=1;i<=9;i++) {//��������
			for(int j=1;j<=i;j++) {
				//�õ��ַ���ƴ��
				System.out.print(i+"*"+j+"="+i*j+";");
			}
			//���з�����
			System.out.println();
		}
	}

}
