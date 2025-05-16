//BankAccount and DataHiding
package Day10;
class bankAccount{
    private String AccountHolder;
    private double balanace;

    public bankAccount(String AccountHolder,double initialBalance){
        this.AccountHolder=AccountHolder;
        if(initialBalance>=0){
            this.balanace=initialBalance;
        }else{
            System.out.println("Initial balance must be non-negtive");
            this.balanace=0;
        }
    }
    public double getBalance(){
        return balanace;
    }
   
    public void deposit(double amount){
        if(amount>0){
            balanace+=amount;
            System.out.println("Deposited: " + amount);
        }else{
            System.out.println("Deposited amount must be positive");
        }
    }

    public void withDraw(double amount){
        if(amount>0 && amount<=balanace){
            balanace-=amount;
            System.out.println("Withdrawn amount: " + amount);
        }else if(amount<=0){
            System.out.println("Withdrawn amount must be positive");
        }else{
            System.out.println("Insufficent Balance");
        }
    }
    public String getAccountHolder(){
        return AccountHolder;
    }
}
public class Activity3{
    public static void main(String[] args) {
        //Task8:Create a bankAccount class with private field balanace

       //Task 9: Add deposit(double amount) and withdraw(double amount) methods with validation.
       //Task 10: Test deposit and withdrawal with valid and invalid inputs
       bankAccount account = new bankAccount("Prerna", 100);
       System.out.println("Account holder: " + account.getAccountHolder());
       System.out.println("Initial balance : " + account.getBalance());

       account.deposit(100);
       account.withDraw(200);
       account.deposit(300);
       account.withDraw(500);
       System.out.println("Final Balance: "  + account.getBalance());
    }
}