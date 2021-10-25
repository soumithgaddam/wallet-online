package factory;
import driver.*;
import singleton.*;
import stretegy.*;


import java.util.Scanner;

public class Crypto implements Wallet{

    String email;
    String password;
    String name;
    int balance=600;
    Scanner input=new Scanner(System.in);
    @Override
    public void createAccount() {


        System.out.print("Enter email : ");
        email = input.next();

        System.out.print("Enter password : ");
        password = input.next();

        System.out.print("Enter name : ");
        name = input.next();

        System.out.println("Your crpto account is successfully created");
    }

    @Override
    public void login() {
        System.out.println("Login to your crypto account");

        System.out.print("Enter email : ");
        String tempEmail = input.next();

        if(email.equals(tempEmail)){
            System.out.print("Enter password : ");
            String tempPassword = input.next();

            if(password.equals(tempPassword)){
               menu();

            }

        }else {
            System.out.println("Incorrect username");
            login();

        }


    }

    @Override
    public void debit() {


        System.out.println("\n1. Cash transfer to bank");
        System.out.println("2. Send money");
        System.out.println("3. back");
        System.out.print("Choice: ");
        int choice = input.nextInt();

        if(choice == 1){
            DebitContext bCash=new  DebitContext(new TransferCashToBank());
            if(isWithdrawn(bCash.executeStrategy())){
                System.out.println("Cash transferred to your bank successfully");

                debit();
            }else {
                System.out.println("You cannot transfer amount due to low balance");
                debit();

            }
        }else if(choice == 2){
            DebitContext bCash=new  DebitContext(new CryptoCashTransfer());
            if(isWithdrawn(bCash.executeStrategy())){
                System.out.println("Amount sent successfully");
                debit();
            }else {
                System.out.println("You cannot transfer amount due to low balance");
                debit();
            }


        }else if(choice == 3){
            menu();
        }else{
            System.out.println("Invalid input");
            debit();

        }
    }

    @Override
    public void credit() {
        System.out.println("\n1. Add cash with debit card");
        System.out.println("2. Receive money");
        System.out.println("3. back");
        System.out.print("Choice: ");
        int choice = input.nextInt();

        if(choice == 1){
            CreditContext bCash=new CreditContext(new AddCashWithDebitCard());
            addBalance(bCash.executeStrategy());
            System.out.println("Cash added successfully");
            credit();


        }else if(choice == 2){
            CreditContext bCash=new CreditContext(new ReceiveAmount());
            addBalance(bCash.executeStrategy());
            System.out.println("Amount received successfully");
            credit();
        }else if(choice == 3){
            menu();
        }
        else{
            System.out.println("Invalid input");
            credit();
        }

    }

    @Override
    public void showBalance() {
        System.out.println("Your account balance is "+balance);
        menu();

    }

    public boolean isWithdrawn(int amount){
        if(amount<=balance){
            balance=balance-amount;
            return true;
        }
        return false;
    }

    public void addBalance(int amount){
        balance=balance+amount;
    }

    public void menu(){

        System.out.println("\n1.Show balance");
        System.out.println("2.Debit");
        System.out.println("3.Credit");
        System.out.println("4.logout");
        System.out.print("Choice : ");
        int choice = input.nextInt();
        if(choice == 1){
            showBalance();
        }else if(choice == 2){
            debit();
        }else if(choice == 3){
            credit();
        }else if(choice == 4){
            System.exit(1);
        }else {
            System.out.println("Invalid input");
            menu();

        }
    }
}
