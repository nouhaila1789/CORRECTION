package td3;

class vehicule {
    private int nbPassager;


    public vehicule(int n) {
        nbPassager = n;
    }


    public String toString() {
        return "Nombre de passagers : " + nbPassager;
    }
}

class Moto extends vehicule {
    private int nbRoues = 2;

    public Moto(int n) {
        super(n);
    }


    @Override
    public String toString() {
        return super.toString() + ", Nombre de roues : " + nbRoues;
    }
}


class Avion extends vehicule {
    private int nbMoteur;


    public Avion(int nbP) {
        super(nbP);
    }


    public Avion(int nbP, int nbM) {
        super(nbP);
        nbMoteur = nbM;
    }


    @Override
    public String toString() {
        return super.toString() + ", Nombre de moteurs : " + nbMoteur;
    }
}

class Triporteur extends Moto {

    public Triporteur(int n) {
        super(n);
    }

    public static void main(String[] args) {
        vehicule vehicule = new vehicule(4);
        System.out.println("Vehicule : " + vehicule);

        Moto moto = new Moto(12);
        System.out.println("Moto : " + moto);

        Avion avion1 = new Avion(200);
        System.out.println("Avion 1 : " + avion1);

        Avion avion2 = new Avion(150, 4);
        System.out.println("Avion 2 : " + avion2);

        Triporteur triporteur = new Triporteur(23);
        System.out.println("Triporteur : " + triporteur);
    }
}
