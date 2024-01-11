package td1;

import java.util.Scanner;

public class Ordre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir les deux variables
        System.out.print("Entrez la première variable : ");
        int variable1 = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int variable2 = scanner.nextInt();

        // Vérifie et échange les valeurs si nécessaire
        if (variable1 > variable2) {
            int temp = variable1;
            variable1 = variable2;
            variable2 = temp;
        }

        // Affiche les variables dans l'ordre croissant
        System.out.println("Les variables dans l'ordre croissant : " + variable1 + ", " + variable2);
    }
}

