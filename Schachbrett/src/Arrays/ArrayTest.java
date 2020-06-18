package Arrays;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String args[]) {
		// test2();
		// toInt("12345678");
		// einMalEins();
		 //einMalEins1();
		//System.out.println(square(126));
		 //System.out.println(pow(5,3));
		//System.out.println(fakultaet(-4));
		// erratenZahl();
		tabularOutput() ;
	}

	public static void tabularOutput() {
		
	}

	public static void erratenZahl() {
		int zuErratendeZahl, eingabe1, Rateversuch;
		Scanner eingabe = new Scanner(System.in);
		zuErratendeZahl = ((int) (Math.random() * 10000)) + 1;
		Rateversuch = 0;
		System.out.println("Errate eine Zahl zwischen 1 und 10000");
		do {

			Rateversuch++;
			System.out.print(Rateversuch + ". Rateversuch: ");
			eingabe1 = Integer.valueOf(eingabe.next());
			//eingabe1 = eingabe.nextInt();
			if (eingabe1 < zuErratendeZahl)
				System.out.println("Die gesuchte Zahl ist groesser");
			if (eingabe1 > zuErratendeZahl)
				System.out.println("Die gesuchte Zahl ist kleiner");

		} while (eingabe1 != zuErratendeZahl);
		System.out.println("Zahl erraten!");
		eingabe.close();

	}
	public static double fakultaet(int n) {
		int fakutaet = 1;
		if(n == 0) {
			return 1;
		}else if(n> 0){
			int i ;
			
			for(i= 1; i <=n;i++) {
				fakutaet = fakutaet*i;
			}
		}else {
			n = n*-1;
            for(int i = 1; i <= n; i++){
            	fakutaet= fakutaet*i;
            }
		}
		
		return fakutaet;
	}
	public static double pow(double x, int k) {
		double output = 1 ;
		int i ;
		for(i=0;i< k;i++) {
			output = output * x;
		}
		return output;
	}
	// sqrt(n+1) = (sqrt(n)+ num/sqrt(n))/2
	public static double square (double number) {
		double t;
		double squareroot = number /2;
		do {
			t = squareroot;
			squareroot = (t+(number/t))/2;
		}while((t-squareroot) != 0);
		return squareroot;
	}

	static void einMalEins1() {
		// here we are initializing and setting table size
		final int tableNum = 12;
		// here we are printing row
		System.out.print("1x1|");
		for (int a = 1; a <= tableNum; a++)
			System.out.print(addSpace(a) + " ");
		System.out.println();
		// here we are printing separator
		System.out.print("---+");
		for (int a = 1; a <= tableNum; a++)
			System.out.print("----");
		System.out.println();
		// now printing main table
		for (int a = 1; a <= tableNum; a++) {
			System.out.print(addSpace(a) + "|");
			for (int b = 1; b <= tableNum; b++) {
				System.out.print(addSpace(a * b) + " ");
			}
			System.out.println();
		}
	}

	public static String addSpace(int y) {
		String str = new String();
		if (y < 10)
			str = "  " + y;
		else if (y < 100)
			str = " " + y;
		else
			str = "" + y;
		return str;
	}

	public static int berechne(int a, int b) {
		return a * b;
	}

	public static void einMalEins() {
		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b <= 10; b++) {

				if (berechne(a, b) < 10)
					System.out.print(" ");
				if (berechne(a, b) < 100)
					System.out.print(" ");

				System.out.print(" " + berechne(a, b));
			}

			System.out.println("");
		}
	}

	static int toInt(String number) {
		System.out.println("Wert␣von " + number);
		String lastChar = number.substring(number.length() - 1, number.length());

		int ergebnis = Integer.parseInt(lastChar);
		if (number.length() > 1) {
			int rest = toInt(number.substring(0, number.length() - 1));
			ergebnis += rest * 10;
		}
		System.out.println("Wert von " + number + " : " + ergebnis);
		return ergebnis;
	}

	public static void test2() {
		int i, n = 100;
		double y[] = new double[n + 1];

		for (i = 0; i <= n; i++)
			y[i] = Math.cos(i * 0.01);

		double sum = 0;
		for (i = 0; i <= n; i++)
			sum += y[i];
		System.out.println(sum * 0.01);

		sum = y[0] + 4 * y[1] + y[n];
		for (i = 2; i < n; i += 2)
			sum += 2 * y[i] + 4 * y[i + 1];
		System.out.println(sum * 0.01 / 3);

		System.out.println(Math.sin(1));
	}

	public static void test1() {
		int n = 10;
		int p[] = new int[n];

		// Setze die ersten beiden Primzahlen
		p[0] = 2;
		if (n > 1)
			p[1] = 3;

		// erzeuge den Rest:
		int i, j;
		for (i = 2; i < n; i++) // erzeuge p[2] bis p[n-1]
		{
			int m = p[i - 1] + 2;
			// versuche letzte Primzahl plus 2,4,...
			search: while (true)
			// eigentlich eine Dauerschleife
			{
				j = 0;
				while (true)
				// teste auf Teilbarkeit durch p[0],...,p[i-1]
				{
					if (m % p[j] == 0)
						break;
					// m ist nicht prim
					if (p[j] * p[j] > m || j >= i)
					// m ist prim, genuegend gesucht
					{
						p[i] = m;
						break search;
					}
					j++;
				}
				m += 2;
			}
		}

		// Ausgabe:
		for (i = 0; i < n; i++)
			System.out.println(p[i]);
	}

	public static void test() {
		int n = 10000;
		double array[] = new double[n];
		int i;
		for (i = 0; i < n; i++) {
			array[i] = Math.random();// random number
		}

		double sum = 0;
		for (i = 0; i < n; i++) {
			sum = sum + array[i];
		}
		double mean = sum / n; // average of an array
		System.out.println("Mittelwert :" + mean);

		// standard deviation (Standardabweichung)

		for (i = 0; i < n; i++) {
			sum = sum + ((mean - array[i]) * (mean - array[i]));
		}
		System.out.println("Standard-Abweichung : " + Math.sqrt(sum / (n - 1)));

		// Verteilung
		int m = 10;
		int newAr[] = new int[m];
		int j;
		for (j = 0; j < m; j++) {
			newAr[j] = 0;
		}
		for (j = 0; i < n; i++) {
			j = (int) Math.floor(array[i] * m);
			// in welchem Intervall liegt R[i]?

			if (j >= m) {
				j = m - 1;
			}
			newAr[j]++;
		}

		for (j = 0; j < m; j++) { // Ausgabe der Zählung
			System.out.println((j + 1) + ":" + newAr[j]);
		}

	}

}
