package td1;

public class etoile{
    public static void main(String[] args) {
        int n = 5;  // Nombre de lignes (vous pouvez modifier cette valeur)

        // Boucle pour afficher la partie supérieure de l'ensemble d'étoiles
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Boucle pour afficher la partie inférieure de l'ensemble d'étoiles
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

