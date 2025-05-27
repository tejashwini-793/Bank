public class BankTransaction {
    String accountName, accountholderName, accountType;
    int accountNumber;
    double balance;

    public BankTransaction(String accName, String holderName, String accType, int accNo, double bal) {
        accountName = accName;
        accountholderName = holderName;
        accountType = accType;
        accountNumber = accNo;
        balance = bal;
    }

    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Adi", "C123", "123 Main St");
        BankTransaction transaction = new BankTransaction("SBI", "Adi", "saving", 101234567, 5000.0);
        System.out.println("Transaction Created for " + transaction.accountholderName);
    }
}