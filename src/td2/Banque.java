package td2;

public class Banque {
    private int Ncompte;
    private float solde;
    private String cin;



    public Banque(){

    }
    public Banque(int Ncompte,float solde,String cin){
        this.Ncompte=Ncompte;
        this.cin=cin;
        this.solde=solde;
    }
public void deposer(float solde){
        this.solde+=solde;
}
public void retirer(float solde){
        if(this.solde>solde)
            this.solde-=solde;
}
public float avoirsolde(){
        return solde;
}
public String avoirinfo(){
        return cin;
}
public static void main(String[] args){
        Banque banque= new  Banque( 5,50007,"AB1200");
        banque.avoirinfo();
        banque.avoirsolde();
        banque.deposer(500);
    banque.avoirinfo();
    banque.avoirsolde();
    banque.retirer(200);
    banque.avoirinfo();
    banque.avoirsolde();


}



}
