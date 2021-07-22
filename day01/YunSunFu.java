package cn.tedu.demo;

public class YunSunFu {

	public static void main(String[] args) {
		//1.算数运算符 + 、-、*、 / 、 % 、++、 --
		int a=10;int b=20;
		System.out.println(a+b);//30
		System.out.println(a-b);//-10
		System.out.println(a*b);//200
		//int/int=>int,直接抹去小数部分
		System.out.println(a/b);//0  int/int=>int 10/20=0
		System.out.println(a%b);//10/20=0....10;
		//练习1 有一个数98，我想分别获取他的十位，个位；给了变量 c d
		int c=98/10;//98/10=9....8;
		int d=98%10;
		System.out.println("c:"+c+"d:"+d);
		//++ -- 单独使用的时候：前++和后++效果一样
		int e=1;
		e++;//后++ ：e=e+1;
		System.out.println(e);//2
		++e;//前++ e=e+1;
		System.out.println(e);//3
		//8 混合使用的时候：前++先自增1，在参与运算 
		//后++先参与运算，在自增1
		System.out.println(e++ + ++e);//3+5=8; e=3;e++; 3+ 5
		System.out.println(e);//5
		
		System.out.println("===================================");
		//2.比较运算符 == 、！=
		//在基本数据类型中，==比较的是数值的大小关系
		System.out.println(3==5);
		System.out.println(3!=5);
		//3.逻辑运算符 &、| 字符串拼接
		//3.1 &与运算  全真为真，一假为假
		System.out.println(3>5&4<10);//false&true=>false
		int x=10;int y=20;int z=30;
		if(x>y&x>z) {
			//syso Alt+/:代码补全
			System.out.println("最大数值是："+x);
			
			
		}
		//3.2| 或运算 一真为真，全假为假
		System.out.println(3>2|3>10);//true|false=>true
		System.out.println(3>7|3>10);//false|false=>false
		int i=10,j=15;
		System.out.println(++i>3&j--<10);//i=i+1;11>3&15<10;j=j-1; true&false=>false
		System.out.println(i);//11
		System.out.println(j);//14
		//&&短路与  当左边已经确定答案的时候，那么右边将不在进行判断，起到短路效果。
		System.out.println(i++<3&&++j>10);//false  11<3;i++;
		System.out.println(i);//12
		System.out.println(j);//14
		System.out.println("=====================");
		//或运算
		System.out.println(++i>10|j++<20);//true ++i;true|true=>true;j++;
		System.out.println(i);//13
		System.out.println(j);//15
		// ||短路或 当左边已经确定答案的时候，那么右边将不在进行判断，起到短路效果。
		System.out.println(++i>10||j++<20);//true  ++i;true;
		System.out.println(i);//14
		System.out.println(j);//15
		//3.3字符串拼接+  一个" "+任意类型变量=>一个新的字符串；
		System.out.println("我喜欢"+"学习");//"我喜欢"+"学习"=>"我喜欢学习"
		System.out.println("当前i的值："+i);//"当前i的值："+变量i=>"当前i的值：14"
		System.out.println("123"+i+j);//1231415  "123"+14=>"12314"+15=>"1231415"
		System.out.println("123"+(i+j));//12329  "123"+29=>"12329"
		//4.三元运算符 表达式1？表达式2：表达式3；
		int a1=3<2?19:20;
		System.out.println(a1);
		//5.赋值运算符 =、+=、-=、*=、/=、
		int a2=10;
		//+=
		a2+=10;//a2=a2+10;
		System.out.println(a2);//20
		a2*=10;//a2=a2*10=200;
		System.out.println(a2);
		//
				
		
	}

}
