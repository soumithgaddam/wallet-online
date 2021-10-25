package driver;
import factory.*;
import singleton.*;
import stretegy.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
public class JunitTesting
{
    @Test
    public void factoryPatternTest()
    {
        WalletFactory walletFactory=new WalletFactory();

        Wallet mobileWallet=walletFactory.getWallet("Mobile");

        boolean result;
        if(mobileWallet instanceof MobileWallet)
            result=true;
        else
            result=false;

        assertEquals(result,true);

    }

}
