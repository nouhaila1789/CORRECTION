package td3;

abstract class Employe {
    private String nom;
    private String prenom;


    public Employe() {
        this.nom = "Nom";
        this.prenom = "Prenom";
    }


    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public String toString() {
        return "Employe [Nom : " + nom + ", Prenom : " + prenom + "]";
    }


    public abstract double gains();
}

class Patron extends Employe {
    private double salaire;

    public Patron() {
        super();

    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public double gains() {
        return salaire;
    }


    @Override
    public String toString() {
        return "Patron " + super.toString() + " [Salaire : " + salaire + "]";
    }
}

class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;


    public TravailleurCommission() {
        super();

    }


    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }
    @Override
    public double gains() {
        return salaire + commission * quantite;
    }


    @Override
    public String toString() {
        return "TravailleurCommission " + super.toString() + " [Salaire : " + salaire +
                ", Commission : " + commission + ", Quantité : " + quantite + "]";
    }

    public void setquantite(int i) {
    }

}

class TravailleurHoraire extends Employe {
    private double retribution;
    private int heures;


    public TravailleurHoraire() {
        super();

    }
    private void setheures(int i) {
    }


    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }


    @Override
    public double gains() {
        return retribution * heures;
    }


    @Override
    public String toString() {
        return "TravailleurHoraire " + super.toString() + " [Rétribution : " + retribution +
                ", Heures : " + heures + "]";
    }



    public static void main(String[] args) {
        // Test du patron
        Patron patron = new Patron("Dupont", "Jean", 5000.0);
        System.out.println(patron);
        System.out.println("Gains : " + patron.gains());

        // Test du travailleur à la commission
        TravailleurCommission travailleurCommission = new TravailleurCommission("Martin", "Alice", 1000.0, 0.1);
        travailleurCommission.setquantite(50);
        System.out.println(travailleurCommission);
        System.out.println("Gains : " + travailleurCommission.gains());

        // Test du travailleur horaire
        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("Dubois", "Pierre", 20.0);
        travailleurHoraire.setheures(40);
        System.out.println(travailleurHoraire);
        System.out.println("Gains : " + travailleurHoraire.gains());
    }


}
