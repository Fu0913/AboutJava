package game;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class JPDemo extends JPanel implements Runnable{
  //有一个一模一样的方法，于是将其重写（画画）
  int x;
  int y;
  int[]arr1=new int[300];
  int[]arr2=new int[300];
  public JPDemo(){
	
    //定义两个数组，用于存放随机生成的xy
    for(int i=0;i<=299;i++){
    	
      int x=(int)(Math.random()*600+1);//【1，601）
      int y=(int)(Math.random()*500+1);//【1，601）
      arr1[i]=x;
      arr2[i]=y;
     
    }
  }
  @Override
  public void paint(Graphics g) {
    // TODO Auto-generated method stub
    super.paint(g);
    this.setBackground(Color.BLACK);//设置幕布背景色
    g.setColor(Color.WHITE);//设置画笔颜色
    for(int i=0;i<=299;i++){
      g.drawString("*", arr1[i], arr2[i]);
      
    }  
  }
  //雪花下落的方法
  public void move() {
	  
	  new Thread() {
		  @Override
		  public void run() {
		  	while(true) {
		  		//实现雪花下落
		  		for(int i=0;i<300;i++) {
		  			//实现雪花重复下落的效果
		  			if(arr2[i]>500){
		  				arr2[i]=0;
		  			}
		  			arr2[i]++;	
		  		}
		  	//实现雪花下落
		  		for(int i=0;i<100;i++) {
		  		//实现雪花重复下落的效果
		  			if(arr1[i]>600){
		  				arr1[i]=0;
		  			}
		  			arr1[i]++;	
		  		}
		  		//控制雪花下落的速度
		  		try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  		repaint();//去调用了paint()更新画布
		  		
		  	}
		  	
		  }
	  }.start();
	  
  }
@Override
public void run() {
	// TODO Auto-generated method stub
	
}
 
  

}