package Domino;

public class Domino {

	public static void main(String[] args) {
//		domino();
		//ArraysMitWertenFuellen();
		filter();
	}
	
	public static void filter() {

		int [] array1 = {2, 17, 10, 9, 16, 3, 9, 16, 5, 1, 17, 14};
		
		int [] array2;
		int array2length = 0;
		
		// Zählen wieviele Zahlen von Array1 grösser als 10 sind um die Länge vom Array2 zu bestimmen
		for(int index = 0; index < array1.length; index++) {
			if(array1[index] > 10) {
				array2length++;
			}
		}
		// Alle Zahlen von Array1 die grösser als 10 sind in die Felder von Array2 initialisieren
		array2 = new int [array2length];
		int index2 = 0;
		for(int index = 0; index < array1.length; index++) {
			if(array1[index] > 10) {
				array2[index2] = array1[index];
				index2++;
			}
		}
		// Printen
		for(int index : array1) {
			System.out.print(index + " ");
		}
		System.out.println("\n=============================");
		for(int index : array2) {
			System.out.print(index + " ");
		}
		
	}

	public static void ArraysMitWertenFuellen() {

		int schrittweite = 5;
		int anzahlWerte = 20;
		int[] array1 = new int[anzahlWerte];
		int sumar1 = 0;
		int[] array2 = new int[anzahlWerte];
		int sumar2 = 0;
		for (int i = 0; i < anzahlWerte; i++) {
			array1[i] = (i + 1) * schrittweite;
			sumar1 += array1[i];
			array2[i] = array1[i] * 2;
			sumar2 += array2[i];
		}
		System.out.printf("Array1: Summe: %4d  Mittelwert:  %4f%n", sumar1, sumar1 * 1.0 / array1.length);
		System.out.printf("Array2: Summe: %4d  Mittelwert:  %4f%n", sumar2, sumar2 * 1.0 / array2.length);
	}

	public static void domino() {
		int obereZahl = 0, untereZahl;
		while (obereZahl <= 6) {
			untereZahl = obereZahl; // Keine Duplikate
			while (untereZahl <= 6) {
				System.out.print("(" + obereZahl + "|" + untereZahl + ")" + " ");
				untereZahl = untereZahl + 1;
			}
			obereZahl = obereZahl + 1;
		}
	}

}
