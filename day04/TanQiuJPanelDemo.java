package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
//画布类
public class TanQiuJPanelDemo extends JPanel implements MouseMotionListener,Runnable{
	//定义小球初始位置
	int x=0,y=0;
	//定义小球的直径
	int d=100;
	//定义挡板的位置
	int dx=100,dy=500,dd=200,dh=10;
	//定义小球的方向
	int direction=1;
	//游戏的分数
	int count=0;
	//定义游戏结束的开关
	boolean flag=false;
	int speed=5;
	public TanQiuJPanelDemo() {
		//鼠标监听事件
		addMouseMotionListener(this);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//设置背景色
		this.setBackground(Color.GRAY);
		g.setColor(Color.PINK);
		//画小球
		g.fillOval(x, y, d, d);
		g.setColor(Color.BLUE);
		//画挡板
		g.fillRect(dx, dy, dd, dh);
		//设置字体的大小
		g.setFont(new Font("",Font.BOLD,44));
		//画游戏的分数
		g.drawString("分数"+count, 100, 50);
		if(flag) {
			g.drawString("游戏结束", 100, 100);
		}
		
		
	}
	//小球挡板移动
	public void move() {
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				while(true) {
					//小球往左下移动
					if(direction==1) {
						x--;
						y++;
					}
					//左边界的判断
					if(x<=0) {
						if(direction==1) {
							direction=2;
						}
						if(direction==4) {
							direction=3;
						}
					}
					//小球往右下移动
					if(direction==2) {
						x++;
						y++;
					}
					//下边界的限定
					if(y>=dy-d) {	
						//小球在挡板上
						if((x+d/2>=dx)&(x+d/2<=dx+dd)) {
							count++;
							if(direction==2) {
								direction=3;
							}
							if(direction==1) {
								direction=4;
							}
						}else {
							flag=true;
							//结束游戏
							this.stop();
						}
					}
					//小球往右上移动
					if(direction==3) {
						x++;
						y--;
					}
					//右边框的限定
					if(x+d>=800) {
						if(direction==3) {
							direction=4;
						}
						if(direction==2) {
							direction=1;
						}
					}
					//小球往左上移动
					if(direction==4) {
						x--;
						y--;
					}
					//上边框的限定
					if(y<=0) {
						if(direction==4) {
							direction=1;
						}
						if(direction==3) {
							direction=2;
						}
					}
					
					 //控制小球速度
                    try { 
                        if (count>=3&count<5){
                            speed=2;
                        }
                        if (count>=5){
                           speed=2;
                        }

                        Thread.sleep(speed);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					repaint();
				}
			}
		}.start();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		//建立挡板和鼠标的关系
		dx=e.getX()-dd/2;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}//

}
