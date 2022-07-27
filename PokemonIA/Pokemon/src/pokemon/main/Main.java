package pokemon.main;
import java.util.Random;
import pokemon.models.Attaque;
import pokemon.models.Pokemon;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int tirageAuSort = rand.nextInt(2);
		Pokemon pikatchu = new Pokemon("Pikatchu", 025, 40, 6.0, "électrique", 82, new Attaque("Statik", 10),
				new Attaque("Paratonnerre", 25));
		Pokemon evoli = new Pokemon("Evoli", 133, 30, 6.5, "normal", 70, new Attaque("Adaptabilité", 9),
				new Attaque("Anticipation", 15));

		if (tirageAuSort == 0) {
			combat(pikatchu, evoli);
		} else {
			combat(evoli, pikatchu);
		}
	}

	// 4) le combat
	static void combat(Pokemon pokemon1, Pokemon pokemon2) {
		do {
			Attaque attaquePokemon1 = pokemon1.attaque();
			Attaque attaquePokemon2 = pokemon2.attaque();

			System.out.println(String.format("%s attaque avec %s et inflige %d", pokemon1.getNom(),
					attaquePokemon1.getLibelle(), attaquePokemon1.getNbDegats()));

			pokemon2.setPointsDeVieRestants((pokemon2.getPointsDeVieRestants() - attaquePokemon1.getNbDegats()));

			if (pokemon2.getPointsDeVieRestants() > 0) {

				System.out.println(String.format("%s attaque avec %s et inflige %d", pokemon2.getNom(),
						attaquePokemon2.getLibelle(), attaquePokemon2.getNbDegats()));

				pokemon1.setPointsDeVieRestants((pokemon1.getPointsDeVieRestants() - attaquePokemon2.getNbDegats()));
			}

			System.out.println(String.format("Combattant 1 : %s(%d) ", pokemon1.getNom(),
					(int) pokemon1.getPointsDeVieRestants()));

			System.out.println(String.format("Combattant 2 : %s(%d) ", pokemon2.getNom(),
					(int) pokemon2.getPointsDeVieRestants()));

		} while (pokemon1.getPointsDeVieRestants() > 0 && pokemon2.getPointsDeVieRestants() > 0);

		System.out.println(String.format("Vainqueur : %s",
				(pokemon1.getPointsDeVieRestants() > 0 ? pokemon1.getNom() : pokemon2.getNom())));
	}

}