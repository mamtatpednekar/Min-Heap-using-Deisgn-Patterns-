//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class NullNodeTest {
    NullNode nullnode= new NullNode();
    @Test
    void nullcheckTest() {
        //Test for null node check
        Node node = new Node(-1);
        assertEquals(node,nullnode.nullcheck(node));
        //Test for actual node check
        Node node1 = new Node(10);
        assertEquals(node1,nullnode.nullcheck(node1));
        }
    }
