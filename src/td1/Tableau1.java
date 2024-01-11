package td1;

import java.util.Scanner;

public class Tableau1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de spécifier la taille du tableau (N)
        System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
        int N = scanner.nextInt();

        // Vérifie que la taille du tableau est valide
        if (N < 10 || N > 50) {
            System.out.println("La taille du tableau doit être entre 10 et 50.");
            return;
        }

        // Crée le tableau T avec N entiers
        int[] T = new int[N];

        // Demande à l'utilisateur de saisir les éléments du tableau
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < N; i++) {
            System.out.print("T[" + i + "] : ");
            T[i] = scanner.nextInt();
        }

        // Détermine la valeur maximale et minimale du tableau
        int maxValue = T[0];
        int minValue = T[0];

        for (int i = 1; i < N; i++) {
            if (T[i] > maxValue) {
                maxValue = T[i];
            }

            if (T[i] < minValue) {
                minValue = T[i];
            }
        }

        // Affiche la valeur maximale et minimale du tableau
        System.out.println("La valeur maximale du tableau est : " + maxValue);
        System.out.println("La valeur minimale du tableau est : " + minValue);
    }
}

