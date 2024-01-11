package td1;

import java.util.Scanner;

public class Mentionetudiant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la moyenne de l'étudiant : ");
        double moyenne = scanner.nextDouble();

        if (moyenne >= 16) {
            System.out.println("Mention : Très Bien");
        } else if (moyenne >= 14) {
            System.out.println("Mention : Bien");
        } else if (moyenne >= 12) {
            System.out.println("Mention : Assez Bien");
        } else if (moyenne >= 10) {
            System.out.println("Mention : Passable");
        } else {
            System.out.println("Mention : Insuffisant");
        }
    }
}
