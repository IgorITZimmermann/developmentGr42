package clients;



import lesson27.CheckingAccount;
import lesson27.User;

public class TestClient {
    public static void main(String[] args) {
        //Account account = new Account(1000);

        //System.out.println(account.getBalance());

        //account.balance = 40000;

        //account.withdraw(30000);

        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);
        checkingAccount.withdraw(1200);
        System.out.println(checkingAccount.getBalance());

    }
}
