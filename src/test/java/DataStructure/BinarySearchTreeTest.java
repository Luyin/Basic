package DataStructure;

import DataStructure.Tree.BinarySearchTree;
import DataStructure.Tree.BinaryTreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by myrao_000 on 2017-02-16.
 */
public class BinarySearchTreeTest {
    private BinarySearchTree BST = new BinarySearchTree();
    @Before
    public void init()
    {
        BST.addNode(5);
        BST.addNode(1);
        BST.addNode(9);
        BST.addNode(8);
        BST.addNode(10);
    }

    @Test
    public void removeTest()
    {
        BST.removeNode(9);
    }

    @Test
    public void LevelTraversalTest()
    {
        BST.printAllTreeByLevel();
        System.out.println();
    }

    @Test
    public void preOrderTraversalTest() {
        BST.printAllTreeByPreOrder();
        System.out.println();
    }

    @Test
    public void postOrderTraversalTest() {
        BST.printAllTreeByPostOrder();
        System.out.println();
    }

    @Test
    public void inOrderTraversalTest() {
        BST.printAllTreeByInOrder();
        System.out.println();
    }
}
