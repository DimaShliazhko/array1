package by.htp.task.array1;
/*
 * данн массив действительных числел, размерность которого n
 * подсчитать сколько в нем отрицательных положительных и нулевых элементов
 * 
 */

public class Task8 {
	public static void main(String[] args) {
		int n = 10;
		double[] arr = new double[n];
		double[] creatArr = creatArr(arr);
		printArr(creatArr);
		countpositive(creatArr);
		countnegative(creatArr);
		countnull(creatArr);

	}

	public static double[] creatArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (Math.random() * 30) - 15;

		}
		return arr;

	}

	public static void printArr(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("newArr [" + i + "] = " + arr[i]);
		}
	}

	public static void countpositive(double[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				k++;
			}
		}
		System.out.println("количество положительных чисел "+k);

	}
	public static void countnegative(double[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				k++;
			}
		}
		System.out.println("количество отрицательных чисел "+k);

	}
	public static void countnull(double[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				k++;
			}
		}
		System.out.println("количество нулей "+k);

	}

}
