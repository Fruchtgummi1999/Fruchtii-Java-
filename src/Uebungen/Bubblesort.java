package Uebungen;

public class Bubblesort {

	public static void main(String[] args) {

		int[] array = { 20, 3, 0, 90, 80, 70, 2 };

		int temp = 0;

		boolean t = false;
		while (t) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {

					temp = array[i];

					array[i] = array[i + 1];

					array[i + 1] = temp;

					t = true;
				}
			}
		}
		for (int ausgabeInt = 0; ausgabeInt < array.length; ausgabeInt++) {
			System.out.println(array[ausgabeInt]);
		}
	}
}
