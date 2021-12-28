package ATM;

import java.util.Scanner;

public class Login {
    public boolean Login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Kullanıcı adınız: ");
        username = scanner.nextLine();
        System.out.println("Şifre : ");
        password = scanner.nextLine();
        if (hesap.getUsername().equals(username) && hesap.getPassword().equals(password)){
            return true;
        } else {
            return false;
        }
    }
}
