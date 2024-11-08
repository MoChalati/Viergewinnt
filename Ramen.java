package Viergewinnt;

import java.util.Scanner;

public class Ramen {
	private static int Breite = 7;
	private static int Spalte = 7;
	int[][] spielfeld = new int[Spalte][Breite];

	public int spieler1() {
		System.out.println("Nenne eine Zahle zwischen 0 und 6");
		Scanner scan = new Scanner(System.in);
		int steinsetzen = scan.nextInt();
		if (steinsetzen < Spalte) {
			if (spielfeld[0][steinsetzen] == 0) {
				int eingesetzt = 0;
				for (int Spalt = 6 - 1; Spalt >= 0; Spalt--) {
					if (spielfeld[Spalt][steinsetzen] == 0) {
						spielfeld[Spalt][steinsetzen] = 1;
						eingesetzt = 1;
						break;
					}
				}
				return eingesetzt;
			} else {
				System.err.print("Hier kann nichts platzier werden!");
				return 0;
			}

		} else {
			System.err.print(""
					+ "Hier kann nichts platzier werden!");
			return 0;
		}
	}

	public int spieler2() {
		System.out.println("Nenne eine Zahle zwischen 0 und 6");
		Scanner scan = new Scanner(System.in);
		int steinsetzen = scan.nextInt();
		if (steinsetzen < Spalte) {
			if (spielfeld[0][steinsetzen] == 0) {
				int eingesetzt = 0;
				for (int Spalt = 6 - 1; Spalt >= 0; Spalt--) {
					if (spielfeld[Spalt][steinsetzen] == 0) {
						spielfeld[Spalt][steinsetzen] = 2;
						eingesetzt = 2;
						break;
					}
				}
				return eingesetzt;
			} else {
				System.err.print("Hier kann nichts platzier werden!");
				return 0;
			}

		} else {
			System.err.print(""
					+ "Hier kann nichts platzier werden!");
			return 0;
		}
	}

	public Ramen() {

		for (int Spalte = 0; Spalte < 6; Spalte++) {
			for (int Breite = 0; Breite < 7; Breite++) {
				spielfeld[Spalte][Breite] = 0;
			}
		}
	}

	public void erstellespielfeld() {
		System.out.println("- ");
		System.out.println(" 0  1  2  3  4  5  6 ");
		for (int Spalte = 0; Spalte < 6; Spalte++) {
			for (int Breite = 0; Breite < 7; Breite++) {
				if (spielfeld[Spalte][Breite] == 0)
					System.out.print("( )");
				else if (spielfeld[Spalte][Breite] == 1)
					System.out.print("(X)");
				else if (spielfeld[Spalte][Breite] == 2)
					System.out.print("(O)");

			}
			System.out.println(' ');
		}
	}

	public int werhatgewonnen1(int Spieler) {

		int Vierineinerreihe = 0;
		for (int Breite = 0; Breite <= 6; Breite++) {
			if (spielfeld[5][Breite] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[4][Breite] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[3][Breite] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[2][Breite] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[1][Breite] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[0][Breite] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}

		}

		return 69;
	}

	public int werhatgewonnen2(int Spieler) {

		int Vierineinerreihe = 0;
		for (int Lenge = 0; Lenge <= 5; Lenge++) {
			if (spielfeld[Lenge][0] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[Lenge][1] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[Lenge][2] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[Lenge][3] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[Lenge][4] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[Lenge][5] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}
			if (spielfeld[Lenge][6] == Spieler + 1) {
				Vierineinerreihe++;
				if (Vierineinerreihe == 4) {
					return Spieler;
				}
			} else {
				Vierineinerreihe = 0;
			}

		}

		return 69;
	}
}