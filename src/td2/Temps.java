package td2;

class Temps {
    private int heures;
    private int minutes;
    private int secondes;


    public  static void main(String[] args) {

        Temps temps = new Temps(1, 23, 20);
        System.out.println(temps.toString());
        temps.ajouterMinutes(300);
        System.out.println(temps.toString());
        temps.ajouterSecondes(3600);
        System.out.println(temps.toString());
    }




    // Constructeur par défaut
    public Temps() {
    }

    // Constructeur avec heures
    public Temps(int heures) {
        this.heures = heures;

    }

    // Constructeur avec heures et minutes
    public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;

    }

    // Constructeur avec heures, minutes et secondes
    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    // Constructeur par copie
    public Temps(Temps temps) {
        this.heures = temps.heures;
        this.minutes = temps.minutes;
        this.secondes = temps.secondes;
    }

    // Accesseurs et mutateurs
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    // Méthode pour ajouter des heures
    public void ajouterHeures(int heures) {
        this.heures += heures;
        this.heures %= 24; // Pour gérer le débordement (0-23 heures)
    }

    // Méthode pour ajouter des minutes
    public void ajouterMinutes(int minutes) {
        minutes+=this.getMinutes();
        ajouterHeures(minutes/60);
        this.setMinutes(minutes%60);

    }
    public void ajouterSecondes(int secondes) {
        secondes+=this.getSecondes();
        ajouterMinutes(secondes/60);
        this.setSecondes(secondes%60);



    }

    @Override
    public String toString() {
        return "Temps{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", secondes=" + secondes +
                '}';
    }






}
