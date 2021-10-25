package stretegy;
import driver.*;
import factory.*;
import singleton.*;



import java.util.Scanner;

public class CashWithdrawlBank implements DebitStrategy{
   Scanner input=new Scanner(System.in);
    @Override
    public int debitAmount() {
        System.out.print("Enter amount to withdraw : ");
        int withdrawAmount = input.nextInt();
        return withdrawAmount;
    }
}
