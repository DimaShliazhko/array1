package by.htp.task.array1;
/*
 * дана последовательность чисел a1.....a(n) 
 * указать наименьшую длину числовой оси, содержащую все эти числа
 * 
 */

public class Task6 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 0, 6, 7, 8, 9, 10 };
		int max;
		max = arr[1];
		int min;
		min = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("длина числовой оси " + (max - min));
	}

}
