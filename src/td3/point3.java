package td3;

class Point {
    protected int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }

    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

class Centre extends Point {
    private char nom;

    public Centre(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void affNom() {
        System.out.println("Nom : " + nom);
    }

    public void affiche() {
        super.affiche();
        affNom();
    }
}

class Cercle extends Centre {
    private double rayon;

    public Cercle(int x, int y, char nom, double rayon) {
        super(x, y, nom);
        this.rayon = rayon;
    }

    public void affiche() {
        super.affiche();
        System.out.println("Rayon : " + rayon);
    }



    public static void main(String[] args) {
        // Création d'un objet Centre
        Centre centre = new Centre(1, 2, 'A');

        // Affichage des coordonnées et du nom
        centre.affiche();

        // Création d'un objet Cercle
        Cercle cercle = new Cercle(3, 4, 'B', 5.0);

        // Affichage des coordonnées, du nom et du rayon du cercle
        cercle.affiche();
    }
}

