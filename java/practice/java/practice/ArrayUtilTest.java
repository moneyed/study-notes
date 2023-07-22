package java.practice.java.practice;
/*
 * 自定义数组工具类
 */
public class ArrayUtil {

	// 求数组的最大值
	public int getMax(int[] arr) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	// 求数组的最小值
	public int getMin(int[] arr) {
		int minValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	// 求数组总和
	public int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 求数组平均值
	public int getAvg(int[] arr) {
		int avgValue = getSum(arr) / arr.length;
		return avgValue;
	}

	// 反转数组
	public void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}

	// 复制数组
	public int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		return null;
	}

	// 数组排序
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// 遍历数组
	public void print(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println("]");
	}

	// 查找指定元素
	public int getIndex(int[] arr, int dest) {
		//线性查找
		for (int i = 0; i < arr.length; i++) {
			if (dest==arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
