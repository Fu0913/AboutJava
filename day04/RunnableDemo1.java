package cn.tedu.demo;

public   class RunnableDemo1 implements Runnable{
	//¥Ú”°1µΩ100
	@Override
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println(i);
		}
		
	}
	
	
	

}
