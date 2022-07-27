package testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bo.Programme;

class TestProgramme {

	@Test
	void testCalculerRacinesCarrees() throws Exception {
		double[] tabA = Programme.calculerRacinesCarrees(1, 4);
		double[] tabE = { 1, 1.41, 1.73, 2 };
		// double[] tabE = { 1, 1.42, 1.73, 2 };
		assertArrayEquals(tabE, tabA);
	}

	@Test
	void testAfficherMatrice() {

	}

}
