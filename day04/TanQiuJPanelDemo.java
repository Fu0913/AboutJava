package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
//������
public class TanQiuJPanelDemo extends JPanel implements MouseMotionListener,Runnable{
	//����С���ʼλ��
	int x=0,y=0;
	//����С���ֱ��
	int d=100;
	//���嵲���λ��
	int dx=100,dy=500,dd=200,dh=10;
	//����С��ķ���
	int direction=1;
	//��Ϸ�ķ���
	int count=0;
	//������Ϸ�����Ŀ���
	boolean flag=false;
	int speed=5;
	public TanQiuJPanelDemo() {
		//�������¼�
		addMouseMotionListener(this);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//���ñ���ɫ
		this.setBackground(Color.GRAY);
		g.setColor(Color.PINK);
		//��С��
		g.fillOval(x, y, d, d);
		g.setColor(Color.BLUE);
		//������
		g.fillRect(dx, dy, dd, dh);
		//��������Ĵ�С
		g.setFont(new Font("",Font.BOLD,44));
		//����Ϸ�ķ���
		g.drawString("����"+count, 100, 50);
		if(flag) {
			g.drawString("��Ϸ����", 100, 100);
		}
		
		
	}
	//С�򵲰��ƶ�
	public void move() {
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				while(true) {
					//С���������ƶ�
					if(direction==1) {
						x--;
						y++;
					}
					//��߽���ж�
					if(x<=0) {
						if(direction==1) {
							direction=2;
						}
						if(direction==4) {
							direction=3;
						}
					}
					//С���������ƶ�
					if(direction==2) {
						x++;
						y++;
					}
					//�±߽���޶�
					if(y>=dy-d) {	
						//С���ڵ�����
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
							//������Ϸ
							this.stop();
						}
					}
					//С���������ƶ�
					if(direction==3) {
						x++;
						y--;
					}
					//�ұ߿���޶�
					if(x+d>=800) {
						if(direction==3) {
							direction=4;
						}
						if(direction==2) {
							direction=1;
						}
					}
					//С���������ƶ�
					if(direction==4) {
						x--;
						y--;
					}
					//�ϱ߿���޶�
					if(y<=0) {
						if(direction==4) {
							direction=1;
						}
						if(direction==3) {
							direction=2;
						}
					}
					
					 //����С���ٶ�
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
		//������������Ĺ�ϵ
		dx=e.getX()-dd/2;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}//

}
