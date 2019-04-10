package book;

import javax.swing.*;

public class DisplayBinaryTree extends JApplet {
  public DisplayBinaryTree() {
    add(new TreeControl(new BST<Integer>()));
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("DisplayBinaryTree");
    JApplet applet = new DisplayBinaryTree();
    frame.add(applet);
    frame.setSize(500, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}