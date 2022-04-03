//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
//Using the Context to see change in behaviour when it changes its Strategy.
public class StrategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new Node());
        context.executeStrategy();

        context = new Context(new OperationMaxHeap());
        context.executeStrategy();
           }
}