package cn.tedu.demo;

public class StudentTest {
	//��ں���
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.name="����";
		stu1.age=20;
		stu1.sex='��';
		stu1.classroom="2001��";//��ÿ��ѧ�����干�е�����
		Student stu2=new Student("����",'Ů',30,"2001��");
		Student stu3=new Student("����",'Ů',35,"2001��");
		stu1.classroom="2002";
		System.out.println(stu1.classroom);//��������ת����Student.classroom 
		System.out.println(stu2.classroom);//��������ת����Student.classroom
		System.out.println(stu3.classroom);//��������ת����Student.classroom
		//���ʾ�̬����(����) ������.��̬����
		System.out.println(Student.classroom);
		stu1.play();//����ɫ��һ�־���
		Student.play();
		
	}

}
