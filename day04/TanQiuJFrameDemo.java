package game;

import javax.swing.JFrame;
//������
public class TanQiuJFrameDemo extends JFrame {
	public TanQiuJFrameDemo() {
		//����ɼ�
		this.setVisible(true);
		//���ô�������
		this.setTitle("������");
		//���ô����С
		this.setSize(800, 600);
		//���ô������
		this.setLocationRelativeTo(null);
		//���ù����رհ�ť
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ùرշŴ�ť
		this.setResizable(false);
		TanQiuJPanelDemo jp=new TanQiuJPanelDemo();
		this.add(jp);
	jp.move();
	}
	public static void main(String[] args) {
		
		TanQiuJFrameDemo jf=new TanQiuJFrameDemo();
	}

}
