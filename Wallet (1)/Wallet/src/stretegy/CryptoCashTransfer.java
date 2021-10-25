package stretegy;
import driver.*;
import factory.*;
import singleton.*;



import java.util.Scanner;

public class CryptoCashTransfer implements DebitStrategy{
    Scanner input=new Scanner(System.in);
    @Override
    public int debitAmount() {
        System.out.println("Email address : example@gmail.com ");

        boolean a=true;
        while(a){
            System.out.print("Receiver email address : ");
            String email = input.next();

            if(email.equals("example@gmail.com")){
                System.out.print("Enter amount to withdraw : ");
                int withdrawAmount = input.nextInt();
                return withdrawAmount;
            }else{
                System.out.println("Invalid input");

            }
        }

        return 0;
    }
}
