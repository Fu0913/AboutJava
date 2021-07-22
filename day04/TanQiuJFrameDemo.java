package game;

import javax.swing.JFrame;
//窗体类
public class TanQiuJFrameDemo extends JFrame {
	public TanQiuJFrameDemo() {
		//窗体可见
		this.setVisible(true);
		//设置窗体名称
		this.setTitle("弹弹球");
		//设置窗体大小
		this.setSize(800, 600);
		//设置窗体居中
		this.setLocationRelativeTo(null);
		//设置关联关闭按钮
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置关闭放大按钮
		this.setResizable(false);
		TanQiuJPanelDemo jp=new TanQiuJPanelDemo();
		this.add(jp);
	jp.move();
	}
	public static void main(String[] args) {
		
		TanQiuJFrameDemo jf=new TanQiuJFrameDemo();
	}

}
