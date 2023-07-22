package java.practice.java.practice;

/*
 *  如果参数是引用数据类型，此时实参赋值给形参的是实参存储数据的地址值。
 */
public class ValueTransferTest2 {

	public static void main(String[] args) {
		Data data = new Data();
		
		data.m = 10;
		data.n = 20;
		
		System.out.println("m = " + data.m + ", n = " + data.n);

		//交换m和n的值
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;

		ValueTransferTest2 test = new ValueTransferTest2();
		test.swap(data);
		
		System.out.println("m = " + data.m + ", n = " + data.n);

	}
	
	public void swap(Data data){
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
}


class Data{
	
	int m;
	int n;
}
