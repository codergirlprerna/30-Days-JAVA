//Real World Abstraction Example
package Day12;
abstract class  BankAccount{
    double balance=0;
    abstract double deposit();
    abstract double withdraw();
    abstract double getBalance();
}
class SavingsAccount extends BankAccount{
    @Override
    double deposit(){
        balance+=100;
        return balance;
    }
    @Override 
    double withdraw(){
        balance-=50;
        return balance;
    }
    @Override
    double getBalance(){
        return balance;
    }
}

class CurrentAccount extends BankAccount{
    @Override
    double deposit(){
        balance+=500;
        return balance;
    }
    @Override
    double withdraw(){
        balance-=200;
        return balance;
    }
    @Override
    double getBalance(){
        return balance;
    }
}
public class Activity3 {
    public static void main(String[] args) {
        //Task 10: Create an abstract class BankAccount with methods deposit(), withdraw(), and getBalance().
        //Task 11: Extend BankAccount with SavingsAccount and CurrentAccount. Implement abstract methods differently in each.
        //Task 12: Create objects of both account types, perform transactions, and print balances.
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit();
        currentAccount.withdraw();
        System.out.println("Current Account balance is: " + currentAccount.getBalance());
        SavingsAccount savingAccount = new SavingsAccount();
        savingAccount.deposit();
        savingAccount.withdraw();
        savingAccount.getBalance();
        System.out.println("Saving Account Balance is: " + savingAccount.getBalance());


    }
}
