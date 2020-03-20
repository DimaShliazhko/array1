package by.htp.task.array1;
/*
 * суперзамок
 * секретный замок для сейфа состоит из 10 расположенных в ряд ячеек
 * в которых надо вставлять игральные кубики
 * но дверь открывается только в том случае
 * когда в любых трех соседних ячеек сумма точек на передних
 * гранях кубика равна 10 (игральный кубик имеет на каждой грани от 1 до 6 точек)
 * напишите программу, которая разгадывает код замка при условии 
 * что два кубика уже вставленны в ячейки 
 * 
 */

public class Task18 {
	public static void main(String[] args) {
		// создадим массив с уже вставленными 2 кубиками остальное заполним рандомом
		int n = 10;
		int[] arr = new int[n];
		arr[9] = 5;
		arr[8] = 4;
		for (int i = 0; i < arr.length - 2; i++) {
			arr[i] = (int) (Math.random() * 7);
			// System.out.println("arr["+i+"] = "+arr[i]);

		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] = " + arr[i]);

		}
		for (int i = 0; i < arr.length-3; i++) {

		if (arr[i]+arr[i+1]+arr[i+2] == 10) {
			System.out.println("замок откроется");
		System.out.println(+arr[i]+" "+arr[i+1]+" "+arr[i+2]);
		}

		}

	}

}
