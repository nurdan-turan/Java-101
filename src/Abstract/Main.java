package Abstract;

public class Main {

    public static void main(String args[]){
        Sekil sekil = new Kare("Kare", 4);
        sekil.alan_hesapla();
        Daire daire = new Daire("Daire",5);
        daire.alan_hesapla();

        Kare kare1 = new Kare("Kare", 6);
        kare1.cevre_hesapla();

    }
}
