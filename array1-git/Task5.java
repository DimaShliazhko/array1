package by.htp.task.array1;

/*
 * 
 *дана последовательность натуральных чисел a1.....a(n)
 *создать массив из четных чиссел этой последовательности
 *если таких чисел нет то вывести сообщение об этом
 */

public class Task5 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 5, 10, 15, 16, 20, 50, 9, 90 };
		int count = count(arr);
		int[] newArr = newArr(arr, count);
		printNewArr(newArr);

	}

	public static int count(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				k++;
			}
		}
		if (k == 0) {
			System.out.println("последовательность четнх чисел не имеет");

		}
		return k;
	}

	public static int[] newArr(int[] arr, int k) {
		int[] newArr = new int[k];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				newArr[count] = arr[i];
				count++;
			}

		}
		return newArr;
	}

	public static void printNewArr(int[] newArr) {
		for (int i = 0; i < newArr.length; i++) {
			System.out.println("newArr [" + i + "] = " + newArr[i]);

		}
	}
}
