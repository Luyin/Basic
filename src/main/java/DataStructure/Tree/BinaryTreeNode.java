package DataStructure.Tree;

/**
 * Created by myrao_000 on 2017-02-16.
 */
public class BinaryTreeNode {
    private int intData;
    private BinaryTreeNode nodeLeft = null;
    private BinaryTreeNode nodeRight = null;

    public BinaryTreeNode(int data)
    {
        this.intData = data;
    }

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public BinaryTreeNode getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(BinaryTreeNode nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public BinaryTreeNode getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(BinaryTreeNode nodeRight) {
        this.nodeRight = nodeRight;
    }
}
