package game;

import javax.swing.JFrame;

//1.JFDemo��һ������ JFrame  �ṩ�������Ĵ�������С�����ã����һЩ����
public class JFDemo extends JFrame{
	//���췽��1.���ڴ�������2.���ڳ�ʼ������
	public JFDemo() {
		super();//�������������
		//���ô���Ĵ�С
		this.setSize(600, 500);
		//���ô���λ�þ���
		this.setLocationRelativeTo(null);
		//���ù����رհ�ť
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��������
		this.setTitle("ѩ��Ʈ��");
		//�رշŴ�ť
		this.setResizable(false);
		//�������������jp
		JPDemo jp=new JPDemo();
		//�����������jp�ŵ����������jf��
		this.add(jp);
		//����ѩ���ƶ��ķ���
		jp.move();
		//ʹ������ӻ�
		this.setVisible(true);//���õ��Ǹ���JFrame��ķ���setVisible(true)
		
	}
	public static void main(String[] args) {
		//���󴴽�  ���� ������ =new ������();
		JFDemo jf=new JFDemo();
		
	}

	


}
