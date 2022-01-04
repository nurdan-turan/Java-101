package Abstract;

public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }

    public void ismini_yaz(String isim){
        System.out.println("Bu class " + isim + "objesidir...");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    abstract void alan_hesapla();
}
