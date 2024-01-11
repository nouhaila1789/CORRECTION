package td1;

public class Total {
    public static void main(String[] args) {
        int total = 15;

        System.out.println("Les possibilités d'obtenir un total de 15 en ajoutant trois entiers entre 1 et 9 sont :");

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    if (a + b + c == total) {
                        System.out.println(a + " + " + b + " + " + c + " = " + total);
                    }
                }
            }
        }
    }
}

