package DataStructure.Tree;

import DataStructure.Queue.ArrayQueue;
import javafx.scene.SubScene;

import javax.sound.midi.SysexMessage;

/**
 * Created by myrao_000 on 2017-02-16.
 */
public class BinarySearchTree {
    private BinaryTreeNode rootNode;

    public BinarySearchTree()
    {
        rootNode = null;
    }

    public void addNode(int data)
    {
        if(rootNode == null)
        {
            rootNode = new BinaryTreeNode(data);
        }
        else
        {
            BinaryTreeNode node = rootNode;

            while(true) {
                if (data > node.getIntData()) {
                    if(node.getNodeRight() == null)
                    {
                        node.setNodeRight( new BinaryTreeNode(data));
                        break;
                    }
                    else
                    {
                        node = node.getNodeRight();
                    }
                } else if (data < node.getIntData()) {
                    if(node.getNodeLeft() == null)
                    {
                        node.setNodeLeft( new BinaryTreeNode(data));
                        break;
                    }
                    else
                    {
                        node = node.getNodeLeft();
                    }
                }
            }

        }
    }

    //삭제가 가장 어렵다.
    public void removeNode(int data)
    {
        BinaryTreeNode childNode = rootNode;
        BinaryTreeNode parentNode = rootNode;

        while(childNode != null && childNode.getIntData() != data )
        {
            parentNode = childNode;
            if(data > childNode.getIntData())
            {
                childNode = childNode.getNodeRight();
            }
            else if (data < childNode.getIntData())
            {
                childNode = childNode.getNodeLeft();
            }
        }

        if(childNode.getNodeLeft() == null && childNode.getNodeRight() == null)
        {
            if(parentNode.getNodeLeft().getIntData() == data)
            {
                parentNode.setNodeLeft(null);
            }
            else if(parentNode.getNodeRight().getIntData() == data)
            {
                parentNode.setNodeRight(null);
            }
        }
        else if(childNode.getNodeLeft() == null && childNode.getNodeRight() != null)
        {
            if(parentNode.getNodeLeft().getIntData() == data)
            {
                parentNode.setNodeLeft(childNode.getNodeRight());
            }
            else if(parentNode.getNodeRight().getIntData() == data)
            {
                parentNode.setNodeRight(childNode.getNodeRight());
            }
        }
        else if(childNode.getNodeLeft() != null && childNode.getNodeRight() == null)
        {
            if(parentNode.getNodeLeft().getIntData() == data)
            {
                parentNode.setNodeLeft(childNode.getNodeLeft());
            }
            else if(parentNode.getNodeRight().getIntData() == data)
            {
                parentNode.setNodeRight(childNode.getNodeLeft());
            }
        }
        else if(childNode.getNodeLeft() != null && childNode.getNodeRight() != null)
        {
            BinaryTreeNode minNode = childNode;
            BinaryTreeNode minNodeParent = childNode;
            while((minNode = minNode.getNodeLeft()) != null)
            {
                if(minNode.getNodeLeft() == null)
                {
                    break;
                }
                minNodeParent = minNode;
            }

            BinaryTreeNode minNodeOfRightChild = minNode.getNodeRight();

            childNode.setIntData(minNode.getIntData());
            minNodeParent.setNodeLeft(null);

            if(minNodeOfRightChild != null)
            {
                minNode.setIntData(minNodeOfRightChild.getIntData());
                minNode.setNodeRight(null);
            }
        }
    }

    public void printAllTreeByPreOrder()
    {
        printTreeByPreOrder(rootNode);
    }

    public void printAllTreeByInOrder()
    {
        printTreeByInOrder(rootNode);
    }

    public void printAllTreeByPostOrder()
    {
        printTreeByPostOrder(rootNode);
    }

    private void printTreeByPreOrder(BinaryTreeNode node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            System.out.print(node.getIntData() + " ");

            printTreeByPreOrder(node.getNodeLeft());

            printTreeByPreOrder(node.getNodeRight());
        }
    }

    private void printTreeByInOrder(BinaryTreeNode node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            printTreeByInOrder(node.getNodeLeft());

            System.out.print(node.getIntData() + " ");

            printTreeByInOrder(node.getNodeRight());
        }
    }

    private void printTreeByPostOrder(BinaryTreeNode node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            printTreeByPostOrder(node.getNodeLeft());
            printTreeByPostOrder(node.getNodeRight());
            System.out.print(node.getIntData() + " ");
        }
    }

    //BFS Algorithm
    public void printAllTreeByLevel()
    {
        ArrayQueue<BinaryTreeNode> queue = new ArrayQueue<BinaryTreeNode>();
        queue.enqueue(rootNode);

        while(!queue.isEmpty())
        {
            BinaryTreeNode node = queue.dequeue();
            System.out.print(node.getIntData() + " ");

            if(node.getNodeLeft() != null)
            {
                queue.enqueue(node.getNodeLeft());
            }

            if(node.getNodeRight() != null)
            {
                queue.enqueue(node.getNodeRight());
            }
        }
    }
}
