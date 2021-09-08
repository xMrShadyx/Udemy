package course.s6_oopClassesConstInhert.BankAccount;

public class p2_Constructors {
    public static void main(String[] args) {
        p2_BankAccount bankAccount = new p2_BankAccount(1234,500.00,"Bobby","Bobby@booby.com",223233443);
        System.out.println(bankAccount.getBalance());
        bankAccount.depositFunds(5445);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawFunds(15554);
        System.out.println(bankAccount.getBalance());



    }
}
