//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
//MaxHeap Algorithm
public class OperationMaxHeap implements Strategy {
    protected OperationMaxHeap root;
    private OperationMaxHeap tail;
    private int size;
    public int data;
    private OperationMaxHeap left;
    private OperationMaxHeap right;
    private OperationMaxHeap parent;
    private OperationMaxHeap previous;
    private OperationMaxHeap prevTail;

    OperationMaxHeap(int data) {
        this.data = data;
    }

    OperationMaxHeap() {
    }

    @Override
    public void getRootNodeInHeap() {
        System.out.println(root.data);
    }

    @Override
    public boolean add(int data) {
        OperationMaxHeap maxheap = new OperationMaxHeap(data);
        if (root == null) {
            root = new OperationMaxHeap(data);
            tail = root;
        } else if (tail.left == null) {
            tail.left = new OperationMaxHeap(data);
            tail.left.parent = tail;
            compare(tail.left);
        } else {
            tail.right = new OperationMaxHeap(data);
            tail.right.parent = tail;
            compare(tail.right);
            OperationMaxHeap prevTail = tail;
            setTail(tail);
            tail.prevTail = prevTail;
        }
        size++;
        System.out.println("The node" + " " + data + " " + "is added");
        return true;
    }

    //Methods to compare data elements in maxHeap order
    public boolean compare(OperationMaxHeap maxheap) {
        if (maxheap.parent != null) {
            if (maxheap.parent.data < maxheap.data) {
                if (swapNodeData(maxheap.parent, maxheap))
                    compare(maxheap);
            }
        }
        return true;
    }

    public boolean swapNodeData(OperationMaxHeap a, OperationMaxHeap b) {
        int tempA = a.data;
        int tempB = b.data;
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
        if ((a.data == tempB) && (b.data == tempA)) {
            return true;
        } else {
            return false;
        }
    }

    public void setTail(OperationMaxHeap tail2) {
        if (tail2.parent == null) {
            tail = tail2;
            while (tail.left != null) {
                tail = tail.left;
            }
        } else if (tail2.parent.left == tail2) {
            tail = tail2.parent.right;
            while (tail.left != null) {
                tail = tail.left;
            }
        } else if (tail2.parent.right == tail2) {
            setTail(tail2.parent);
        }

    }
}