package Uebungen;

public class Bubblesort {

	public static void main(String[] args) {

		int[] array = { 20, 3, 0, 90, 80, 70, 2 };

		int temp = 0;

		int tausch = 0;
		while (tausch == 0) {
			tausch = 1;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {

					temp = array[i];

					array[i] = array[i + 1];

					array[i + 1] = temp;

					tausch = 0;
				}
			}
		}
		for (int ausgabeInt = 0; ausgabeInt < array.length; ausgabeInt++) {
			System.out.println(array[ausgabeInt]);
		}
	}
}
