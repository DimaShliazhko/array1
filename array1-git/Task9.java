package by.htp.task.array1;
/*
 * 
 * даны действительные числа... поменять местами наибольший и наименьший элементы
 */

public class Task9 {
	public static void main(String[] args) {
		int n = 10;
		double[] arr = new double[n];
		double[] creatArr = creatArr(arr);
		printArr(creatArr);
		double min = minArr(creatArr);
		double max = maxArr(creatArr);
		double[] changeArr = changeArr(creatArr, min, max);
		printArr(creatArr);

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

	public static double minArr(double[] arr) {
		double min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("минимальное число = " + min);
		return min;
	}

	public static double maxArr(double[] arr) {
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("максимальное число = " + max);
		return max;
	}

	public static double[] changeArr(double[] arr, double min, double max) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == max) {
						arr[j] = min;
						arr[i] = max;
					}

				}
			}

		}

		return arr;
	}
}
