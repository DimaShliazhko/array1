package by.htp.task.array1;
/*
 * 
 * дана последовательность действительных чисел a1...a(n)
 * указать те элементы , которые принадлежат отрезку [c , d]
 */

public class Task15 {
	public static void main(String[] args) {
		int n;
		int c;
		int d;
		n = 20;
		c = -3;
		d = 6;
		double[] arr = new double[n];
		arr = creatArr(arr);
		printArr(arr);
		section(arr, c, d);

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

	public static void section(double[] arr,int c,int d) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] < d && arr[i] > c) {
					System.out.println("числа входящие в диапазон "+c+" "+d+" "+arr[i]);
					
				}
				
			}
			
		}
}
