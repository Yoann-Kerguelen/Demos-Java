package pokemon.models;

public class Attaque {
	private String libelle;
	private int nbDegats;

	public Attaque(String libelle, int nbDegats) {
		this.libelle = libelle;
		this.nbDegats = nbDegats;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getNbDegats() {
		return nbDegats;
	}

}