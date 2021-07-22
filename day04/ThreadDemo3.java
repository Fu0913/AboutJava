package cn.tedu.demo;

public class ThreadDemo3 {
	public static void main(String[] args) {
		//创建RunnableDemo1 对象
				RunnableDemo1 r=new RunnableDemo1();
				//创建线程类对象th1,th2
				Thread th1=new Thread(r);
				Thread th2=new Thread(r);
				th1.start();
				th2.start();
	}

}
