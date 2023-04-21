/*Create a class Account with properties like accountNo, name, address, phoneNo, dob, balance.
Write getter and setter methods for all properties
Create Parameterized Constructor for class Account.
Create a method closeAccount()
Create a class SavingsAccount which inherits Account class.
Create different methods in SavingsAccount class like withdraw(), deposit(), fixedDeposit().
Create a class LoanAccount which also inherits Account class.
Create different methods in LoanAccount class like payEMI(), topUpLoan(), repayment()*/

class Account {

    private int AccountNo, balance;
    private String name, address, dob, phoneNo;

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int AccountNo) {
        this.AccountNo = AccountNo;
    }

    public int getbalance() {
        return balance;
    }

    public void setbalance(int balance) {
        this.balance = balance;
    }

    public String getphoneNo() {
        return phoneNo;
    }

    public void setphoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getdob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getaddress() {
        return address;
    }

    public void setAdd(String address) {
        this.address = address;
    }

    public Account(int AccountNo, int balance, String phoneNo, String dob, String name, String address) {
        this.AccountNo = AccountNo;
        this.balance = balance;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.name = name;
        this.address = address;

    }

    Account() {

    }

    public void CloseAccount() {
        System.out.println("This method Closes the Account");
    }

    public String toString() {
        return "Account No. = " + AccountNo + " Balance = " + balance +
                " Phone No. = " + phoneNo + " DOB= " + dob
                + " Name= " + name + " Address = " + address;
    }

}

class SavingsAccount extends Account {

    public void withdraw() {
        System.out.println("Withdraw Method...");
    }

    public void deposit() {
        System.out.println("Deposit Method...");
    }

    public void fixedDeposit() {
        System.out.println("fixedDeposit Method...");
    }
}

class LoanAccount extends Account {

    public void payEMI() {
        System.out.println("PayEMI Method..");
    }

    public void topUpLoan() {
        System.out.println("topUpLoan Method...");
    }

    public void repayment() {
        System.out.println("repayment Method....");
    }
}

public class InheritenceNt {

    public static void main(String args[]) {

        Account obj = new Account(1233, 10000, "78789", "019298", "sneha", "khandwa");

        SavingsAccount obj1 = new SavingsAccount();

        obj1.withdraw();
        obj1.deposit();
        obj1.fixedDeposit();

        LoanAccount obj2 = new LoanAccount();

        obj2.payEMI();
        obj2.topUpLoan();
        obj2.repayment();

    }
}
