import java.util.List;

public class main {
    public static void main(String[] args) {
        bank bank = new bank();

        account account1 = new account("Maulana", "1234567890");
        account account2 = new account("Syawal", "1345678990");
        account account3 = new account("Adam_SI4601", "1202220377");

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Menampilkan daftar semua akun
        List<account> allAccounts = bank.getAllAccounts();
        System.out.println("Daftar semua akun:");
        for (account account : allAccounts) {
            System.out.println(account.getAccountInfo());
        }

        // Mengambil salah satu akun berdasarkan Account Number
        String targetAccountNumber = "1345678990";
        account targetAccount = bank.getAccount(targetAccountNumber);

        if (targetAccount != null) {
            System.out.println("Informasi akun dengan Account Number " + targetAccountNumber + ":");
            System.out.println(targetAccount.getAccountInfo());
        } else {
            System.out.println("Akun dengan Account Number " + targetAccountNumber + " tidak ditemukan.");
        }

        // Contoh deposit dan withdrawal
        account1.deposit(100.0);
        account1.withdraw(50.0);
    }
}

