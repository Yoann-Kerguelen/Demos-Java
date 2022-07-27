package testTdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bo.Fonctions;

class TestFact {

	@Test
	void test() {

		int resFactA = Fonctions.fact(5);
		int resFactE = 120;
		assertEquals(resFactE, resFactA);

	}

}
