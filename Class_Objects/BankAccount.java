class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 987654;
        account.balance = 500.00;

        account.deposit(150.00);   
        account.withdraw(50.00);
        account.displayBalance();
    }
}
