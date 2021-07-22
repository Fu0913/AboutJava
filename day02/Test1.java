package cn.tedu.demo;
/*
 * 实现九九乘法表
 * 1*1=1;
 * 2*1=2;2*2=4;
 * ........
 * 9*1=9...........9*9=81;
 * */
public class Test1 {
  //修饰符       返回值方法名(参数)         {方法体;}
	public static void main(String[] args) {
		//方法调用 格式:方法名()；
		daYin();
		System.out.println("123123123");
		System.out.println("123123123");
		System.out.println("123123123");
		System.out.println("123123123");
		System.out.println("123123123");
		daYin();
	}
	//修饰符:public 返回值：void(无返回值) 方法名：daYin 参数：无参数 方法体{}
	public static void daYin() {
		for(int i=1;i<=9;i++) {//外层控制行
			for(int j=1;j<=i;j++) {
				//用到字符串拼接
				System.out.print(i+"*"+j+"="+i*j+";");
			}
			//换行符操作
			System.out.println();
		}
	}

}
