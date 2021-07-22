package cn.tedu.demo;

public class LiuChengDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.顺序语句
		System.out.println("我爱学习，我喜欢学习java");
		System.out.println("我爱学习");
		System.out.println("我喜欢学习java");
		//2.分支语句 (1)if(表达式){}
		//(2)if(){}else{}  二选一
		//(3)if(表达式1){语句体1}else if(表达式2){语句体2}else{语句体3} 三选一
		
//		if(count>90) {
//			System.out.println("优秀");
//		}
//		if(count>90) {
//			System.out.println("优秀");
//		}else {
//			System.out.println("良好");
//		}
//		int count=100;
//		if(count>80&count<90) {
//			System.out.println("良好");
//		}else if(count>90) {
//			System.out.println("优秀");
//		}else if(count>60&count<80){
//			System.out.println("一般");
//		}else {
//			System.out.println("不及格");
//		}
		//3.循环语句  解决重复的问题
		//练习1：需求： 我想打印三遍：我爱学习，我喜欢学习java
		//代码冗余
		System.out.println("我爱学习，我喜欢学习java");
		System.out.println("我爱学习，我喜欢学习java");
		System.out.println("我爱学习，我喜欢学习java");
		//(1)for(表达式1;表达式2;表达式3){循环体}
		for(int i=1;i<=30;i++) {
			//表达式1->表达式2->循环体->表达式3->表达式2->循环体->表达式3.....
			//i++:i=i+1; 自增1
			System.out.println("我爱学习，我喜欢学习java");
		}
//		//练习2 打印1到100
//		for(int i=1;i<=100;i++) {
//			//""字符串，将里边的内容原样输出
//			System.out.println(i);
//		}
		//(2)while(判断条件){循环体}
		int i=1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		//(3)do...while();
		//break; 
		//continue
		//打印1到10  我不希望4被打印出来 1235678910
		for(int i1=1;i1<=10;i1++) {
			if(i1==4) {
				continue;//跳出当前循环，进入下一轮循环
			}
			System.out.print(i1);
		}
		System.out.println("=====================");
		//打印1到10,当i变量到了8时候，不在进行打印。
		for(int i1=1;i1<=10;i1++) {
			if(i1==8) {
				break;//结束循环
			}
			System.out.print(i1);
		}
	}

}





