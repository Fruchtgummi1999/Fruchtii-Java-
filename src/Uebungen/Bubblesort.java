package Uebungen;

public class Bubblesort {

	public static void main(String[] args) {

		int[] array = { 20, 3, 0, 90, 80, 70, 2 };

		// for (int i = 0; i < array.length; i++) {
		// array[i] = new Random().nextInt(30);
		// }
		//

		int temp = 0;

		// 20, 3 , 0 , 90 , 80, 70, 2
		boolean t = false;
		while(t) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {

					temp = array[i];
					// 1. Durchlauf: temp = 20
					// 2. Durchlauf: temp=3
					array[i] = array[i + 1];
					// 1. Durchlauf: 20 = 3
					// 2. Durchlauf: 3=0
					array[i + 1] = temp;
					// 1. Durchlauf: 3 = 20
					// 2. Durchlauf: 3=0

					// 1. Durchlauf: 3, 20, 0, 90, 80, 70, 2
					// 2. Durchlauf: 3, 0, 20, 90, 80, 70, 2
					// 3. Durchlauf: 3, 0, 20, 90, 80, 70, 2
					// 4. Durchlauf: 3, 0, 20, 80, 90, 70, 2
					// 5. Durchlauf: 3, 0, 20, 80, 70, 90, 2
					// 6. Durchlauf: 3, 0, 20, 80, 70, 2, 90
					t = true;
				}
			}
		}
		for (int ausgabeInt = 0; ausgabeInt < array.length; ausgabeInt++) {
			System.out.println(array[ausgabeInt]);
		}
	}
}
