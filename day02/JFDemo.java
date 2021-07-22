package demo2;

import javax.swing.JFrame;

public class JFDemo extends JFrame{
	//初始化窗体类对象
	public JFDemo() {
		//1.使窗体类对象可见
		this.setVisible(true);
		//2.设置窗体类名称
		this.setTitle("雪花飘落");
		//3.设置窗体类大小
		this.setSize(600, 800);
		//4.设置窗体居中
		this.setLocationRelativeTo(null);
		//5.设置关联关闭按钮
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//6.关闭放大按钮
		this.setResizable(true);
		JPDemo jp=new JPDemo();
		this.add(jp);
	}
	public static void main(String[] args) {
		new JFDemo();
	}

}
