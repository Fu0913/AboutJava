package demo2;

import javax.swing.JFrame;

public class JFDemo extends JFrame{
	//��ʼ�����������
	public JFDemo() {
		//1.ʹ���������ɼ�
		this.setVisible(true);
		//2.���ô���������
		this.setTitle("ѩ��Ʈ��");
		//3.���ô������С
		this.setSize(600, 800);
		//4.���ô������
		this.setLocationRelativeTo(null);
		//5.���ù����رհ�ť
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//6.�رշŴ�ť
		this.setResizable(true);
		JPDemo jp=new JPDemo();
		this.add(jp);
	}
	public static void main(String[] args) {
		new JFDemo();
	}

}
