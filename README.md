# Tests Unitaires

Le projet Maison inclut un ensemble de tests unitaires pour assurer la fiabilité et la robustesse de l'application. Ces tests sont écrits avec JUnit 5 et couvrent toutes les fonctionnalités principales de l'application. Voici un aperçu des tests réalisés :

## Test testAjouterPiece

Ce test vérifie que la méthode ajouterPiece de la classe Maison fonctionne correctement. Il ajoute successivement une chambre et un salon à la maison et vérifie que la longueur du tableau pieces augmente comme prévu. Cela confirme que les pièces sont correctement ajoutées à la maison.

## Test testNbPieces

Ce test examine la méthode nbPieces de la classe Maison. Après avoir ajouté trois pièces différentes à la maison, il vérifie que nbPieces retourne le nombre correct de pièces. Cela garantit que la méthode compte correctement le nombre de pièces dans la maison.

## Test testSuperficieEtage

Ce test évalue la méthode superficieEtage de la classe Maison. Il ajoute plusieurs pièces à la maison et calcule la superficie totale pour l'étage 1, s'attendant à ce que la superficie soit comprise entre 10 et 45 m². De plus, il teste la méthode avec un étage inexistant, vérifiant que la superficie retournée est 0.

## Test testSuperficieTypePiece

Ce test explore la méthode superficieTypePiece de la classe Maison. Il ajoute plusieurs types de pièces à la maison et vérifie que la superficie totale pour le type "Chambre" est correcte. Il teste également la méthode avec un type de pièce inexistant, confirmant que la superficie retournée est 0.

## Test testCalculerSurface

Ce test valide la méthode calculerSurface de la classe Maison. Après avoir ajouté plusieurs pièces à la maison, il vérifie que la superficie totale calculée est égale à la somme des superficies de toutes les pièces. Cela confirme que la méthode calcule correctement la superficie totale de la maison.