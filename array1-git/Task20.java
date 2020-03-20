package by.htp.task.array1;
/*
 * Дан целочисленный массив с количеством элементов n 
 * Сжать масссив, выбросив из него каждый второй элемент(освободившееся место 
 * занять нулями) Примечание. дополнительный массив не использовать
 * 
 */

public class Task20 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] newArr= newArr(arr);
		printArr(newArr);
	}

	public static int[] newArr(int [] arr) {
		int a = 1;
		for(int i = 2; i < arr.length; i=i+2) {
			arr[a] = arr[i];
			
			
			a++;
			System.out.println(a);
			//System.out.println("arr[i]" +(arr[i]));
			//System.out.println("arr[i+1]" +(arr[i+1]));
		}
		for(int i = 0; i < arr.length; i++) {
		if (i >= a) {
			arr[i] = 0;
		}
		}
		
		return arr;
	}
	
	public static void printArr(int[] newArr) {
		for(int i = 0; i < newArr.length; i++) {
			System.out.println("newArr = "+newArr[i]);
		}
	}
}
