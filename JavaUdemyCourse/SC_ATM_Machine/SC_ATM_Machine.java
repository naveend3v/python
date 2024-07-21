package code.JavaUdemyCourse.SC_ATM_Machine;

class ATM {
     synchronized void checkBalance(String customerName){
        System.out.println(customerName + " - Checking Balance..!");
        try{Thread.sleep(1000);}catch (Exception e){}
        System.out.println(customerName + " - Balance is Rs.$$$$");
        try{Thread.sleep(1000);}catch (Exception e){}

    }
    synchronized void withdraw(String customerName, double amount){
        System.out.println(customerName + " - Withdrawing amount : "+ amount);
        try{Thread.sleep(1000);}catch (Exception e){}
        System.out.println(customerName + " - Withdrawn completed");
        try{Thread.sleep(1000);}catch (Exception e){}
    }
}
class Customer extends Thread{
    ATM atm;
    String cname;
    double withdrawAmount;
    Customer(String name, double amount, ATM atm){
        this.cname = name;
        this.withdrawAmount = amount;
        this.atm = atm;
    }
    public void useATM(){
        atm.checkBalance(cname);
        atm.withdraw(cname,withdrawAmount);
    }
    public void run(){
        useATM();
    }
}

public class SC_ATM_Machine {
    public static void main(String[] args){
        ATM SBIatm = new ATM();
        Customer naveen = new Customer("Naveen", 2000,SBIatm);
        Customer ravi = new Customer("Ravi",5000,SBIatm);

        naveen.start();
        ravi.start();
    }
}
