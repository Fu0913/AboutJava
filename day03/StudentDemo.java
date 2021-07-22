package cn.tedu.demo;

public class StudentDemo extends Person{
	//属性：name，sex,age,height,weight  run();sleep();stduy()
	public  void play() {
		System.out.println("玩游戏。。。。");
	}
	/*学生 睡觉是在宿舍睡觉  
	 * 重写：发生在父子类中，父类的方法无法满足子类的需求，
	 * 		可以在子类当中重新实现该父类的方法
	 * */
	@Override  //@Override注解，用于验证当前方法是否发生了重写
	public  void sleep() {
		System.out.println("在宿舍休息");
	}

}
