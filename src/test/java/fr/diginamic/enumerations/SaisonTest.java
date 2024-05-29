package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class SaisonTest {

	@Test
	public void testValueOfLibelle() {
		// Test que la methode retourne la bonne saison
		String libelle = "Hiver";
		Saison saisonHiver = Saison.valueOfLibelle(libelle);
		assertEquals(Saison.HIVER, saisonHiver);
	}


	@Test
	public void testGetSaisonByLibelleNotFound() {
        // Teste si la méthode valueOfLibelle retourne null pour un libellé inexistant
        String libelleInexistant = "ÉtéIndien";
        Saison saisonInexistante = Saison.valueOfLibelle(libelleInexistant);
        assertNull(saisonInexistante);
	}

}
