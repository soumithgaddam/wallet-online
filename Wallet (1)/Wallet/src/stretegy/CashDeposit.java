package stretegy;
import driver.*;
import factory.*;
import singleton.*;



import java.util.Scanner;

public class CashDeposit implements CreditStrategy{
    Scanner input=new Scanner(System.in);

    @Override
    public int creditAmount() {
        System.out.print("Enter amount to deposit : ");
        int depositAmount = input.nextInt();
        return depositAmount;
    }
}
