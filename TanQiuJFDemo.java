package demo;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
//窗体类
public class TanQiuJFDemo extends JFrame {
    public TanQiuJFDemo() {
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
        TanQiuJPDemo jp=new TanQiuJPDemo();
        this.add(jp);
        jp.move();
        try {
            this.musicP();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    void musicP() throws MalformedURLException {
        /**
         * 1.需要将音乐从硬盘读到内存中
         */
        File f = new File("src/夏婉安&DJ散人-渡我不渡她(DJ散人版).wav");
        /**
         * 2.将f传给AudioClip
         */
        AudioClip ac = Applet.newAudioClip(f.toURL());
        /**
         * 3.调用Play
         */
        ac.play();
    }
    public static void main(String[] args) {
        TanQiuJFDemo jf=new TanQiuJFDemo();
    }
}
