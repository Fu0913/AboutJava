package cn.tedu.demo;

public class PersonTest {

	public static void main(String[] args) {
		//����Person����� 
		//new Person();  ���ǵ���Person()����޲ι���
		Person per=new Person();
		
		//������.������
		System.out.println(per.age);
		System.out.println(per.name);
		//���÷���  ������.������();
		per.study();
		per.eat();
		per.play();
		per.name="����";
		per.age=20;
		System.out.println(per.name);
		System.out.println(per.age);
		Person per2=new Person();
		per2.name="����";
		per2.age=30;
		System.out.println("������"+per2.name+"���䣺"+per2.age);
		System.out.print("=========================");
		System.out.println();//syso  Alt+/ ���벹ȫ
	}

}
