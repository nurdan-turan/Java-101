package ATM;

public class Hesap {
    private String username;
    private String password;
    private int balance;

    public Hesap(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public  void depositMoney(int amount){
        this.balance += amount;
        System.out.println("Bakiyeniz :"+ balance);
    }
    public void withDrawMoney(int amount){
        if (balance - amount < 0){
            System.out.println("Yeterli bakiyeniz bulunmamaktadır");
        }else{
            this.balance -= amount;
            System.out.println("Bakiyeniz :"+ balance);
        }


    }
}
