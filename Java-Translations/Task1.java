// javac BankAccount.java
// java BankAccount

class BankAccountClass {
    int balance;
  
    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }
  
    public static void main(String[] args) {
        BankAccountClass Account1 = new BankAccountClass(5000);
        BankAccountClass Account2 = new BankAccountClass(15000);
    }
}

class BetterBankAccountClass extends BankAccountClass {
    int balance;
    int maximumAmount;

    public BetterBankAccount(int balance, int maximumAmount) {
        this.balance = balance;
        this.maximumAmount = maximumAmount;
    }

    public void isBalanceAboveMaximum() {
        if (this.balance > this.maximumAmount) {
            System.out.println("Your balance is higher than the maximum amount allowed!");
        } else {
            System.out.println("Your balance is under the maximum amount allowed!");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        BankAccountClass Account1 = new BankAccountClass(5000);
        BankAccountClass Account2 = new BankAccountClass(15000);
        /////////////////////
        BetterBankAccountClass Account3 = new BetterBankAccountClass(5000);
        BetterBankAccountClass Account4 = new BetterBankAccountClass(15000);
    }
}
