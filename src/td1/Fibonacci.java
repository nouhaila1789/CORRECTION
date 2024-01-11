package td1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif n : ");
        int n = scanner.nextInt();

        int resultat = calculerFibonacci(n);

        System.out.println("Le " + n + "-ème terme de la suite de Fibonacci est : " + resultat);
    }

    public static int calculerFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int termePrecedent = 0;
            int termeCourant = 1;
            int resultat = 0;

            for (int i = 2; i <= n; i++) {
                resultat = termePrecedent + termeCourant;
                termePrecedent = termeCourant;
                termeCourant = resultat;
            }

            return resultat;
        }
    }
}
