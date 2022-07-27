package bo;

import java.util.Random;

public class Programme {

	public static double[] calculerRacinesCarrees(int a, int b) throws Exception {
		int gap = b - a;
		double[] res = new double[gap + 1];
		if (a < b) {
			for (int i = 0; i <= gap; i++) {
				res[i] = (double) Math.round(Math.sqrt(a + i) * 100) / 100;
			}
		} else {
			throw new Exception(String.format("A doit être inférieur à B hors ici A = %d et B = %d donc A>B", a, b));
		}
		return res;
	}

	public static void afficherMatrice(int a, int b, int M, int N) {
		Random r = new Random();
		int[][] matrice = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				int randomNumber = r.nextInt(b - a) + a;
				matrice[i][j] = randomNumber;
			}
		}

		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print("|" + matrice[i][j]);
			}
			System.out.println();
		}
	}

}
