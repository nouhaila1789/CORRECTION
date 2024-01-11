package td2;

class Rectangle {
    private double longueur;
    private double largeur;

    // Constructeur par défaut
    public Rectangle() {

    }

    // Constructeur avec longueur et largeur
    public Rectangle(double longueur, double largeur) {
        this.largeur=largeur;
        this.longueur=longueur;
    }

    // Constructeur de copie
    public Rectangle(Rectangle autreRectangle) {
        this.longueur = autreRectangle.longueur;
        this.largeur = autreRectangle.largeur;
    }

    // Accesseurs et mutateurs pour longueur et largeur
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur > 0) {
            this.longueur = longueur;
        } else {
            System.out.println("La longueur doit être positive");

        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur > 0) {
            this.largeur = largeur;
        } else {
            System.out.println("La largeur doit être positive");

        }
    }

    // Méthode pour calculer le périmètre
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Méthode pour calculer l'aire
    public double aire() {
        return longueur * largeur;
    }

    // Méthode pour vérifier si le rectangle est un carré
    public boolean isCarre() {
        return longueur == largeur;
    }

    // Méthode pour afficher une représentation du rectangle
    @Override
    public String toString() {
        return "Rectangle [Longueur : " + longueur + ", Largeur : " + largeur + "]";
    }



    public static void main(String[] args) {
        // Test du constructeur par défaut
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1 : " + rectangle1);

        // Test du constructeur avec longueur et largeur
        Rectangle rectangle2 = new Rectangle(4.0, 3.0);
        System.out.println("Rectangle 2 : " + rectangle2);

        // Test du constructeur de copie
        Rectangle rectangle3 = new Rectangle(rectangle2);
        System.out.println("Rectangle 3 (copie de Rectangle 2) : " + rectangle3);

        // Test des méthodes
        System.out.println("Périmètre de Rectangle 2 : " + rectangle2.perimetre());
        System.out.println("Aire de Rectangle 2 : " + rectangle2.aire());
        System.out.println("Est-ce que Rectangle 2 est un carré ? " + rectangle2.isCarre());
    }
}
