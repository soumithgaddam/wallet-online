package factory;
import driver.*;
import singleton.*;
import stretegy.*;


public class WalletFactory {
    public Wallet getWallet(String walletType){
        if(walletType == null){
            return null;
        }
        if(walletType.equalsIgnoreCase("Mobile")){
            return new MobileWallet();

        } else if(walletType.equalsIgnoreCase("Ebank")){
            return new Ebanking();

        } else if(walletType.equalsIgnoreCase("Crypto")){
            return new Crypto();
        }

        return null;
    }
}
