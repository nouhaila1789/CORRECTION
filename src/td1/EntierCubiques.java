package td1;

public class EntierCubiques {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int nombre = i;
            int sommeCubique = 0;

            while (nombre > 0) {
                int chiffre = nombre % 10;
                sommeCubique += chiffre * chiffre * chiffre;
                nombre /= 10;
            }

            if (sommeCubique == i) {
                System.out.println("Nombre cubique trouvé : " + i);
            }
        }
    }
}

