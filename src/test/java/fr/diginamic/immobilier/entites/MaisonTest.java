package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaisonTest {

	@Test
	void testAjouterPiece() {
// Teste si la méthode ajouterPiece ajoute bien une pièce à la liste de pièces
		Maison maison = new Maison();
		Piece chambre = new Chambre(1, 10);
		maison.ajouterPiece(chambre);
		assertEquals(1, maison.getPieces().length); // Utilise.length pour les tableaux

// Teste si la méthode ajouterPiece ajoute bien une pièce à la liste de pièces
		Piece salon = new Salon(1, 20);
		maison.ajouterPiece(salon);
		assertEquals(2, maison.getPieces().length);
	}

	@Test
	void testNbPieces() {
		Maison maison = new Maison();

		// Ajout de deux pièces
		maison.ajouterPiece(new Chambre(1, 10));
		maison.ajouterPiece(new Salon(1, 20));

		// Vérification que nbPieces retourne le bon nombre de pièces
		assertEquals(2, maison.nbPieces());

		// Ajout d'une troisième pièce
		maison.ajouterPiece(new Cuisine(1, 15));

		// Vérification que nbPieces retourne toujours le bon nombre de pièces
		assertEquals(3, maison.nbPieces());
	}

	@Test
	void testSuperficieEtage() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(1, 10));
		maison.ajouterPiece(new Salon(1, 20));
		maison.ajouterPiece(new Cuisine(1, 15));

		// Test pour l'étage 1
		double superficieEtage1 = maison.superficieEtage(1);
		assertTrue(superficieEtage1 >= 10 && superficieEtage1 <= 45); // La superficie de l'étage 1 devrait être
																		// comprise entre 10 et 45

		// Test pour un étage inexistant
		double superficieInexistant = maison.superficieEtage(2);
		assertEquals(0, superficieInexistant);
	}

	@Test
	void testSuperficieTypePiece() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(1, 10));
		maison.ajouterPiece(new Salon(1, 20));
		maison.ajouterPiece(new Cuisine(1, 15));

		// Test pour le type "Chambre"
		double superficieChambre = maison.superficieTypePiece("Chambre");
		assertEquals(10, superficieChambre);

		// Appel de la méthode avec null comme argument
		double actualResult = maison.superficieTypePiece(null);

		// Test pour un type inexistant
		double superficieInexistant = maison.superficieTypePiece("Bain");
		assertEquals(0, superficieInexistant);
		// Vérification du résultat attendu
		double expectedResult = 0; // Ou toute autre valeur attendue lorsque typePiece est null
		assertEquals(expectedResult, actualResult, "La superficie pour un type null doit être correcte");
	}

	@Test
	void testCalculerSurface() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(1, 10));
		maison.ajouterPiece(new Salon(1, 20));
		maison.ajouterPiece(new Cuisine(1, 15));

		double superficieTotale = maison.calculerSurface();
		assertEquals(45, superficieTotale); // La superficie totale devrait être la somme des superficies de toutes les pièces
	}

}
