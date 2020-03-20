package by.htp.task.array1;
/*
 * дана последовательность целыйх чисел 
 * образовать новую послеодвательность
 * выбросив из исходной те члены которые равны
 * min (a1,a2....a(n))
 * 
 */

public class Task17 {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 40, 68, 5, 52, 16, 18, 5, 5, 76 };
		int min;
		min = 5;
		printArr(arr);
		int amount = amount(arr, min);
		int[] newArr = newArr(arr, amount, min);
		printArr(newArr);

	}

	public static void printArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] " + arr[i]);

		}
	}

	public static int amount(int[] arr, int min) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == min) {
				k++;
			}

		}
		System.out.println("k = " + k);
		return k;
	}

	public static int[] newArr(int[] arr, int a, int min) {
		int[] newArr = new int[arr.length - a];
		int k;
		k = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != min) {
				newArr[k] = arr[i];
				k++;
			}
			
		}
		return newArr;
	}
}