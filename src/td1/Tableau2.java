package td1;

import java.util.Scanner;

public class Tableau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un entier N
        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();

        // Vérifie si N est négatif
        if (N < 0) {
            System.out.println("Veuillez entrer un entier positif.");
            return;
        }

        // Appelle la méthode pour afficher la représentation binaire
        afficherRepresentationBinaire(N);
    }

    // Méthode pour afficher la représentation binaire d'un entier
    private static void afficherRepresentationBinaire(int nombre) {
        System.out.println("La représentation binaire de " + nombre + " est : " + Integer.toBinaryString(nombre));
    }
}
