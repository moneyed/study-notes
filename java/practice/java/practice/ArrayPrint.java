package java.practice.java.practice;

/*
 * int[] arr = new int[10];
 * System.out.println(arr);//地址值?
 * 
 * char[] arr1 = new char[10];
 * System.out.println(arr1);//地址值?
 */
public class ArrayPrint {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3};
        //传进去的是一个Object的对象
		System.out.println(arr);//地址值
		
		char[] arr1 = new char[]{'a','b','c'};
        //传进去的是一个数组，里面遍历数据了
		System.out.println(arr1);//abc
	}
}
