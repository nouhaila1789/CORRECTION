package td1;

import java.util.Scanner;

    public class Equation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez la valeur de a : ");
            double a = scanner.nextDouble();

            System.out.print("Entrez la valeur de b : ");
            double b = scanner.nextDouble();

            System.out.print("Entrez la valeur de c : ");
            double c = scanner.nextDouble();


            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {

                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Les solutions sont x1 = " + x1 + " et x2 = " + x2);
            } else if (discriminant == 0) {

                double x = -b / (2 * a);
                System.out.println("La solution est x = " + x);
            } else {

                System.out.println("Pas de solution réelle. Le discriminant est négatif.");
            }
        }
    }


