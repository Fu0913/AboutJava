package cn.tedu.demo;

public class B extends A{
	int a=20;
	public B() {
		super();//�������ø�����޲ι��췽��
		System.out.println("B���޲ι��췽����ִ���ˡ�����");
	}
	public B(int aa) {
		System.out.println("B���вι��췽����ִ���ˡ�����");
		int a=30;
		System.out.println(a);//30  �ͽ�ԭ��
		System.out.println(this.a);//����ĳ�Ա����a=20
		System.out.println(super.a);////����ĳ�Ա����a=10
	}

	public static void main(String[] args) {
		B b=new B(10);//ʹ�����޲ι��췽�������������


	}

}
