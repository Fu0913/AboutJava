package cn.tedu.demo;
//Thread�߳��� 
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
		//1.�����̶߳���
		ThreadDemo1 th1=new ThreadDemo1();
		th1.start();//��ʼ�߳�1
		ThreadDemo1 th2=new ThreadDemo1();
		th2.start();//�����߳�2	
		//
 	}

}
