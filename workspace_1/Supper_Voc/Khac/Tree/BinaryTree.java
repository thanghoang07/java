package Tree;

import java.util.LinkedList;

public class BinaryTree implements Tree
{
    public static final String LEFT = "LEFT";
    public static final String RIGHT = "RIGHT";
    private Node root;
 
    public BinaryTree()
    {
    }
 
    public void create(int currentData)
    {
        if (root == null)
        {
            root = new Node();
        }
 
        root.data = currentData;
    }
 
    public void add(Node node, int currentData, String currentPosition)
    {
        if (node == null)
        {
            return;
        }
 
        Node currentNode = new Node();
        currentNode.data = currentData;
 
        if (LEFT.equals(currentPosition))
        {
            node.left = currentNode;
        }
        else if (RIGHT.equals(currentPosition))
        {
            node.right = currentNode;
        }
    }
 
    public Node search(int searchData)
    {
        if (root == null)
        {
            return null;
        }
 
        return search(searchData, root);
    }
 
    private Node search(int searchData, Node node)
    {
        if (node == null)
        {
            return null;
        }
 
        // Level order traversal to return the node
        LinkedList queueList = new LinkedList();
        queueList.add(node);
 
        Node currNode = null;
 
        while (!queueList.isEmpty())
        {
            currNode = (Node) queueList.removeFirst();
 
            if (currNode.data == searchData)
            {
                break;
            }
            else
            {
                if (currNode.left != null)
                {
                    queueList.add(currNode.left);
                }
 
                if (currNode.right != null)
                {
                    queueList.add(currNode.right);
                }
            }
        }
 
        return currNode;
    }
 
    public void printLevelOrder()
    {
        printLevelOrder(root);
        System.out.println();
    }
 
    public void printLevelOrder(Node node)
    {
        if (node == null)
        {
            return;
        }
 
        LinkedList queueList = new LinkedList();
        queueList.add(node);
 
        Node currNode = null;
 
        while (!queueList.isEmpty())
        {
            currNode = (Node) queueList.removeFirst();
            System.out.print(currNode.data + "    ");
 
            if (currNode.left != null)
            {
                queueList.add(currNode.left);
            }
 
            if (currNode.right != null)
            {
                queueList.add(currNode.right);
            }
        }
        System.out.println();
    }
 
    public void printInorder()
    {
        printInorder(root);
        System.out.println();
    }
 
    public void printInorder(Node node)
    {
        if(node == null)
        {
            return;
        }
 
        printInorder(node.left);
        System.out.print(node.data+"    ");
        printInorder(node.right);
    }
 
    public void printPreorder()
    {
        printPreorder(root);
        System.out.println();
    }
 
    public void printPreorder(Node node)
    {
        if(node == null)
        {
            return;
        }
 
        System.out.print(node.data+"    ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
 
    public void printPostorder()
    {
        printPostorder(root);
        System.out.println();
    }
 
    public void printPostorder(Node node)
    {
        if(node == null)
        {
            return;
        }
 
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data+"    ");
    }
 
}

