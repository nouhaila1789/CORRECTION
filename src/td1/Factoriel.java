package td1;

import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier naturel N : ");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("Le factoriel n'est pas défini pour les entiers négatifs.");
        } else {
            long factoriel = 1;  // Utilisation d'un long pour gérer de grands factoriels

            for (int i = 1; i <= N; i++) {
                factoriel *= i;
            }

            System.out.println(N + "! = " + factoriel);
        }
    }
}

