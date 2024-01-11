package td1;

import java.util.Scanner;

public class Tableau3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de spécifier la taille du tableau
        System.out.print("Entrez le nombre d'étudiants : ");
        int nombreEtudiants = scanner.nextInt();

        // Crée le tableau des moyennes
        double[] moyennes = new double[nombreEtudiants];

        // Demande à l'utilisateur de saisir les moyennes des étudiants
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
            moyennes[i] = scanner.nextDouble();
        }

        // Demande à l'utilisateur de spécifier le seuil
        System.out.print("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        // Appelle la méthode pour compter le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
        int nombreEtudiantsAuDessusSeuil = compterEtudiantsAuDessusSeuil(moyennes, seuil);

        // Affiche le résultat
        System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil est : " + nombreEtudiantsAuDessusSeuil);
    }

    // Méthode pour compter le nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
    private static int compterEtudiantsAuDessusSeuil(double[] moyennes, double seuil) {
        int count = 0;
        for (double moyenne : moyennes) {
            if (moyenne >= seuil) {
                count++;
            }
        }
        return count;
    }
}
