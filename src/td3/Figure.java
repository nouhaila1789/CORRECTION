package td3;

abstract class Figure {
    protected String nom;

    public Figure() {
        this.nom = "Figure";
    }


    public Figure(String nom) {
        this.nom = nom;
    }


    public abstract double getPerimeter();


    public abstract double getAire();


    @Override
    public String toString() {
        return "Nom de la figure : " + nom;
    }
}

class Disque extends Figure {
    private Point centre;
    private double rayon;


    public Disque() {
        super("Disque");
        this.centre = new Point(0, 0);
        this.rayon = 1.0;
    }


    public Disque(Point centre, double rayon) {
        super("Disque");
        this.centre = centre;
        this.rayon = rayon;
    }


    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * Math.pow(rayon, 2);
    }
}

class Rectangle extends Figure {
    private double longueur;
    private double largeur;


    public Rectangle() {
        super("Rectangle");
        this.longueur = 1.0;
        this.largeur = 1.0;
    }


    public Rectangle(double longueur, double largeur) {
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }


    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }


    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }

    public static void main(String[] args) {
        Disque disque = new Disque(new Point(0, 0), 5.0);
        System.out.println(disque);
        System.out.println("Périmètre : " + disque.getPerimeter());
        System.out.println("Aire : " + disque.getAire());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "Mon Rectangle");
        System.out.println(rectangle);
        System.out.println("Périmètre : " + rectangle.getPerimeter());
        System.out.println("Aire : " + rectangle.getAire());
    }
}
