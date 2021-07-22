package demo;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
//画布类
public class TanQiuJPDemo extends JPanel implements MouseMotionListener,Runnable{
    //定义小球初始位置
    int x=0,y=0;
    //定义小球的直径
    int d=100;
    //定义挡板的位置
    int dx = 100,dy = 500,dd = 200,dh = 10;
    //定义小球的方向
    int direction = 1;
    //游戏的分数
    int count = 0;
    //定义游戏结束的开关
    boolean flag = false;
    int speed = 5;
    public TanQiuJPDemo() {
        //鼠标监听事件
        addMouseMotionListener(this);
    }
    //定义初始等级
    int level = 1;
    //定义背景图
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
        //设置背景色
        g.drawImage((Image) bg,0,0,null);
        this.setBackground(Color.BLACK);
        g.setColor(Color.PINK);
    // 画小球
        g.setColor(randomColor());
    g.fillOval(x, y, d, d);
        //画挡板
        g.setColor(Color.YELLOW);
        g.fillRect(dx, dy, dd, dh);
        //设置字体的大小
        g.setFont(new Font("",Font.BOLD,40));
        g.setColor(randomColor());
        //画游戏的分数
        g.drawString("分数"+count, 100, 50);
        //游戏的等级
        g.drawString("等级"  + level, 120,100);
        //友情提示
        g.setColor(Color.GREEN);
        g.drawString("提示:",400,50);
        g.setColor(Color.CYAN);
         g.drawString("祝您玩的开心",400,90);
        if(flag) {
           // g.drawString("游戏结束", 200, 100);
            //设置字体颜色为红色
            g.setColor(Color.red);
            //设置字体型号，设置加粗，设置字体大小
            g.setFont(new Font("微软雅黑",Font.BOLD,50));
            //显示字体
            g.drawString("GAMEOVER",280,300);
            //设置字体颜色为绿色
            g.setColor(Color.green);
            //设置字体型号，设置加粗，设置字体大小
            g.setFont(new Font("微软雅黑",Font.BOLD,50));
            //显示字体
            g.drawString("游戏结束",280,350);
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
                    if(x <= 0) {
                        if(direction == 1) {
                            direction = 2;
                        }
                        if(direction == 4) {
                            direction = 3;
                        }
                    }
                    //小球往右下移动
                    if(direction == 2) {
                        x++;
                        y++;
                    }
                    //下边界的限定
                    if(y >= dy - d) {
                        //小球在挡板上
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
                            //结束游戏
                            this.stop();
                        }
                    }
                    //小球往右上移动
                    if(direction == 3) {
                        x++;
                        y--;
                    }
                    //右边框的限定
                    if(x + d >= 800) {
                        if(direction == 3) {
                            direction = 4;
                        }
                        if(direction == 2) {
                            direction = 1;
                        }
                    }
                    //小球往左上移动
                    if(direction == 4) {
                        x--;
                        y--;
                    }
                    //上边框的限定
                    if(y <= 0) {
                        if(direction == 4) {
                            direction = 1;
                        }
                        if(direction == 3) {
                            direction = 2;
                        }
                    }

                    //控制小球速度
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
        //建立挡板和鼠标的关系
        dx=e.getX() - dd / 2;
    }
    @Override
    public void run() { }
}
