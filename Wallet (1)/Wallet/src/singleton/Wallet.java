package singleton;
import driver.*;
import factory.*;
import stretegy.*;



public interface Wallet {
    void createAccount();
    void login();
    void debit();
    void credit();
    void showBalance();

}
