package stretegy;
import driver.*;
import factory.*;
import singleton.*;



import java.util.Scanner;

public class TransferCashToBank implements DebitStrategy{
    Scanner input=new Scanner(System.in);
    @Override
    public int debitAmount() {
        System.out.println("Bank Account : 321 ");

        boolean a=true;
        while(a){
            System.out.print("Enter Bank Account : ");
            int bankAccount = input.nextInt();

            if(bankAccount==321){
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
