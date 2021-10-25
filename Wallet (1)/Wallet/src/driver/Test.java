package driver;
import factory.*;
import singleton.*;
import stretegy.*;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        WalletFactory walletFactory = new WalletFactory();




        System.out.println("Select the wallet you want to try");
        System.out.println("1.Mobile Wallet");
        System.out.println("2.Ebanking Wallet");
        System.out.println("3.Crypto Wallet");
        System.out.println("4.logout");
        System.out.print("Choice : ");
        int choice = input.nextInt();
        if(choice == 1){
            System.out.println("\nCreate Mobile Wallet account");
            Wallet eBankWallet=walletFactory.getWallet("Mobile");
            eBankWallet.createAccount();
            eBankWallet.login();
        }else if(choice == 2){
            System.out.println("\nSetup Ebanking Wallet account");
            Wallet eBankWallet=walletFactory.getWallet("Ebank");
            eBankWallet.createAccount();
            eBankWallet.login();
        }else if(choice == 3){
            System.out.println("\nCreate Crypto Wallet account");
            Wallet eBankWallet=walletFactory.getWallet("Crypto");
            eBankWallet.createAccount();
            eBankWallet.login();
        }else if(choice == 4){
            System.exit(1);
        }else {
            System.out.println("Invalid input");

        }




    }
}
