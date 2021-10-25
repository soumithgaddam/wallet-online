package stretegy;
import driver.*;
import factory.*;
import singleton.*;


import java.util.Scanner;

public class AddCashWithDebitCard implements CreditStrategy{
    Scanner input=new Scanner(System.in);

    @Override
    public int creditAmount() {
        System.out.println("Card pin: 1290");
        boolean a=true;
        while(a){
            System.out.print("Enter card pin : ");
            int cardPin = input.nextInt();
            if(cardPin ==1290){
                System.out.print("Enter amount to deposit : ");
                int depositAmount = input.nextInt();
                return depositAmount;
            }else{
                System.out.print("Invalid pin");

            }
        }
        return 0;
    }
}
