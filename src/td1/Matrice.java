package td1;

import java.util.Scanner;

public class Matrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de spécifier la taille des matrices carrées
        System.out.print("Entrez la taille des matrices carrées (par exemple, 2 pour une matrice 2x2) : ");
        int tailleMatrice = scanner.nextInt();

        // Crée les deux matrices carrées
        double[][] matrice1 = saisirMatrice(tailleMatrice, "Matrice 1");
        double[][] matrice2 = saisirMatrice(tailleMatrice, "Matrice 2");

        // Vérifie si les deux matrices ont la même taille
        if (matrice1.length != matrice2.length || matrice1[0].length != matrice2[0].length) {
            System.out.println("Les matrices n'ont pas la même taille. La somme n'est pas définie.");
            return;
        }

        // Calcule la somme des matrices
        double[][] somme = calculerSommeMatrices(matrice1, matrice2);

        // Affiche le résultat
        System.out.println("La somme des matrices est :");
        afficherMatrice(somme);
    }

    // Méthode pour saisir une matrice carrée réelle
    private static double[][] saisirMatrice(int taille, String nomMatrice) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisie de la " + nomMatrice + " :");
        double[][] matrice = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(nomMatrice + "[" + (i + 1) + "][" + (j + 1) + "] : ");
                matrice[i][j] = scanner.nextDouble();
            }
        }

        return matrice;
    }

    // Méthode pour calculer la somme de deux matrices
    private static double[][] calculerSommeMatrices(double[][] matrice1, double[][] matrice2) {
        int taille = matrice1.length;
        double[][] somme = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                somme[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return somme;
    }

    // Méthode pour afficher une matrice
    private static void afficherMatrice(double[][] matrice) {
        for (double[] ligne : matrice) {
            for (double valeur : ligne) {
                System.out.print(valeur + " ");
            }
            System.out.println();
        }
    }
}

