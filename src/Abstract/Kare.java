package Abstract;

public class Kare extends Sekil {
    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void alan_hesapla() {
        System.out.println( getIsim() + " seklinin  alanı : " + (kenar*kenar));
    }

    public void cevre_hesapla(){
        System.out.println(getIsim() + "nin çevresi : " + kenar * 4);
    }
}
