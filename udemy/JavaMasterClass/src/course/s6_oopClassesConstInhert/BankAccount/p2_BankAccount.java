package course.s6_oopClassesConstInhert.BankAccount;

public class p2_BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public p2_BankAccount() {
        this(0,0.0,"Default name", "Default email", 0);
    }

    public p2_BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public double depositFunds(double deposit) {
        return this.balance += deposit;
    }

    public void withdrawFunds (double withdraw) {
       if (getBalance() < 0 ) {
           System.out.println("Insufficient funds. \nCurrent funds are: " + this.balance);
       } else if (this.balance - withdraw < 0){
           System.out.println("Insufficient Withdraw funds. "+ withdraw +"\nCurrent funds are: " + this.balance);
       } else {
           this.balance -= withdraw;
           System.out.println("Withdrawal of " + withdraw + " processed. Remaining balance = " + this.balance);
       }
    }


}
