package cn.tedu.demo;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.��������
		Phone phone1=new Phone();
		phone1.brand="��Ϊ";
		phone1.color="��ɫ";
		phone1.price=4999;
		phone1.weight=180;
	
		System.out.println("�ֻ��ǣ�"+phone1.brand+"��ɫ�ǣ�"+phone1.color+"�۸��ǣ�"+phone1.price+"�����ǣ�"+phone1.weight);
		phone1.call();
		phone1.sendMessage();
		phone1.watch();
		
		Phone phone2=new Phone("С��",3999,"��ɫ",190);
		System.out.println("�ֻ��ǣ�"+phone2.brand+"��ɫ�ǣ�"+phone2.color+"�۸��ǣ�"+phone2.price+"�����ǣ�"+phone2.weight);
		phone2.call();
		phone2.sendMessage();
		phone2.watch();
		Phone phone3=new Phone("ƻ��",6999,"��ɫ",200);
		phone3.call();
		phone3.sendMessage();
		phone3.watch();
		
		
	}

}
