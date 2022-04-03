//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class NodeTest {
    Node node;
    Node root;
    private Node list;
    private Node left;
    private Node right;

    @org.junit.jupiter.api.Test
    void maxDepth1()
    {
        Node node = new Node(10);
        assertEquals(node.maxDepth(node), 1);
    }

    @org.junit.jupiter.api.Test
    void ToStringTest(){
        Node root = new Node(10);
        String expected = root.toString();
        assertEquals(expected,root.toString());
    }

    @org.junit.jupiter.api.Test
    void toArrayTest() {
        ArrayList<Integer> dataAdded = new ArrayList<Integer>();
        dataAdded.add(5);
        dataAdded.add(7);
        dataAdded.add(10);
        Object[] output = dataAdded.toArray();
        assertArrayEquals(output, dataAdded.toArray());
    }

    @org.junit.jupiter.api.Test
    void addTest() {
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

    @org.junit.jupiter.api.Test
    void compareTest() {
        Node parent = new Node(11);
        Node node = new Node(12);
        assertEquals(node.compare(node), true);
        assertEquals(parent.data, 11);
        assertEquals(node.data, 12);
    }
}