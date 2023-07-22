package java.practice.java.practice;

/* 
 * 三、匿名对象的使用
 * 1.理解:我们创建的对象，没有显示的赋值给一个变量名。即为匿名对象。
 * 2.特征：匿名对象只能调用一次。
 * 3.使用:如下
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
//		p = null;
		System.out.println(p);
		
		p.sendEmail();
		p.playGame();
		
		//匿名对象
//		new Phone().sendEmail();
//		new Phone().playGame();
		
		new Phone().price = 1999;
		new Phone().showPrice();	//0.0
		
		//*******************************
		PhoneMall mall = new PhoneMall();
//		mall.show(p);
		//匿名对象的使用
		mall.show(new Phone());	
	}
}

class PhoneMall{
	
	public void show(Phone phone){
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;	//价格
	
	public void sendEmail(){
		System.out.println("发邮件");
	}
	public void playGame(){
		System.out.println("打游戏");
	}
	public void showPrice(){
		System.out.println("手机价格为:" + price);
	}
}
