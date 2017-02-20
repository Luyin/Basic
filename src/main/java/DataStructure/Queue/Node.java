package DataStructure.Queue;

/**
 * Created by myrao_000 on 2017-02-16.
 */
public class Node<T> {
    private T data;
    private Node nextNode;
    private Node beforeNode;

    public Node(T data)
    {
        this.data = data;
        nextNode = null;
        beforeNode = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
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
