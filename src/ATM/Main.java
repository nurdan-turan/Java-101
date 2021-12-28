package ATM;

public class Main {

    public static void main(String[] args) {
        Hesap hesap = new Hesap("AAAA","123456", 10000);
         ATM atm = new ATM();
         atm.run(hesap);
         System.out.println("Programdan çıkılıyor..");
    }
}
