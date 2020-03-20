package by.htp.task.array1;
/*
 * дана последовательность целых чисел a1....a(n)
 * выяснить какое число встречается раньше 
 * полодительное или отрицательное
 * 
 */

public class Task3 {

	public static void main(String[] args) {
		int[] arr = new int[] { -11, 2, 0, 0, 5, 6, 0, 0, 9, 0 };
		numb(arr);
	}

	public static void numb(int[] arr) {
		for (int i = 0; i < 1; i++) {
			if (arr[i] >= 0) {
				System.out.println("первое число последовательности положительное");
			} else {
				System.out.println("первое число последовательности отрицателное");
			}

		}
	}

}
