package cn.tedu.demo;
/*
 *练习2：定义三个数，求出它们的最大值和最小值
 */
public class Test2 {

	public static void main(String[] args) {
		//思路：两两比较，将结果与第三个数进行比较
		int a=10,b=10,c=10;
		int max=0,min=0;
//		if(a>b){
//            max=a;
//            min=b;              
//        }else{
//            max=b;
//            min=a;
//        }
//        if(c>max){
//            max=c;
//        }else{
//            
//        }
//        if(c<min){
//            min=c;
//        }else{
//            
//        } 
		//三元运算符 表达式1？表达式2：表达式3；
		max=a>b?a:b;
		max=max>c?max:c;
		min=a<b?a:b;
		min=min<c?min:c;
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
	}

}
