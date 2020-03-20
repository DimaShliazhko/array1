package by.htp.task.array1;
/*
 * 
 * в массив a[n] занесены натуральные числа. найдите сумму тех элементов ,
 * которые кратны данному k
 */

public class Task1 {

	public static void main(String[] args) {
		int k;
		int n;
		int sum;
		sum = 0;
		n = 10;
		k = 3;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("сумма равна " + sum);
	}

}
