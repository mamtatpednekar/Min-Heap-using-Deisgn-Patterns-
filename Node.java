//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
import java.util.ArrayList;

public class Node implements Strategy{
    public Node root;
    protected Node tail;
    protected int size;
    public Node left;
    public Node right;
    private Node parent;
    private Node previous;
    public  int data;
    ArrayList<Integer> postoderList = new ArrayList<Integer>();
    ArrayList<Integer> preoderList = new ArrayList<Integer>();
    ArrayList<Integer> dataAdded = new ArrayList<Integer>();

    Node(int data)
    {
        this.data = data;
    }

    public Node() {
    }

    public int isNull()
    {
        return 1;
    }
    //Find the height of the subtree
    public int maxDepth(Node node){
        NullNode nullnode = new NullNode();
        if(nullnode.nullcheck(node)==node) {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            if (lDepth > rDepth)
                return(lDepth);
            else return(rDepth);
        }
        else return isNull();
    }
    //Method to represent heap element as a string
    public String toString(int data) {
        if (root == null) return "";
        return root.toString();
    }
    //Method for array representation of heap elements
    public Object[] toArray() {
        Object[] arr = dataAdded.toArray();
        return arr;
    }
    //Identifying the tail elements in a heap
    private void setTail(Node node){
        NullNode nullnode = new NullNode();
        if (nullnode.nullcheck(node.parent) != node) {
            tail = node;
            while (nullnode.nullcheck(tail.left) != nullnode) {
                tail = tail.left;
            }
        } else if (nullnode.nullcheck(node.parent.left) == node) {
            tail = node.parent.right;
            while (nullnode.nullcheck(tail.left) == node) {
                tail = tail.left;
            }
        } else if (nullnode.nullcheck(node.parent.right) == node) {
            setTail(node.parent);
        }
    }

    @Override
    public void getRootNodeInHeap() {
        System.out.println(root.data);
    }

    public boolean add(int data) {
        Node node = new Node();
        dataAdded.add(data);
        NullNode nullnode = new NullNode();
        //setting left and right depths to 0.
        int left_depth = 0;
        int right_depth = 0;
        if(root != null) {
            left_depth = node.maxDepth(root.left);
            right_depth = node.maxDepth(root.right);
        }
        if (nullnode.nullcheck(root) != node) {
            root = new Node(data);
            tail = root;
        }
        //If tail.left is null, new node is inserted at that position.
        else if(nullnode.nullcheck(tail.left) != node) {
            tail.left = new Node(data);
            tail.left.parent = tail;
            compare(tail.left);
        }
        else {
            //If tail.right is null, new node is inserted at that position.
            tail.right = new Node(data);
            tail.right.parent = tail;
            compare(tail.right);
            Node previous = tail;
            setTail(tail);
            tail.previous = previous;
        }//counter for size of nodes is incremented
        size++;
        System.out.println("The node" +" "+data+" " + "is added");
        return true;
    }

    protected void Postorder(Node node)
    {
        NullNode nullnode = new NullNode();
        if (nullnode.nullcheck(node) != node)
            return;
        Postorder(node.left);
        Postorder(node.right);
        postoderList.add(node.data);
    }
    //Internal Iterator returning the odd data elements
    protected void InternalIterator(Node node) {
        NullNode nullnode = new NullNode();
        ArrayList<Integer> values = new ArrayList();
        values = dataAdded;
        java.util.Iterator<Integer> itr = values.iterator();
        if (nullnode.nullcheck(node) != node){
            return;
        }
        while(itr.hasNext()) {
            int element = itr.next();
            if(element % 2 != 0){
                preoderList.add(node.data);
            }
        }
    }

    private boolean swapNodeData(Node a, Node b){
        int tempA = a.data;
        int tempB = b.data;
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
        if ((a.data == tempB) && (b.data == tempA)){
            return true;
        }
        else{return false;}
    }
    //Methods to compare data elements in minHeap order
    protected boolean compare(Node node) {
        NullNode nullnode = new NullNode();
        if (nullnode.nullcheck(node.parent) == node) {
            if (node.parent.data > node.data) {
                swapNodeData(node.parent, node);
                compare(node.parent);
            }
        }
        return true;
    }
}