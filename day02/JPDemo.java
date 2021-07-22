package demo2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPDemo extends JPanel{
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//设置画布的背景色--黑色
		this.setBackground(Color.BLACK);
		//设置画笔的颜色
		g.setColor(Color.WHITE);
		g.drawString("*", 300, 400);
		
	}

}
