package game;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class JPDemo extends JPanel implements Runnable{
  //��һ��һģһ���ķ��������ǽ�����д��������
  int x;
  int y;
  int[]arr1=new int[300];
  int[]arr2=new int[300];
  public JPDemo(){
	
    //�����������飬���ڴ��������ɵ�xy
    for(int i=0;i<=299;i++){
    	
      int x=(int)(Math.random()*600+1);//��1��601��
      int y=(int)(Math.random()*500+1);//��1��601��
      arr1[i]=x;
      arr2[i]=y;
     
    }
  }
  @Override
  public void paint(Graphics g) {
    // TODO Auto-generated method stub
    super.paint(g);
    this.setBackground(Color.BLACK);//����Ļ������ɫ
    g.setColor(Color.WHITE);//���û�����ɫ
    for(int i=0;i<=299;i++){
      g.drawString("*", arr1[i], arr2[i]);
      
    }  
  }
  //ѩ������ķ���
  public void move() {
	  
	  new Thread() {
		  @Override
		  public void run() {
		  	while(true) {
		  		//ʵ��ѩ������
		  		for(int i=0;i<300;i++) {
		  			//ʵ��ѩ���ظ������Ч��
		  			if(arr2[i]>500){
		  				arr2[i]=0;
		  			}
		  			arr2[i]++;	
		  		}
		  	//ʵ��ѩ������
		  		for(int i=0;i<100;i++) {
		  		//ʵ��ѩ���ظ������Ч��
		  			if(arr1[i]>600){
		  				arr1[i]=0;
		  			}
		  			arr1[i]++;	
		  		}
		  		//����ѩ��������ٶ�
		  		try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  		repaint();//ȥ������paint()���»���
		  		
		  	}
		  	
		  }
	  }.start();
	  
  }
@Override
public void run() {
	// TODO Auto-generated method stub
	
}
 
  

}