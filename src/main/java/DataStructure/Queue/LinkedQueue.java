package DataStructure.Queue;

/**
 * Created by myrao_000 on 2017-02-16.
 */
public class LinkedQueue<T> {
    private Node<T> rootNode;

    public LinkedQueue()
    {
        rootNode = null;
    }

    public void enqueue(T data){
        Node<T> node = rootNode;

        while(node.getNextNode() == null)
        {
            node = node.getNextNode();
        }

        node.setNextNode(new Node<T>(data));
    }

    public T dequeue(){
        Node<T> node = rootNode;
        rootNode = rootNode.getNextNode();
        return node.getData();
    }

    public boolean isEmpty()
    {
        return (rootNode == null);
    }

}
