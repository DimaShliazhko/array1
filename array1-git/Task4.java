package by.htp.task.array1;
/*
 * 
 * дана последовательность чисел.
 * будет ли она возрастающей
 */

public class Task4 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 5, 10, 15, 16, 20, 50, 9, 90 };
		increase(arr);
	}

	public static void increase(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] < arr[i + 1]) {
				k++;

			}

		}
		if (k == arr.length - 1) {
			System.out.println("последовательность возрастающая");
		} else {
			System.out.println("последовательность не является возрастающая");
		}
	}

}
