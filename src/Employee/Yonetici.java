package Employee;

public class Yonetici extends Calisan{
    //Subclasss
    private int sorumlu_kisi;
    public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {
        super(isim, maas, departman);//Kalıtım yapılan sınıfın contructorı kullanır
        this.sorumlu_kisi = sorumlu_kisi;
    }

    public void zamYap(int zamMiktari){
        System.out.println("Çalışanlara "+ zamMiktari + " TL zam yapıldı..");
    }
    public void bilgileriGoster(){
        /*System.out.println("Maas : " + getMaas());
        System.out.println("İsim : " + getIsim());
        System.out.println("Depatman : " + getDepartman());*/
        super.bilgileriGoster();
        System.out.println("Sorumlu oldugu kisi sayısı : " + this.sorumlu_kisi);
    }
}
