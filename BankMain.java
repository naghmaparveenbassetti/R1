abstract class Bank{
    double amount;
    int time;
    int rate;
}
class Deposits extends Bank{
    void totalAmount(double amt, int t, int r){
        this.amount=amt;
        this.time=t;
        this.rate=r;
        double totalDeposit=(amt*t*r);
        System.out.println("Deposit amount: "+amount);
        System.out.println("Rate of interest: "+rate);
        System.out.println("Time: "+time);
        System.out.println("Total deposit amount: "+totalDeposit);
    }
}
class Withdrawl extends Deposits{
    void totalAmount1(double amt, int t, int r){
        super.amount=amt;
        super.time=t;
        super.rate=r;
        double withdrawlAmount=(amount+10000);
        System.out.println("Total withdrawl amount: "+withdrawlAmount);
    }
    }
public class BankMain{
    public static void main(String[] args) {
        Withdrawl w=new Withdrawl();
        Deposits d=new Deposits();
        d.totalAmount(10000, 3, 6);
        w.totalAmount1(20000, 4, 8);    
    }
}