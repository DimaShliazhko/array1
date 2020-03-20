package by.htp.task.array1;
/*
 * 
 * дан одномерный массив a[n] 
 * найти max(a2,a4,a6....) + min(a1,a1,a5....)
 * 
 */

public class Task14 {

	public static void main(String[] args) {
		// int[] arr = new int[] { 16, 4, 6, 8, 52, 3, 18, 32, 64, 76, 30, 40, 68, 82,
		// 68, 45, 12, 32, 65, 34 };
		int n = 20;
		int[] arr = new int[n];
		arr = creatArr(arr);
		printArr(arr);
		int max = max1(arr);
		int min = min2(arr);
		sum (max,min);
	}

	public static int[] creatArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 2 * arr.length) - 15;

		}
		return arr;
	}

	public static void printArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] " + arr[i]);

		}
	}

	public static int max1(int[] arr) {
		int max = -15;
		for (int i = 2; i < arr.length; i = i + 2) {
			if (arr[i] > max) {
				max = arr[i];
			}
			

		}
		System.out.println("max = "+max);
		return max;

	}
	public static int min2(int[] arr) {
		int min = 15;
		for (int i = 1; i < arr.length; i = i + 2) {
			if (arr[i] < min) {
				min = arr[i];
			}
			

		}
		System.out.println("min = "+min);
		return min;

	}
	public static void sum(int max , int min ) {
		System.out.println("сумма max + min равна = "+(max+min));
		
	}

}
