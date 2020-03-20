package by.htp.task.array1;
/*
 * определить количество элементов последовательность натуральных чисел
 * кратных числу M  и заключенных в промежутке от l до N
 * 
 */

public class Task13 {
	public static void main(String[] args) {
		int[] arr = new int[] { 30, 40, 68, 86, 52, 16, 18, 32, 64, 76, 30, 40, 68, 82, 68, 45, 12, 32, 65, 34 };
		int m;
		int l;
		int n;
		m = 5;
		l = 5;
		n = 14;
		int kol = count(arr, m, l, n);
		print(kol, m);

	}

	public static int count(int[] arr, int m, int l, int n) {
		int k = 0;
		for (int i = l; i < n; i++) {
			if (arr[i] % m == 0) {
				k++;
			}
		}
		return k;
	}

	public static void print(int k, int m) {
		System.out.println("количество чисел кратных " + m + "равно = " + k);

	}

}
