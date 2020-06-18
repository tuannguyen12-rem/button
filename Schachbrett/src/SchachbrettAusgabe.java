
public class SchachbrettAusgabe {

	// Gibt folgende Ausgabe aus:

	// A8 B8 C8 D8 E8 F8 G8 H8

	// A7 B7 C7 D7 E7 F7 G7 H7

	// A6 B6 C6 D6 E6 F6 G6 H6

	// A5 B5 C5 D5 E5 F5 G5 H5

	// A4 B4 C4 D4 E4 F4 G4 H4

	// A3 B3 C3 D3 E3 F3 G3 H3

	// A2 B2 C2 D2 E2 F2 G2 H2

	// A1 B1 C1 D1 E1 F1 G1 H1

	public static void main(String[] args) {

		// print1();
		System.out.println("----------------------");
		// print2();

		//test1();
		test2();
	}

	public static void print2() {
		char letter = 'A';
		while (letter <= 'H') {
			char number = '8';
			while (number >= '1') {
				System.out.print("" + letter + number + " ");
				number = (char) (number - 1);
			}
			System.out.println();
			letter = (char) (letter + 1);
		}

	}

	public static void print1() {
		char number = '8';
		while (number >= '1') {
			char letter = 'A';
			while (letter <= 'H') {
				System.out.print("" + letter + number + " ");
				letter = (char) (letter + 1);
			}
			System.out.println();
			number = (char) (number - 1);
		}
	}

	public static void test() {
		int i, j;
		for (i = 1; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				int p = i * j;
				// lokale Variable, gilt nur in der Schleife
				if (p < 10)
					System.out.print(" " + p + " ");
				// einstellige Zahl
				else
					System.out.print(p + " ");
				// zweistellige Zahl
			}
			System.out.println("");
		}
	}

	public static void test1() {
		double k = 450, z = 1.4 / 100, endK = 900;

		int i = 0;

		while (k < endK) {

			k = k + (k * z);
			i++;
			System.out.println(i + ":" + k);
		}
	}

	public static void test2() {
		int a=1,b=1;
        for (int i=3; i<=20; i++)
        {   int c=a+b;
            System.out.println(c);
            a=b; b=c;
        }
	}

}
