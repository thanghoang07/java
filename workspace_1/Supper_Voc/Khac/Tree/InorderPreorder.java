package Tree;

import java.util.ArrayList;
import java.util.List;

 
public class InorderPreorder
{
    public InorderPreorder()
    {
    }
 
    public Node constructBinaryTree(List preOrder, List inOrder)
    {
        Node node = null;
        List leftPreOrder;
        List rightPreOrder;
        List leftInorder;
        List rightInorder;
        int inorderPos;
        int preorderPos;
 
        if ((preOrder.size() != 0) && (inOrder.size() != 0))
        {
            //  Assign the first element of preorder traversal as root
            node = new Node();
            node.data = ((String) preOrder.get(0)).charAt(0);
 
            //  Based upon the current node data seperate the traversals into leftPreorder, rightPreorder,
            //  leftInorder, rightInorder lists
            inorderPos = inOrder.indexOf(preOrder.get(0));
            leftInorder = inOrder.subList(0, inorderPos);
            rightInorder = inOrder.subList(inorderPos + 1, inOrder.size());
 
            preorderPos = leftInorder.size();
            leftPreOrder = preOrder.subList(1, preorderPos + 1);
            rightPreOrder = preOrder.subList(preorderPos + 1, preOrder.size());
 
            node.left = constructBinaryTree(leftPreOrder, leftInorder);
            node.right = constructBinaryTree(rightPreOrder, rightInorder);
        }
 
        return node;
    }
 
    public static void main(String[] args)
    {
        ArrayList preOrder = new ArrayList();
       /* preOrder.add(new Integer(1));
        preOrder.add(new Integer(2));
        preOrder.add(new Integer(4));
        preOrder.add(new Integer(8));
        preOrder.add(new Integer(9));
        preOrder.add(new Integer(10));
        preOrder.add(new Integer(11));
        preOrder.add(new Integer(5));
        preOrder.add(new Integer(3));
        preOrder.add(new Integer(6));
        preOrder.add(new Integer(7));*/
        preOrder.add(new String("A"));
        preOrder.add(new String("B"));
        preOrder.add(new String("C"));
        preOrder.add(new String("D"));
        preOrder.add(new String("E"));
        preOrder.add(new String("F"));
        preOrder.add(new String("G"));
        preOrder.add(new String("H"));
        preOrder.add(new String("I"));
        preOrder.add(new String("J"));
        preOrder.add(new String("K"));
        preOrder.add(new String("L"));
        preOrder.add(new String("M"));
        ArrayList inOrder = new ArrayList();
        /*inOrder.add(new Integer(8));
        inOrder.add(new Integer(4));
        inOrder.add(new Integer(10));
        inOrder.add(new Integer(9));
        inOrder.add(new Integer(11));
        inOrder.add(new Integer(2));
        inOrder.add(new Integer(5));
        inOrder.add(new Integer(1));
        inOrder.add(new Integer(6));
        inOrder.add(new Integer(3));
        inOrder.add(new Integer(7));*/
        inOrder.add(new String("C"));
        inOrder.add(new String("E"));
        inOrder.add(new String("D"));
        inOrder.add(new String("F"));
        inOrder.add(new String("B"));
        inOrder.add(new String("A"));
        inOrder.add(new String("H"));
        inOrder.add(new String("J"));
        inOrder.add(new String("I"));
        inOrder.add(new String("K"));
        inOrder.add(new String("G"));
        inOrder.add(new String("M"));
        inOrder.add(new String("L"));
        /*
        Constructs following tree
                        1
                    2         3
                4       5  6     7
            8       9
                 10     11
                                                        */
        InorderPreorder inPreTree = new InorderPreorder();
        Node node = inPreTree.constructBinaryTree(preOrder, inOrder);
 
        //  For Testing
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("\n Inorder Traversal of constructed tree is ");
        binaryTree.printInorder(node);
        System.out.println("\n Preorder Traversal of constructed tree is ");
        binaryTree.printPreorder(node);
        System.out.println("\n Levelorder Traversal of constructed tree is ");
        binaryTree.printLevelOrder(node);
    }
}
