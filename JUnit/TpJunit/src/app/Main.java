package app;

import bo.Programme;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		Programme p = new Programme();

		p.afficherMatrice(a, b, 5, 5);

		try {

			double[] racines = p.calculerRacinesCarrees(a, b);
			for (double d : racines) {
				System.out.println("racine de " + a + " : " + d);
				a++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
