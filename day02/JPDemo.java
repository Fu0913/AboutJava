package demo2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPDemo extends JPanel{
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//���û����ı���ɫ--��ɫ
		this.setBackground(Color.BLACK);
		//���û��ʵ���ɫ
		g.setColor(Color.WHITE);
		g.drawString("*", 300, 400);
		
	}

}
