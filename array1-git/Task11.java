package by.htp.task.array1;
/*
 * 
 * даны натуральные числа a1..a(n) указать те их них 
 * у которых остаток от деления на M равен L (0<L<,M-1) 
 */

public class Task11 {
	public static void main(String[] args) {
		int[] arr = new int[] { 30, 40, 68, 86, 52, 16, 18, 32, 64, 76 };
		int m = 3;
		printNewArr(arr, m);

	}

	public static void printNewArr(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(+(arr[i] % n));
			if ((arr[i] % n) > 0 && (arr[i] % n) < n - 1) {
				// System.out.println("");
				System.out.println("arr[i] % n= " + (arr[i] % n));

			}
		}
	}

}
