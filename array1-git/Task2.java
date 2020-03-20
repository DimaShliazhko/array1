package by.htp.task.array1;
/*
 * 
 *  в целочисленной последовательности есть нулевые элементы.
 *  создать массив из номеров этих элементов
 */

public class Task2 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 0, 0, 5, 6, 0, 0, 9, 0 };
		int k = getСount(arr);
		int[] arrNew = creatNewArr(arr, k);
		printArrNew(arrNew);
	}

	public static int getСount(int[] arr) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				k++;

			}
		}
		return k;
	}

	public static int[] creatNewArr(int[] arr, int k) {
		int[] arrNew = new int[k];
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {

				arrNew[i] = j + 1;
				i++;
			}

		}
		return arrNew;
	}

	public static void printArrNew(int[] arrNew) {

		for (int j = 0; j < arrNew.length; j++) {

			System.out.println("arrNew[i]" + arrNew[j]);
		}

	}
}
