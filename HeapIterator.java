//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
import java.util.Stack;
//External Iterator using inorder traversal
public class HeapIterator extends Node {
    Stack<Node> stack;
    //Iterates through the heap using the stack
    public HeapIterator(Node root) {
        stack = new Stack<Node>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
    //Checks if the next element is present
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    //Iterates through the next element for inorder traversal
    public void next() {
        Node node = new Node();
        while (!stack.empty() || node.root != null) {
            if (node.root != null) {
                stack.push(node.root);
                node.root = node.root.left;
            } else {
                node.root = stack.pop();
                System.out.print(node.root.data + " ");
                node.root = node.root.right;
            }
        }
    }
}