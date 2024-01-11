package td1;

import java.util.Scanner;

public class MaximumPosition{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;  // Initialisez max avec la plus petite valeur possible
        int position = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Entrez le nombre #" + i + " : ");
            int nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre;
                position = i;
            }
        }

        System.out.println("Le maximum parmi les 20 nombres est : " + max);
        System.out.println("Il a été saisi à la position #" + position);
    }
}
