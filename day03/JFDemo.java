package game;

import javax.swing.JFrame;

//1.JFDemo找一个父亲 JFrame  提供窗体对象的创建，大小的设置，别的一些属性
public class JFDemo extends JFrame{
	//构造方法1.用于创建对象2.用于初始化对象
	public JFDemo() {
		super();//创建出窗体对象
		//设置窗体的大小
		this.setSize(600, 500);
		//设置窗体位置居中
		this.setLocationRelativeTo(null);
		//设置关联关闭按钮
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗体的名称
		this.setTitle("雪花飘落");
		//关闭放大按钮
		this.setResizable(false);
		//创建画布类对象jp
		JPDemo jp=new JPDemo();
		//将画布类对象jp放到窗体类对象jf上
		this.add(jp);
		//调用雪花移动的方法
		jp.move();
		//使窗体可视化
		this.setVisible(true);//调用的是父类JFrame里的方法setVisible(true)
		
	}
	public static void main(String[] args) {
		//对象创建  类名 对象名 =new 类名称();
		JFDemo jf=new JFDemo();
		
	}

	


}
