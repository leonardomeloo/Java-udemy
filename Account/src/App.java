import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("ENter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdraw = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdraw);

            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            account.withdraw(amount);
            
            System.out.println(account.toString());
            
        }
        catch(DomainException e){
                System.out.println("Error: " + e);
            }
            

        sc.close();
    }
}
