package demo;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
//������
public class TanQiuJPDemo extends JPanel implements MouseMotionListener,Runnable{
    //����С���ʼλ��
    int x=0,y=0;
    //����С���ֱ��
    int d=100;
    //���嵲���λ��
    int dx = 100,dy = 500,dd = 200,dh = 10;
    //����С��ķ���
    int direction = 1;
    //��Ϸ�ķ���
    int count = 0;
    //������Ϸ�����Ŀ���
    boolean flag = false;
    int speed = 5;
    public TanQiuJPDemo() {
        //�������¼�
        addMouseMotionListener(this);
    }
    //�����ʼ�ȼ�
    int level = 1;
    //���屳��ͼ
    public static Color randomColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }
    @Override
    public void paint(Graphics g) {
        BufferedImage bg=null;
        try {
            bg=(BufferedImage) ImageIO.read(new File("src/666.jpg"));
        }catch(Exception e){
            e.printStackTrace();
        }
        // TODO Auto-generated method stub
        super.paint(g);
        //���ñ���ɫ
        g.drawImage((Image) bg,0,0,null);
        this.setBackground(Color.BLACK);
        g.setColor(Color.PINK);
    // ��С��
        g.setColor(randomColor());
    g.fillOval(x, y, d, d);
        //������
        g.setColor(Color.YELLOW);
        g.fillRect(dx, dy, dd, dh);
        //��������Ĵ�С
        g.setFont(new Font("",Font.BOLD,40));
        g.setColor(randomColor());
        //����Ϸ�ķ���
        g.drawString("����"+count, 100, 50);
        //��Ϸ�ĵȼ�
        g.drawString("�ȼ�"  + level, 120,100);
        //������ʾ
        g.setColor(Color.GREEN);
        g.drawString("��ʾ:",400,50);
        g.setColor(Color.CYAN);
         g.drawString("ף����Ŀ���",400,90);
        if(flag) {
           // g.drawString("��Ϸ����", 200, 100);
            //����������ɫΪ��ɫ
            g.setColor(Color.red);
            //���������ͺţ����üӴ֣����������С
            g.setFont(new Font("΢���ź�",Font.BOLD,50));
            //��ʾ����
            g.drawString("GAMEOVER",280,300);
            //����������ɫΪ��ɫ
            g.setColor(Color.green);
            //���������ͺţ����üӴ֣����������С
            g.setFont(new Font("΢���ź�",Font.BOLD,50));
            //��ʾ����
            g.drawString("��Ϸ����",280,350);
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
                    if(x <= 0) {
                        if(direction == 1) {
                            direction = 2;
                        }
                        if(direction == 4) {
                            direction = 3;
                        }
                    }
                    //С���������ƶ�
                    if(direction == 2) {
                        x++;
                        y++;
                    }
                    //�±߽���޶�
                    if(y >= dy - d) {
                        //С���ڵ�����
                        if((x + d / 2 >= dx)&(x + d / 2 <= dx + dd)) {
                            count += 10;
                            level++;
                            if(direction == 2) {
                                direction = 3;
                            }
                            if(direction == 1) {
                                direction = 4;
                            }
                        }else {
                            flag = true;
                            //������Ϸ
                            this.stop();
                        }
                    }
                    //С���������ƶ�
                    if(direction == 3) {
                        x++;
                        y--;
                    }
                    //�ұ߿���޶�
                    if(x + d >= 800) {
                        if(direction == 3) {
                            direction = 4;
                        }
                        if(direction == 2) {
                            direction = 1;
                        }
                    }
                    //С���������ƶ�
                    if(direction == 4) {
                        x--;
                        y--;
                    }
                    //�ϱ߿���޶�
                    if(y <= 0) {
                        if(direction == 4) {
                            direction = 1;
                        }
                        if(direction == 3) {
                            direction = 2;
                        }
                    }

                    //����С���ٶ�
                    try {
                       if (count >50 & count <=100){
                           speed = 4;
                       }
                        if (count >100 & count <=150){
                            speed = 3;
                        }
                        if (count >150 & count <=200){
                            speed = 2;
                        }
                        if (count >200){
                            speed = 1;
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
    public void mouseDragged(MouseEvent e) { }
    @Override
    public void mouseMoved(MouseEvent e) {
        //������������Ĺ�ϵ
        dx=e.getX() - dd / 2;
    }
    @Override
    public void run() { }
}
