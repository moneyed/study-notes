package java.practice.java.practice;

/*
 * 1 对象数组题目：定义类Student，包含三个属性：
 * 学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：  1) 生成随机数：Math.random()，返回值类型double;  
 * 		2) 四舍五入取整：Math.round(double d)，返回值类型long。
 * 
 * 此代码是对StudentTest.java的改进，将操作数组的功能封装到方法中。
 */
public class StudentTest2 {
	public static void main(String[] args) {
		//声明一个Student类型的数组
		Student2[] stu = new Student2[20];
		
		for(int i = 0;i <stu.length;i++){
			//给数组元素赋值
			stu[i] = new Student2();
			//给Student的对象的属性赋值
			stu[i].number = i + 1;
			//年级:[1,6]
			stu[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
			//成绩:[0,100]
			stu[i].score = (int)(Math.random() * (100 - 0 + 1));
		}
		
		StudentTest2 test = new StudentTest2();
		
		//遍历学生数组
		test.print(stu);
		
		System.out.println("*********以下是问题1*********");
		
		//问题一：打印出3年级(state值为3）的学生信息。
		test.searchState(stu, 3);
		System.out.println("********以下是问题2**********");
		
		//问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息。
		test.sort(stu);
		
		//遍历学生数组
		for(int i = 0;i < stu.length;i++){
			System.out.println(stu[i].info());
		}
	}
	
	/**
	  * 
	  * @Description 遍历Student[]数组的操作
	 */
	public void print(Student2[] stu){
		for(int i = 0;i < stu.length;i++){	
			System.out.println(stu[i].info());
		}
	}
	
	/**
	  * 
	  * @Description 查找Student数组中指定年级的学习信息
	 */
	public void searchState(Student2[] stu,int state){
		for(int i = 0;i < stu.length;i++){
			if(stu[i].state == state){
				System.out.println(stu[i].info());
			}
		}
	}
	
	/**
	  * 
	  * @Description 给Student数组排序
	 */
	public void sort(Student2[] stu){
		for(int i = 0;i < stu.length - 1;i++){
			for(int j = 0;j <stu.length - 1 - i;j++){
				if(stu[j].score >stu[j+1].score){
					//如果需要换序，交换的是数组的元素，Student对象！！！
					Student2 temp = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = temp;
				}
			}
		}
	}
}
class Student2{
	int number;	//学号
	int state;	//年级
	int score;	//成绩
	
	//显示学生信息的方法
	public String info(){
		return "学号:" + number + ",年级:" + state + ",成绩:" + score;
	}
}
