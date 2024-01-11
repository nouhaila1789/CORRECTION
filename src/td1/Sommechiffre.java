package td1;

import java.util.Scanner;

public class Sommechiffre{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        int somme = calculerSommeChiffres(nombre);

        System.out.println("La somme des chiffres du nombre " + nombre + " est : " + somme);
    }

    public static int calculerSommeChiffres(int nombre) {
        int somme = 0;

        while (nombre > 0) {
            int chiffre = nombre % 10;
            somme += chiffre;
            nombre /= 10;
        }

        return somme;
    }
}

