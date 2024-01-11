package td1;

import java.util.Scanner;

public class Signesansproduit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première valeur (A) : ");
        int A = scanner.nextInt();

        System.out.print("Entrez la deuxième valeur (B) : ");
        int B = scanner.nextInt();



        if (A > 0 && B > 0 || A < 0 && B < 0) {
            System.out.println("le produit est positif");
        } else if (A<0&& B > 0 || A >0&& B<0){
            System.out.println("le produit est negatif");
        } else {
            System.out.println("le produit est nul");
        }
        }
        }



