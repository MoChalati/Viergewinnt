package Viergewinnt;

public class Spiel {
	private Ramen ramen;
	Ramen spielfeld = new Ramen();

	public void Spielstart() {
		boolean Spielbeginn = true;
		int Spielerwechsel = 0;
		spielfeld.erstellespielfeld();
		while (Spielbeginn) {
			if (Spielerwechsel % 2 == 0) {
				spielfeld.spieler1();

				if (spielfeld.werhatgewonnen1(Spielerwechsel) == Spielerwechsel
						|| spielfeld.werhatgewonnen2(Spielerwechsel) == Spielerwechsel) {
					System.out.println("Spieler 1 hat gewonnen");
					Spielbeginn = false;
				}

			} else {
				spielfeld.spieler2();

				if (spielfeld.werhatgewonnen1(Spielerwechsel) == Spielerwechsel
						|| spielfeld.werhatgewonnen2(Spielerwechsel) == Spielerwechsel) {
					System.out.println("Spieler 2 hat gewonnen");
					Spielbeginn = false;
				}

			}
			if (Spielerwechsel % 2 == 0) {
				Spielerwechsel++;
			} else {
				Spielerwechsel--;
			}
			spielfeld.erstellespielfeld();

		}
	}
}
