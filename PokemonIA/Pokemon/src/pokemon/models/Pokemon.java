package pokemon.models;

public class Pokemon {
	private String nom;
	private int idPokedex;
	private int taille;
	private double poids;
	private String type;
	private double pointsDeVie;
	private double pointsDeVieRestants;
	private Attaque attaqueFaible;
	private Attaque attaquePuissante;

	public Pokemon(String nom, int idPokedex, int taille, double poids, String type, double pointsDeVie,
			Attaque attaqueFaible, Attaque attaquePuissante) {
		this.nom = nom;
		this.idPokedex = idPokedex;
		this.taille = taille;
		this.poids = poids;
		this.type = type;
		this.pointsDeVie = pointsDeVie;
		this.attaqueFaible = attaqueFaible;
		this.attaquePuissante = attaquePuissante;
		this.pointsDeVieRestants = pointsDeVie;
	}

	public String getNom() {
		return nom;
	}

	public double getPointsDeVieRestants() {
		return pointsDeVieRestants;
	}

	public void setPointsDeVieRestants(double d) {
		this.pointsDeVieRestants = d;
	}

	// 3) methode attaque
	public Attaque attaque() {
		if (this.pointsDeVieRestants <= /* ((this.pointsDeVie / 100) * 20) */20) { // 20PV ou 20% des PV ?
			return this.attaquePuissante;
		} else {
			return this.attaqueFaible;
		}
	}
}