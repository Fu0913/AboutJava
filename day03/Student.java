package cn.tedu.demo;
//����һ��ѧ����Student�࣬���ԣ��������Ա����䣬�༶����Ϊ��ѧϰ������Ϸ��������
//����һ��ѧ����Student��Ĳ�����StudentTest�࣬����Student�����ȥ���ö���ֵ��
public class Student  {
	String name;
	char sex;
	int age;
	//��̬����
	static String classroom;//һ������һ��������ʱ����ô�������������ģ��������ڶ���
	//���췽����public ����(){} ��������
	public Student() {
		
	}
	public Student(String name,char sex,int age,String classroom) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.classroom=classroom;
	}
	
	public void study() {
		//�Ǿ�̬���Է��ʷǾ�̬
		System.out.println(name);
		//�Ǿ�̬���Է��ʾ�̬
		System.out.println(classroom);
		System.out.println("ѧϰ");
	}
	public static void play() {
		//��̬���ܷ��ʷǾ�̬
		//System.out.println(name);
		//��̬���Է��ʾ�̬
		
		System.out.println("����Ϸ");
	}
	public void watch() {
		//���ʳ�Ա����
		this.name="����";
		
		Student.classroom="12312313";
		System.out.println("����Ƶ");
	}
	

}
