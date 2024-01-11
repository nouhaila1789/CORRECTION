package td1;

import java.util.Scanner;

public class chiffre{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier de trois chiffres non nuls : ");
        int N = scanner.nextInt();

        if (N < 100 || N > 999) {
            System.out.println("L'entier doit être de trois chiffres non nuls.");
        } else {
            int chiffre1 = N / 100;      // Obtenez le premier chiffre
            int chiffre2 = (N / 10) % 10; // Obtenez le deuxième chiffre
            int chiffre3 = N % 10;        // Obtenez le troisième chiffre

            System.out.println("Les nombres formés par les chiffres de " + N + " sont :");

            System.out.println("" + chiffre1 + chiffre2 + chiffre3);
            System.out.println("" + chiffre1 + chiffre3 + chiffre2);
            System.out.println("" + chiffre2 + chiffre1 + chiffre3);
            System.out.println("" + chiffre2 + chiffre3 + chiffre1);
            System.out.println("" + chiffre3 + chiffre1 + chiffre2);
            System.out.println("" + chiffre3 + chiffre2 + chiffre1);
        }
    }
}
