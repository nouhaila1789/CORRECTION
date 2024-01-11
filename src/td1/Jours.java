package td1;

import java.util.Scanner;

public class Jours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le numéro du mois (1-12) : ");
        int mois = scanner.nextInt();

        if (mois < 1 || mois > 12) {
            System.out.println("Numéro de mois invalide.");
        } else if (mois == 2) {
            System.out.print("Entrez l'année (1900-2100) : ");
            int annee = scanner.nextInt();

            if (annee >= 1900 && annee <= 2100) {
                if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                    System.out.println("Février " + annee + " a 29 jours (année bissextile).");
                } else {
                    System.out.println("Février " + annee + " a 28 jours.");
                }
            } else {
                System.out.println("Année invalide. L'année doit être comprise entre 1900 et 2100.");
            }
        } else {
            int[] joursDansMois = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int jours = joursDansMois[mois];
            System.out.println("Le mois " + mois + " a " + jours + " jours.");
        }
    }
}
