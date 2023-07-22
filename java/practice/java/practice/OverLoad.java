package java.practice.java.practice;

/*
 * 1.编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 * 2.定义三个重载方法max()，
 * 第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 * 
 */
public class OverLoadever {
	
	public static void main(String[] args) {
		OverLoadever test = new OverLoadever();
		//1.调用3个方法
		test.mOL(5);
		test.mOL(6, 4);
		test.mOL("fg");
		
		//2.调用3个方法
		int num1 = test.max(18, 452);
		System.out.println(num1);
		double num2 = test.max(5.6, -78.6);
		System.out.println(num2);
		double num3 = test.max(15, 52, 42);
		System.out.println(num3);
	}

	//1.如下三个方法构成重载
	public void mOL(int i){
		System.out.println(i*i);
	}
	public void mOL(int i,int j){
		System.out.println(i*j);
	}
	public void mOL(String s){
		System.out.println(s);
	}
	
	//2.如下三个方法构成重载
	public int max(int i,int j){
		return (i > j) ? i : j;
	}
	public double max(double i,double j){
		return (i > j) ? i : j;
	}
	public double max(double d1,double d2,double d3){
		double max = (d1 > d2) ? d1 : d2;
		return (max > d3) ? max : d3;
	}
}
