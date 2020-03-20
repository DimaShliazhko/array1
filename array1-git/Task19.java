package by.htp.task.array1;
/*
 * в массиве целых чисел с количеством элементов n найти наиболее
 * часто встречающееся число
 * если таки хчисел несколько то определить наименьшее из них
 * 
 */

public class Task19 {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 5, 3, 5, 3, 16, 88, 32, 5, 76 };
		search(arr);
	}

	public static void search(int[] arr) {

		int frequent;// запоминаем элемент
		int pre;// запонинаем количество предыдущих повторений
		pre = 0;
		frequent = 0;
		int k;
		int i;
		for (int j = 0; j < arr.length; j++) {
			k = 0;
			for (i = 0; i < arr.length; i++) {
				if (arr[j] == arr[i] && pre <= k) {
					k++;
					// frequent = arr[i];
				}

			}
			/// frequent = arr[j];
			if (pre <= k && frequent < arr[j]) {
				pre = k;
				frequent = arr[j];
				System.out.println("k = " + k);
				System.out.println("arr " + frequent);

			}

		}

	}
}
