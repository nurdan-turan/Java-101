package Employee;

import ATM.ATM;
import ATM.Hesap;

public class Main {

    public static void main(String[] args) {
      Yonetici yonetici1 = new Yonetici("aaaa aaa",5000,"IT",20);
      yonetici1.bilgileriGoster();
      yonetici1.zamYap(1000);
    }
}
