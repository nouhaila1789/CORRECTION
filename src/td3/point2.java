package td3;

class Point2 {
    protected int x, y;

    // Le constructeur ne doit pas avoir de type de retour
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}

class PointNom extends Point2 {
    private char nom;

    public PointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    public void setPointNom(int x, int y, char nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println("Coordonnees : " + x + " " + y + ", Nom : " + nom);
    }

    public static void main(String[] args) {

        PointNom pointAvecNom = new PointNom(1, 2, 'A');

        pointAvecNom.affCoordNom();

        pointAvecNom.deplace(3, 4);

        pointAvecNom.affCoordNom();

        pointAvecNom.setNom('B');

        pointAvecNom.affCoordNom();
    }
}

