package td1;

import java.util.Scanner;

public class PGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier positif non nul (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième entier positif non nul (b) : ");
        int b = scanner.nextInt();

        int pgcd = calculerPGCD(a, b);

        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
    }

    // Fonction pour calculer le PGCD en utilisant l'algorithme d'Euclide
    public static int calculerPGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

