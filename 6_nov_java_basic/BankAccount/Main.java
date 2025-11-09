import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        BankAccount acc= new BankAccount(456789234,"Prakhar deep",99999.99);
        System.out.println("Account Details:");
        System.out.println("Account Number: "+acc.getAccountNumber());
        System.out.println("Holder Name: "+acc.getHolderName());
        System.out.println("Account balance: "+acc.getBalance());


    }
}
class BankAccount{
    private  int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber; 
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    } 
}
