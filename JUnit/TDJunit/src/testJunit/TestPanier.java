package testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bo.Article;
import bo.Panier;

class TestPanier {

	Panier panier = new Panier();
	private Article article = new Article("Article 1", "a-01", 10, 20);
	private Article article2 = new Article("Article 2", "a-02", 100, 20);

	@Test
	void testAjouterArticle() {
		panier.ajouterArticle(article);
		panier.ajouterArticle(article2);
		assertEquals(false, panier.getArticles().isEmpty());
	}

	@Test
	void testSupprimerArticle() {
		testAjouterArticle();
		assertTrue(panier.supprimerArticle(article));
		panier.supprimerArticle(article2);
		assertEquals(0, panier.getArticles().size());
	}

	@Test
	void testArticleCount() {
		testAjouterArticle();
		assertEquals(2, panier.articleCount());
	}

	@Test
	void testPrixTotal() {
		testAjouterArticle();
		assertEquals(132.0, panier.prixTotal());
	}

}
