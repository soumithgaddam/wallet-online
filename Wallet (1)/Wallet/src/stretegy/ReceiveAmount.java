package stretegy;
import driver.*;
import factory.*;
import singleton.*;



import java.util.Scanner;

public class ReceiveAmount implements CreditStrategy{
    Scanner input=new Scanner(System.in);

    @Override
    public int creditAmount() {
        System.out.print("Enter amount request : ");
        int receiveAmount = input.nextInt();
        return receiveAmount;
    }
}
