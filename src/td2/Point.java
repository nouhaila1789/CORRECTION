package td2;

public class Point {
    double abscisse;
    double ordonnee;


    public Point() {

    }

    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }


    public double getAbscisse() {
        return abscisse;
    }


    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }


    public double norme() {
        return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
    }

    public static void main(String[] args) {

        Point point = new Point(3.0, 4.0);


        System.out.println("Coordonnées du point A : (" + point.getAbscisse() + ", " + point.getOrdonnee() + ")");


        System.out.println("Norme du point A : " + point.norme());


        point.setAbscisse(5.0);


        point.setOrdonnee(6.0);


        System.out.println("Nouvelles coordonnées du point A : (" + point.getAbscisse() + ", " + point.getOrdonnee() + ")");
    }
}

