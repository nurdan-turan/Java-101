package ATM;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class ATM {
    public void run(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("**********************************");
        System.out.println("Kullanıcı Girişi...");
        int loginTimes = 3;
        while(true){
            if (login.Login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                System.out.println("Giriş başarısız");
                loginTimes -= 1;
                System.out.println("Kalan giriş hakkınız :" + loginTimes);
            }
            if (loginTimes == 0){
                System.out.println("Giriş hakkınız kalmamıştır..");
                return;
            }
        }

        System.out.println("**********************************");
        String islemler = "1. Bakiye Görüntüle\n" +
                           "2. Para Yatırma\n" +
                           "3. Para Çekme\n" +
                           "4. çıkış için q'ya basınız\n";
        System.out.println(islemler);
        System.out.println("**********************************");
        while (true){
            System.out.println("İşlem seçiniz:");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                System.out.println("**********************************");
                System.out.println("Güncel bakiyeniz.." + hesap.getBalance());
            }
            else if (islem.equals("2")){
                System.out.print("yatırmak istediğiniz tutarı giriniz..");
                int amount = scanner.nextInt();
                scanner.nextLine();
                hesap.depositMoney(amount);
                System.out.println("Güncel bakiyeniz.." + hesap.getBalance());
            }
            else if (islem.equals("3")){
                System.out.println("**********************************");
                System.out.print("Çekmek istediğiniz tutarı giriniz..");
                int amount = scanner.nextInt();
                scanner.nextLine();
                hesap.withDrawMoney(amount);
                System.out.println("Güncel bakiyeniz.." + hesap.getBalance());
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }


        


    }
}
