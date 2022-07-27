import java.util.Random;
import java.util.Scanner;

/*
 * Jeu du Morpion
 * 
 */
public class Morpion {

	public static void main(String[] args) {
		int min = 1, max = 9, choixBots;
		Random rand = new Random();
		String gagnant = null;
		String[] casesMorpion = new String[9];
		String joueur = "X";
		String bot1 = "X";
		String bot2 = "O";
		String perdu = "Perdu";

		System.out.println("\nJeu du Morpion IA");

		System.out.println(" ___________");
		System.out.println("|   |   |   |");
		System.out.println("|___|___|___|");
		System.out.println("|   |   |   |");
		System.out.println("|___|___|___|");
		System.out.println("|   |   |   |");
		System.out.println("|___|___|___|");

		System.out.println("\nLes Bots vont commencer à jouer !");

		System.out.println("Appuyez sur ENTRER pour commencer.....\n");
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextLine();
		} catch (Exception e) {
			System.out.println("Appuyez bien sur la touche ENTRER de votre clavier :)");
			return;
		}

		for (int a = 0; a < 9; a++) {
			casesMorpion[a] = " ";
		}

		while (gagnant == null) {

			choixBots = rand.nextInt(max - min + 1) + min;

			if (casesMorpion[choixBots - 1].equals(" ")) {
				casesMorpion[choixBots - 1] = joueur;

				if (joueur.equals(bot1)) {
					joueur = bot2;
				} else {
					joueur = bot1;
				}

				System.out.println(" ___________");
				System.out.println("| " + casesMorpion[0] + " | " + casesMorpion[1] + " | " + casesMorpion[2] + " |");
				System.out.println("|___|___|___|");
				System.out.println("| " + casesMorpion[3] + " | " + casesMorpion[4] + " | " + casesMorpion[5] + " |");
				System.out.println("|___|___|___|");
				System.out.println("| " + casesMorpion[6] + " | " + casesMorpion[7] + " | " + casesMorpion[8] + " |");
				System.out.println("|___|___|___|");

				for (int i = 0; i < 8; i++) {
					String ligneGagante = null;

					switch (i) {
					case 0:
						ligneGagante = casesMorpion[0] + casesMorpion[1] + casesMorpion[2];
						break;
					case 1:
						ligneGagante = casesMorpion[3] + casesMorpion[4] + casesMorpion[5];
						break;
					case 2:
						ligneGagante = casesMorpion[6] + casesMorpion[7] + casesMorpion[8];
						break;
					case 3:
						ligneGagante = casesMorpion[0] + casesMorpion[3] + casesMorpion[6];
						break;
					case 4:
						ligneGagante = casesMorpion[1] + casesMorpion[4] + casesMorpion[7];
						break;
					case 5:
						ligneGagante = casesMorpion[2] + casesMorpion[5] + casesMorpion[8];
						break;
					case 6:
						ligneGagante = casesMorpion[0] + casesMorpion[4] + casesMorpion[8];
						break;
					case 7:
						ligneGagante = casesMorpion[2] + casesMorpion[4] + casesMorpion[6];
						break;
					}

					if (ligneGagante.equals("XXX")) {
						gagnant = bot1;
					} else if (ligneGagante.equals("OOO")) {
						gagnant = bot2;
					}
				}

				if (gagnant == null) {
					for (int j = 0; j < 9; j++) {
						if (casesMorpion[j].contains(" ")) {
							gagnant = null;
							break;
						} else if (j == 8) {
							gagnant = perdu;
						}

					}
				}

			} else {
				choixBots = rand.nextInt(max - min + 1) + min;
			}
		}

		if (gagnant.equals(perdu)) {
			System.out.println("\nAucun des BOTs ne gagnent, relancez la partie");
		} else {
			System.out.println("\nLe Bot " + gagnant + " a gagné !");
		}
	}

}
