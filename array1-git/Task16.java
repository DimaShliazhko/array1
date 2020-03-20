package by.htp.task.array1;
/*
 * даны действительные числа a1...a(n)
 * найти 
 * max (a1+a2,a2+a3....)
 * 
 */

public class Task16 {
	public static void main(String[] args) {
		int n;
		n = 10;
		double[] arr = new double[n];
		arr = creatArr(arr);
		printArr(arr);
		max(arr);

	}

	public static double[] creatArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (Math.random() * 30) - 15;

		}
		return arr;

	}

	public static void printArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] " + arr[i]);

		}
	}

	public static void max(double[] arr) {
		double max = -30;
		int i;
		int k=0;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] + arr[i + 1] > max) {
				max = arr[i] + arr[i + 1];
				k = i;
			}
		}
		System.out.println("max = " + k + " " + max);

	}

}
