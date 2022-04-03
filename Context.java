//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
//Context is used along with Strategy for behavioural changes
public class Context extends Node{
    public Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public Context(){
    }
    //Calls add method and implements minHeap/maxHeap through getRootNodeinHeap method.
    public void executeStrategy(){
        strategy.add(34);
        strategy.add(36);
        strategy.add(30);
        strategy.getRootNodeInHeap();
    }
}