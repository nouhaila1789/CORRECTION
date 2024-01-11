package td1;

import java.util.Scanner;

public class Maximum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première variable : ");
        int variable1 = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int variable2 = scanner.nextInt();

        System.out.print("Entrez la troisième variable : ");
        int variable3 = scanner.nextInt();

        int maximum = variable1;  // Supposons que la première variable est la plus grande initialement

        if (variable2 > maximum) {
            maximum = variable2;  // Mettre à jour le maximum si la deuxième variable est plus grande
        }

        if (variable3 > maximum) {
            maximum = variable3;  // Mettre à jour le maximum si la troisième variable est plus grande
        }

        System.out.println("Le maximum des trois variables est : " + maximum);
    }
}

