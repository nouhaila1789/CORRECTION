package td1;

import java.util.Scanner;

public class MaximumSuite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;  // Initialisez max avec la plus petite valeur possible

        while (true) {
            System.out.print("Entrez un nombre (ou 0 pour terminer) : ");
            int nombre = scanner.nextInt();

            if (nombre == 0) {
                break;
            }

            if (nombre > max) {
                max = nombre;
            }
        }

        System.out.println("Le maximum de la suite saisie est : " + max);
    }
}

