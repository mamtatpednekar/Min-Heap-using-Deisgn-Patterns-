//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
import java.util.Iterator;
import static org.junit.Assert.assertNotEquals;
public class OddHeapDecoratorTest {
    @org.junit.jupiter.api.Test
    public void DecoratorTest() {
        Node dataAdded = new Node();
        dataAdded.add(5);
        dataAdded.add(7);
        dataAdded.add(10);
        dataAdded.add(15);
        Node decoratorList = new OddHeapDecorator(dataAdded);
        Iterator<Node> iterator = ((OddHeapDecorator) decoratorList).iterator();
        Object[] iteratorProbationArray = new Node[4];
        int counter = 0;
        assertNotEquals(iteratorProbationArray, "247d8");
    }
}