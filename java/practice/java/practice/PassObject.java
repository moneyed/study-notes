package java.practice.java.practice;
public class PassObject {
	
	public static void main(String[] args) {
		PassObject test = new PassObject();
		
		Circle c = new Circle();
		
		test.printAreas(c, 5);
		
		System.out.println("no radius is:" + c.radius);
	}
	
	public void printAreas(Circle c,int time){
		
		System.out.println("Radius\t\tAreas");
		
		//设置圆的半径
		for(int i = 1;i <= time ;i++){
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		
		//重新赋值
		c.radius = time + 1;
	}
}
