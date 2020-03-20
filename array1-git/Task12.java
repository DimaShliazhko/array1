package by.htp.task.array1;
/*
 * задана последовательность N вещественных чисел
 * вычислить сумму часел, порядковые номера которых являются простыми числами
 * 
 */

public class Task12 {
	public static void main(String[] args) {
		int n;
		n = 20;
		double[] arr = new double[n];
		arr = creatArr(arr);
		printArr(arr);
		printSum(arr);
	}

	public static double[] creatArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (Math.random() * 30) - 15;

		}
		return arr;

	}

	public static void printArr(double[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] " + arr[i]);

		}

	}

	public static void printSum(double[] arr) {
		double sum = 0;
		int j;
		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			for (j = 2; j < i; j++) {
				if ((i % j != 0) && (i > 1)) {
					// System.out.println("i = " +i);
					k++;

				}
			}

			if (k == j - 2 && (i > 1)) {
				System.out.println("число " + i + " простое. член последовательности " + arr[i]);
				sum = sum + arr[i];
			}
		}
		System.out.println("сумма равна " + sum);

	}

}
