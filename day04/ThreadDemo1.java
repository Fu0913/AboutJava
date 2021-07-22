package cn.tedu.demo;
//Thread线程类 
public class ThreadDemo1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=1;i<100;i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		//1.创建线程对象
		ThreadDemo1 th1=new ThreadDemo1();
		th1.start();//开始线程1
		ThreadDemo1 th2=new ThreadDemo1();
		th2.start();//开启线程2	
		//
 	}

}
