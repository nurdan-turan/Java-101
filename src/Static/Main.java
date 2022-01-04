package Static;



public class Main {
    public static void main(String args[]){
        Seyirci seyirci1 = new Seyirci("A");
        Seyirci seyirci2 = new Seyirci("B");

        seyirci1.oyun_seyret();
        System.out.println("Seyirci sayisi : " + Seyirci.getSeyirciSayisi());
    }
}
