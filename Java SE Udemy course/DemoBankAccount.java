class DemoBankAccount {

    public int accountNo;
    public String accountName;
    public String address;
    public long phoneNo;
    public String DOB;
    public double balance = 0;

    // Constructor
    public DemoBankAccount(int accountNo,String accountName, String address,long phoneNo,String DOB){
        this.accountName = accountName;
        setAccountName(accountName);
        setAddress(address);
        setPhoneNo(phoneNo);
        setDOB(DOB);
    }
    // Getters
    public int getAccountNo(){return this.accountNo;}
    public String getAccountName(){return this.accountName;}
    public String getAddress(){return this.address;}
    public long getPhoneNo(){return this.phoneNo;}
    public String getDOB(){return this.DOB;}
    public double getBalance(){return this.balance;}
    // Setters
    public void setAccountName(String accountName) {this.accountName = accountName;}
    public void setAddress(String address) {this.address = address;}
    public void setPhoneNo(long phoneNo) {this.phoneNo = phoneNo;}
    public void setDOB(String DOB) {this.DOB = DOB;}
    public void setBalance(double balance){this.balance = balance;}
}

class SavingsAccount extends DemoBankAccount {

    public double fixedDeposit;

    public SavingsAccount(int accountNo,String accountName, String address,long phoneNo,String DOB){
        super(accountNo,accountName,address,phoneNo,DOB);
    }

    public void deposit(double depositAmount){
        setBalance(getBalance() + depositAmount);
    }

    public void withdraw(double withdrawAmount){
        setBalance(getBalance() - withdrawAmount);
    }

    public double getFixedDeposit(){return this.fixedDeposit;}

    public void setFixedDeposit(double fixedDepositAmount){
        this.fixedDeposit = fixedDepositAmount;
        setBalance(getBalance() - fixedDepositAmount);
    }

    public void liquidate(double amount){
        fixedDeposit = fixedDeposit - amount;
        setBalance(getBalance() + amount);
    }
}

class testBankAccount {
    public static void main(String[] args){
        SavingsAccount sa1 = new SavingsAccount(123456789,"Naveen raj","Post office street, Anaimalayan patti",9876543210L,"25.02.1999");

        System.out.println("Account Name: " + sa1.getAccountName());

        System.out.println("Current Balance: " + sa1.getBalance());

        System.out.println("Deposit amount: " + 1000);

        sa1.deposit(1000);

        System.out.println("Current Balance: " + sa1.getBalance());

        System.out.println("Withdraw amount: " + 250);

        sa1.withdraw(250);

        System.out.println("Current Balance: " + sa1.getBalance());

        System.out.println("Fixed deposit amount: " + 500);

        sa1.setFixedDeposit(500);

        System.out.println("Current Balance: " + sa1.getBalance());

        System.out.println("Fixed deposit Balance: " + sa1.getFixedDeposit());
    }
}
