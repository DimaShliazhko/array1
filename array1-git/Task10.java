package by.htp.task.array1;
/*
 * даны целые числа a1...a(n) вывести на печать только те числа a(i) > i
 * 
 */

public class Task10 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 5, 1, 1, 16, 2, 4, 9, 8 };
		printNewArr(arr);
	}

	public static void printNewArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.println(arr[i]);
			}
		}

	}

}
