package bo;

import java.util.ArrayList;
import java.util.List;

public class Panier {

	List<Article> articles;

	public Panier() {
		articles = new ArrayList<Article>();
	}

	public void ajouterArticle(Article article) {
		this.articles.add(article);
	}

	public boolean supprimerArticle(Article article) {
		if (this.articles.remove(article) == true)
			return true;
		return false;
	}

	public int articleCount() {
		return this.articles.size();
	}

	public double prixTotal() {
		double prixTotal = 0;
		for (Article article : articles) {
			prixTotal += article.calculerPrixTTC();
		}
		return prixTotal;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
