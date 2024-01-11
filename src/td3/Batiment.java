package td3;

class Batiment {
    private String adresse;
    public Batiment() {
        this.adresse = "Adresse non spécifiée";
    }


    public Batiment(String adresse) {
        this.adresse = adresse;
    }


    public String getAdresse() {
        return adresse;
    }

    // Mutateur pour l'adresse
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode toString pour afficher la représentation du Bâtiment
    public String toString() {
        return "Bâtiment [Adresse : " + adresse + "]";
    }
}

class Maison extends Batiment {
    private int nbChambres;

    // Constructeur par défaut
    public Maison() {
        super(); // Appelle le constructeur de la classe parente
        this.nbChambres = 0;
    }

    // Constructeur avec adresse et nombre de chambres
    public Maison(String adresse, int nbChambres) {
        super(adresse); // Appelle le constructeur de la classe parente avec adresse
        this.nbChambres = nbChambres;
    }

    // Accesseur pour le nombre de chambres
    public int getNbChambres() {
        return nbChambres;
    }

    // Mutateur pour le nombre de chambres
    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    // Méthode toString pour afficher la représentation de la Maison
    public String toString() {
        return super.toString() + " Maison [Nombre de chambres : " + nbChambres + "]";
    }
}

class Immeuble extends Batiment {
    private int nbAppart;
    {


    }
    public Immeuble()

    {
        super();
    }
    public Immeuble(String adresse, int nbAppart) {
        super(adresse);
        this.nbAppart = nbAppart;
    }


    public int getNbAppart() {
        return nbAppart;
    }
    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }


    public String toString() {
        return super.toString() + " Immeuble [Nombre d'appartements : " + nbAppart + "]";
    }


    public static void main(String[] args) {

        Maison maison1 = new Maison();
        Maison maison2 = new Maison("123 Rue de la Maison", 3);

        System.out.println("Maison 1 : " + maison1);
        System.out.println("Maison 2 : " + maison2);


        Immeuble immeuble1 = new Immeuble();
        Immeuble immeuble2 = new Immeuble("456 Rue de l'Immeuble", 10);

        System.out.println("Immeuble 1 : " + immeuble1);
        System.out.println("Immeuble 2 : " + immeuble2);
    }
}
