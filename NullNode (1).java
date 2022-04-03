//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
interface NullCheckStrategy{
    public boolean add(Node node, int data);
    public int maxDepth(Node node);
}
//Method for Null Checks
public class NullNode extends Node {
    NullNode()
    {
        this.data = -1;
    }

    public Node nullcheck(Node node)
    {
        if(node == null) {
            return new NullNode();
        }
        return node;

    }
}
