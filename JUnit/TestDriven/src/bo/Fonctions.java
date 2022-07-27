package bo;

public class Fonctions {

	public static int fact(int n) {
		int f = 1;
		for (int j = 1; j <= n; j++) {
			f = f * j;
		}

		return f;
	}

}
