package td1;

import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Entrez le nombre #" + i + " : ");
            int nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre;
            }
        }

        System.out.println("Le maximum parmi les 20 nombres est : " + max);
    }
}
