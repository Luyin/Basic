package DataStructure.List;

import DataStructure.Stack.Node;

/**
 * Created by myrao_000 on 2017-02-15.
 */
public class LinkedList {
    private Node rootNode;

    public LinkedList()
    {
        rootNode = null;
    }

    public void append(int data)
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

    //index-1 번째 위치에 데이터를 덮어쓰기
    public void append(int index, int data) {
        Node tempNode = rootNode;

        for(int i=0; i<index; i++)
        {
            tempNode = tempNode.getNextNode();

            if(tempNode == null)
                throw new IndexOutOfBoundsException();
        }

        tempNode.setData(data);
    }

    //전제조건: 중복데이터가 없다.
    public int remove(int data) {
        Node tempNode = rootNode;

        while(tempNode.getData() != data)
        {
            tempNode = tempNode.getNextNode();

            if(tempNode == null)
            {
                //데이터가 없다.
                return -1;
                //throw new
            }
        }

        tempNode = tempNode.getNextNode();

        return tempNode.getData();
    }

    public boolean exist(int data) {
        Node tempNode = rootNode;

        while(tempNode.getData() != data)
        {
            tempNode = tempNode.getNextNode();

            if(tempNode == null)
            {
                return false;
            }
        }

        return true;
    }

    public int remove()
    {
        System.out.println("remove");
        return 0;
    }

    public int size()
    {
        System.out.println("size");
        return 0;
    }
}
