//oo1kCfZOR
abstract class BankAccount{
    private String AccountHolderName;
    private double Balance;
    private String city;
    
    BankAccount(String AccountHolderName, double Balance,String city){
        this.AccountHolderName=AccountHolderName;
        this.Balance = Balance;
        this.city = city;
    }


   public abstract void displayDetails();


public String getAccountHolderName(){
    return AccountHolderName;
}

public void SetAccountHolderName(String AccountHolderName){
    this.AccountHolderName=AccountHolderName;
}

public double getBalance(){
    return Balance;
}

public void SetBalance( double Balance){
    this.Balance=Balance;
}

public String getCity(){
    return city;
}

public void setCity(String city){
    this.city = city;
}

public void deposit(double amount){
    if(amount>0){
        Balance += amount;
        System.out.println("Deposited amount :" + amount);
    }
    else{
        System.out.println("Invalid amount");
    }
}

public void withdraw(double amount){
    if(amount>0 && amount<=Balance){
        Balance -= amount;
        System.out.println("withdraw amount :" + amount);
    }
    else{
        System.out.println("Insufficient Balance");
    }
}

}


class savingsAccount extends BankAccount{
    public savingsAccount(String AccountHolderName, double Balance,String city){
        super(AccountHolderName,Balance,city);
    }
    @Override
    public void displayDetails(){
        System.out.println("Savings Account --------------");
        System.out.println("Account Holder Name : " + getAccountHolderName());
        System.out.println("Before 5% Account Balance : " + getBalance());
        double five_per=(getBalance()*(0.05));
        System.out.println("Interest for 5% : " + five_per);
        System.out.println("total Balance after interest : " + (getBalance() + five_per));
        SetBalance(five_per + getBalance());
        System.out.println("Account City : " + getCity());
    }    
}

public class Bank_OOPS{
    public static void main(String[] args){
        
        BankAccount savings = new savingsAccount("Arul",1000.00,"Chennai");
        savings.deposit(2000.00);
        savings.withdraw(500.00);
        // System.out.println("Savings Account : ");
        savings.displayDetails();
    }
}