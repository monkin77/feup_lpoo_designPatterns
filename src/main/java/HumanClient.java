public class HumanClient implements Client{
    OrderingStrategy strategy;

    public HumanClient(OrderingStrategy strategy){
        this.strategy = strategy;
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        this.strategy.wants(drink, recipe, bar);
    };

    public void happyHourStarted(Bar bar){
        if(bar instanceof StringBar)
            this.strategy.happyHourStarted((StringBar) bar);
    };
    public void happyHourEnded(Bar bar){
        if(bar instanceof StringBar)
            this.strategy.happyHourEnded((StringBar) bar);
    };
}
