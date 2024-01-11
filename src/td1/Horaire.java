package td1;

import java.util.Scanner;


public class Horaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer l'heure (0-23) : ");
        int heure = scanner.nextInt();
        System.out.println("Choisissez la langue (f pour français, a pour anglais) : ");
        String langue = scanner.next();

        if (langue.equals("f")) {
            if (heure >= 0 && heure < 18) {
                System.out.println("Bonjour");
            } else if (heure >= 18 && heure < 22) {
                System.out.println("Bonsoir");
            } else {
                System.out.println("Bonne nuit");
            }
        } else if (langue.equals("a")) {
            if (heure >= 0 && heure < 18) {
                System.out.println("Good Morning");
            } else if (heure >= 18 && heure < 22) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }
        } else {
            System.out.println("Langue non reconnue. Veuillez choisir 'f' pour le français ou 'a' pour l'anglais.");
        }
    }
}
