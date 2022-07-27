package testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bo.Article;

class TestArticle {

	private Article article = new Article("Article 1", "a-01", 10, 20);

	@Test
	void testCalculerPrix() {
		assertEquals(12.0, article.calculerPrixTTC());
	}

	@Test
	void testAfficherArticle() {
		article.afficherArticle();
	}

}
