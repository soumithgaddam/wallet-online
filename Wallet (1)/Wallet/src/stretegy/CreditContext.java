package stretegy;
import driver.*;
import factory.*;
import singleton.*;



public class CreditContext {
    private CreditStrategy strategy;

    public CreditContext(CreditStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(){
        return strategy.creditAmount();
    }
}
