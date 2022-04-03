//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
class OperationMaxHeapTest extends OperationMaxHeap{
    Node root;
    private Node list;
    private Node left;
    private Node right;
    @Before
    public void intializeList() {
        Node left = new Node(20);
        Node right = new Node(30);
        Node root = new Node(10);
    }
    @Test
    void add() {
        Node node = new Node();
        assertEquals(root, null);
        assertTrue(node.add(20));
        assertEquals(node.size,1);
        assertEquals(node.tail.data, 20);
        assertTrue(node.add(30));
        assertEquals(node.size,2);
        assertEquals(node.tail.data, 30);
        assertTrue(node.add(40));
        assertEquals(node.size,3);
        assertEquals(node.tail.data, 40);
    }

    @Test
    void compare() {
        Node parent = new Node(12);
        Node node = new Node(11);
        assertEquals(node.compare(node), true);
        //Checking if swapping was correctly performed
        assertEquals(parent.data, 12);
        assertEquals(node.data, 11);
    }

    @Test
    void swapNodeDataTest() {
        OperationMaxHeap a = new OperationMaxHeap(11);
        OperationMaxHeap b = new OperationMaxHeap(12);
        assertEquals(swapNodeData(a,b), true);
        assertEquals(a.data, 12);
        assertEquals(b.data, 11);
    }
}