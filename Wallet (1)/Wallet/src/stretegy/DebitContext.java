package stretegy;
import driver.*;
import factory.*;
import singleton.*;



public class DebitContext {
    private DebitStrategy strategy;

    public DebitContext(DebitStrategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(){
        return strategy.debitAmount();
    }
}
