package course.s6_oopClassesConstInhert.BankAccount;

public class p2_vipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public p2_vipCustomer() {
        this("Unknown", 0.0000,"unknown@mail.ce");
    }

    public p2_vipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@mail.ce");
    }

    public p2_vipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
