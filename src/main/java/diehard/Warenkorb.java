package diehard;

import java.util.*;

public class Warenkorb {

	//Per Hand einige Beispiele berechnet, dabei viel auf wenn es fünf verschiedene Filme sowie drei verschiedene
	// Filme gekauft werden so ist es billiger daraus zwei mal vier  verschiedene Filme zu machen, s. berechneSpezialfall


	private ArrayList<Integer> warenkorb = new ArrayList<Integer>(Collections.nCopies(5, 0));
	private double preis = 0;

	public Warenkorb(int... filme) {
		int counter = 0;
		for (int film : filme) {
			this.warenkorb.set(counter, film);
			counter++;
		}
	}


	public static Warenkorb create(int... waren) {
		return new Warenkorb(waren);
	}


	public double berecheneBestenPreis() {
		//double preis = 0.0;
		ArrayList<Integer> kopieWarenkorb = this.warenkorb;
		Collections.sort(kopieWarenkorb);       // Sotiere das Array um die besten pärchen zu erstellen
		Collections.reverse(kopieWarenkorb);
		berechenBestenPreisAlgorithmus(kopieWarenkorb);
		return Math.round(preis * 100.0) / 100.0;
	}

	private double berechenBestenPreisAlgorithmus(ArrayList<Integer> waren) {
		double[] preise = new double[]{8, 15.2, 21.6, 25.6, 30};
		berecheneSpezialfall(waren);
		brechenNoramfälle(waren,3);
		return preis;
	}

	private double brechenNoramfälle(ArrayList<Integer> waren, int positon){
		double[] preise = new double[]{8, 15.2, 21.6, 25.6, 30};
		while (waren.get(0) != 0) {
			while (waren.get(positon) != 0) {
				for (int i = 0; i < positon + 1; i++) {
					waren.set(i, waren.get(i) - 1);
				}
				preis += preise[positon];
			}
			return  brechenNoramfälle(waren, positon - 1);
		}
		return preis;
	}

	private void berecheneSpezialfall(ArrayList<Integer> waren){
		while (waren.get(4) != 0) {
			if (waren.get(2) > waren.get(3)) {
				for (int i = 0; i < 3; i++) {
					waren.set(i, waren.get(i) - 2);
				}
				waren.set(3, waren.get(3) - 1);
				waren.set(4, waren.get(4) - 1);
				preis += 2 * 25.60;
			} else {
				for (int i = 0; i < 5; i++) {
					waren.set(i, waren.get(i) - 1);
				}
				preis += 30.00;
			}
		}
	}

	public ArrayList<Integer> getWarenkorb() {
		return this.warenkorb;
	}
}
