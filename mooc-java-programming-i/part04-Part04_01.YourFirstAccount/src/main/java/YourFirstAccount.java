
public class YourFirstAccount {

    public static void main(String[] args) {
        Account orlandosAccount = new Account("Orlando", 100.0);
        orlandosAccount.deposit(20.0);
        System.out.println(orlandosAccount);
    }
}
