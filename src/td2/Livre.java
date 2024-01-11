package td2;

public class Livre {
    private String titre;
    private String auteur;
    private double prix;
    private int annee;

    // Constructeur par défaut
    public Livre() {

    }

    // Constructeur avec titre
    public Livre(String titre) {
        this.titre = titre;

    }

    // Constructeur avec titre et auteur
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;

    }

    // Constructeur avec titre, auteur et prix
    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;

    }

    // Constructeur avec titre, auteur, prix et année
    public Livre(String titre, String auteur, double prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }

    // Constructeur par copie
    public Livre(Livre autreLivre) {
        this.titre = autreLivre.titre;
        this.auteur = autreLivre.auteur;
        this.prix = autreLivre.prix;
        this.annee = autreLivre.annee;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Méthode toString pour afficher les informations du livre
    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                '}';
    }



    public static void main(String[] args) {
        Livre livre1 = new Livre("L'Étranger", "Albert Camus", 12.99, 1942);
        Livre livre2 = new Livre(livre1); // Copie de livre1

        System.out.println("Livre 1 : " + livre1);
        System.out.println("Livre 2 (copie de livre1) : " + livre2);

        livre2.setPrix(15.99);
        livre2.setAnnee(1957);

        System.out.println("Livre 2 (modifié) : " + livre2);
    }
}


