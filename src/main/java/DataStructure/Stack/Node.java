package DataStructure.Stack;

/**
 * Created by myrao_000 on 2017-02-15.
 */
public class Node {
    private int data;

    private Node nextNode;
    private Node beforeNode;

    public Node(int data)
    {
        this.data = data;
        nextNode = null;
        beforeNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getBeforeNode() {
        return beforeNode;
    }

    public void setBeforeNode(Node beforeNode) {
        this.beforeNode = beforeNode;
    }
}
