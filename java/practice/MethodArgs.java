package java.practice;

/*
 * 可变个数形参的方法
 * 1.jdk 5.0新增的内容
 * 2.具体使用：
 * 	2.1 可变个数形参的格式：数据类型 ... 变量名
 * 	2.2 当调用可变个数形参的方法时，传入的参数的个数可以是：0个，1个，2个...
 * 	2.3可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载。
 *  2.4可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。即二者不可共存。
 *  2.5可变个数形参在方法中的形参中,必须声明在末尾。
 *  2.6可变个数形参在方法中的形参中，最多只能声明一个可变形参。
 */
public class MethodArgs {

	public static void main(String[] args) {
		MethodArgs test = new MethodArgs();
		test.show(12);
		// test.show("hell0");
		// test.show("hello","world");
		// test.show();
             
		test.show(new String[] { "AA", "BB", "CC" });
	}

	public void show(int i) {

	}

	// public void show(String s){
	// System.out.println("show(String)");
	// }
	public void show(String... strs) {
		System.out.println("show(String ...strs)");


		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

	// 此方法与上一方法不可共存
	// public void show(String[] strs){
	//
	// }

	public void show(int i, String... strs) {

	}

	//The variable argument type String of the method show must be the last parameter
//	public void show(String... strs,int i,) {
//
//	}
}
