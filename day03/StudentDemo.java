package cn.tedu.demo;

public class StudentDemo extends Person{
	//���ԣ�name��sex,age,height,weight  run();sleep();stduy()
	public  void play() {
		System.out.println("����Ϸ��������");
	}
	/*ѧ�� ˯����������˯��  
	 * ��д�������ڸ������У�����ķ����޷��������������
	 * 		���������൱������ʵ�ָø���ķ���
	 * */
	@Override  //@Overrideע�⣬������֤��ǰ�����Ƿ�������д
	public  void sleep() {
		System.out.println("��������Ϣ");
	}

}
