package cn.tedu.demo;
//����ָ��PersonDemo2�Ĵ��·��
import demo2.PersonDemo2;
/*
 * public ͬ�����¡�ͬ��Ŀ��ͬ���¡���������Ҳ���Է���
 * private ֻ���ڵ�ǰ���з���
 * 
 * */
public class Test2 {
	public static void main(String[] args) {
		
		//ͨ������Animal����
		Animal an=new Animal();
		//ͨ������ȥ���ʸ�������Ժͷ���
		System.out.println(an.color);
		an.eat();
		PersonDemo2 per=new PersonDemo2();
		per.run();
		System.out.println(per.age);
		
		
		
		
		
	}

}
