package by.htp.task.array1;
/*
 * 
 * дана последовательность действительных чисел a1.....a(n) заменить все ее члены
 * большего данного Z этим числом. подсчитать количество замен
 * 
 */

public class Task7 {

	public static void main(String[] args) {
		double[] arr = new double[] { 1.2, 5.0, 5.2, 1.22, 1.5, 16.1, 2.9, 4.99, 9.5, 9.0 };
		int z = 5;
		int count = newArr(arr, z);
		System.out.println("количество замен  " + count);
		printNewArr(arr);
	}

	public static int newArr(double[] arr, int z) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				count++;
			}

		}
		return count;
	}

	public static void printNewArr(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("newArr [" + i + "] = " + arr[i]);
			;
		}
	}

}
