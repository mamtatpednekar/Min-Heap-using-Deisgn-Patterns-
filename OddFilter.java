import java.util.Iterator;

//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174import java.util.Iterator;
//Iterator Class to extract odd integers
public class OddFilter implements Iterator<Node> {
    private Iterator iterator = null;
    private Node node = null;
    protected int val;
    public OddFilter(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }
    public OddFilter() {
    }

    @Override
    //returns true if the iteration has more elements that are odd integers.
    public boolean hasNext() {
        if (node.data != 0) {
            node = next();
            if (node == null)
                return false;
            else
                return true;
        } else {
            return true;
        }
    }

    @Override
    //returns the next element in the iteration that is an odd integer.
    public Node next() {
        if (node.data != 0) {
            Node s = node;
            node = getOddNumber();
            return s;
        } else {
            node = getOddNumber();
            return node;
        }
    }

    public Node getOddNumber() {
        while (iterator.hasNext()) {
            val = (int) iterator.next();
            if (val % 2 != 0) {
                return node;
            }
        }
        return null;
    }
    //for testing purpose
    protected Node getOddNumberTesting() {
        val = 2;
        if (val % 2 != 0) {
            return node;
        }
        return null;
    }

}
