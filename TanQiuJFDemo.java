package demo;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
//������
public class TanQiuJFDemo extends JFrame {
    public TanQiuJFDemo() {
        //����ɼ�
        this.setVisible(true);
        //���ô�������
        this.setTitle("������");
        //���ô����С
        this.setSize(800, 600);
        //���ô������
        this.setLocationRelativeTo(null);
        //���ù����رհ�ť
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //���ùرշŴ�ť
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
         * 1.��Ҫ�����ִ�Ӳ�̶����ڴ���
         */
        File f = new File("src/����&DJɢ��-���Ҳ�����(DJɢ�˰�).wav");
        /**
         * 2.��f����AudioClip
         */
        AudioClip ac = Applet.newAudioClip(f.toURL());
        /**
         * 3.����Play
         */
        ac.play();
    }
    public static void main(String[] args) {
        TanQiuJFDemo jf=new TanQiuJFDemo();
    }
}
