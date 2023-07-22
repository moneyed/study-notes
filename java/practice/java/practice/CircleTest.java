package java.practice.java.practice;

/*
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
//测试类
public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		c1.radius = 2.1;
		
		//对应方式一:
//		double area = c1.findArea();
//		System.out.println(area);
		
		//对应方式二:
		c1.findArea();
		//错误的调用
		double area = c1.findArea(3.4);
		System.out.println(area);
	}
}
//圆:3.14*r*r
class Circle{
	//属性
	double radius;
	
	//圆的面积方法
	//方法1：
//	public double findArea(){
//		double area = 3.14 * radius * radius;
//		return area;
//	}	
	//方法2：
	public void findArea(){
		double area = Math.PI * radius * radius;
		System.out.println("面积为:" + area);
	}
	//错误情况:
	public double findArea(Double r){
		double area = 3.14 * r * r;
		return area;
	}
}
