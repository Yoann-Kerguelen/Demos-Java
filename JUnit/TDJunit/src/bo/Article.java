package bo;

public class Article {
	private String ref, designation;
	private double prixHT, TauxTVA;

	public Article(String ref, String designation, double prixHE, double tauxTVA) {
		this.ref = ref;
		this.designation = designation;
		this.prixHT = prixHE;
		TauxTVA = tauxTVA;
	}

	public double calculerPrixTTC() {
		return this.prixHT + (this.prixHT * this.TauxTVA / 100);
	}

	public void afficherArticle() {
		System.out.println(
				String.format("Référence : %s \nDésignation : %s \nPrix HT : %.2f \nTaux TVA : %.2f \nPrix TTC : %.2f",
						this.ref, this.designation, this.prixHT, this.TauxTVA, calculerPrixTTC()));
	}
}
