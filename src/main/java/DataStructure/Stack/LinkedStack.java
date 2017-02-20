package DataStructure.Stack;

import java.util.EmptyStackException;

/**
 * Created by myrao_000 on 2017-02-15.
 */
public class LinkedStack {
    private Node rootNode;

    public LinkedStack()
    {
        rootNode = null;
    }

    public void push(int data)
    {
        if(rootNode == null)
        {
            rootNode = new Node(data);
        }
        else
        {
            Node tempNode = rootNode;

            while(tempNode.getNextNode() != null)
            {
                tempNode = tempNode.getNextNode();
            }

            tempNode.setNextNode(new Node(data));
        }
    }

    public int pop()
    {
        if(rootNode == null)
        {
            throw new EmptyStackException();
        }
        else
        {
            Node tempNode = rootNode;

            while(tempNode.getNextNode() != null)
            {
                // Next Node is Last Node
                if(tempNode.getNextNode().getNextNode() == null)
                {
                    int data = tempNode.getNextNode().getData();
                    tempNode.setNextNode(null);

                    return data;
                }

                tempNode = tempNode.getNextNode();
            }

            //rootNode is LastNode
            int data = rootNode.getData();
            rootNode = null;
            return data;
        }
    }

    public boolean isEmpty()
    {
        return (rootNode == null);
    }
}
