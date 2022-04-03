//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
import java.util.Iterator;
//The OddHeapdecorator modifies the toString, toArray and iterator methods to return just odd integers.
public class OddHeapDecorator extends Node {
    public OddHeapDecorator(Node node) {
        super();
    }
    public Iterator<Node> iterator() {
        Node node;
        Iterator<Node> iterator = new OddFilter();
        return iterator;
    }

    @Override
    public String toString() {
        Iterator iterator = iterator();
        String str = "[";
        while (iterator.hasNext()) {
            String item = iterator.next().toString();
            if (iterator.hasNext())
                str = str + item.toString() + ", ";
            else
                str = str + item.toString();

        }
        str = str + "]";
        return str;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        Object[] node = new Object[getSize()];
        Iterator<Node> iterator = iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            node[counter] = iterator.next();
            counter++;
        }
        return node;
    }

    private int getSize() {
        Iterator<Node> iterator = iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
        }
        return counter;
    }

}
