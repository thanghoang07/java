package book;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RBTreeView extends JPanel {
  private BST<Integer> tree; // A binary tree to be displayed
  private JTextField jtfKey = new JTextField(5);
  private PaintTree paintTree = new PaintTree(); 
  private JButton jbtSearch = new JButton("Search");
  private JButton jbtInsert = new JButton("Insert");
  private JButton jbtDelete = new JButton("Delete");
  
  /** Construct a view for a binary tree */
  public RBTreeView(BST<Integer> tree) {   
    this.tree = tree; // Set a binary tree to be displayed
    setUI();
  }
  
  /** Initialize UI for binary tree */
  private void setUI() {
    this.setLayout(new BorderLayout()); 
    add(paintTree, BorderLayout.CENTER);    
    JPanel panel = new JPanel();
    panel.add(new JLabel("Enter a key: "));
    panel.add(jtfKey);
    panel.add(jbtSearch);
    panel.add(jbtInsert);
    panel.add(jbtDelete);
    add(panel, BorderLayout.SOUTH);
    
    // Listener for the Search button
    jbtSearch.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int key = Integer.parseInt(jtfKey.getText());
        if (!tree.search(key)) {
          JOptionPane.showMessageDialog(null, key + " is not in the tree");
        }
        else {
          JOptionPane.showMessageDialog(null, key + " is in the tree");
        }
      }
    });
    
    // Listener for the Insert button
    jbtInsert.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {        
        if (!jtfKey.getText().matches("([1-9][0-9]{0,1}|\\+[1-9][0-9]{0,1})")) {
          JOptionPane.showMessageDialog(null, 
            "Key must be a positive integer < 100");
          return;          
        }
        
        int key = Integer.parseInt(jtfKey.getText());
        if (tree.search(key)) { // key is in the tree already
          JOptionPane.showMessageDialog(null, 
            key + " is already in the tree");
        }
        else {
          tree.insert(key); // Insert a new key
          paintTree.repaint(); // Redisplay the tree
        }
      }
    });
    
    // Listener for the Delete button
    jbtDelete.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (!jtfKey.getText().matches("([1-9][0-9]{0,1}|\\+[1-9][0-9]{0,1})")) {
          JOptionPane.showMessageDialog(null, 
            "Key must be a positive integer < 100");
          return;          
        }
        
        int key = Integer.parseInt(jtfKey.getText());
        if (!tree.search(key)) { // key is not in the tree
          JOptionPane.showMessageDialog(null, 
            key + " is not in the tree");
        }
        else {
          tree.delete(key); // Delete a key
          paintTree.repaint(); // Redisplay the tree
        }
      }
    });
  }
  
  // Inner class PaintTree for displaying a tree on a panel
  class PaintTree extends JPanel {   
    private int radius = 20; // Tree node radius
    private int vGap = 50; // Gap between two levels in a tree
        
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      if (tree.getRoot() != null) {
        // Display tree recursively    
        displayTree(g, tree.getRoot(), getWidth() / 2, 30, 
          getWidth() / 4); 
      }
    }
        
    /** Display a subtree rooted at position (x, y) */
    private void displayTree(Graphics g, BST.TreeNode root, 
        int x, int y, int hGap) {
      // Display the root
      if (((RBTree.RBTreeNode<Integer>)root).isRed()) {
        g.setColor(Color.RED);
      }
      else {
        g.setColor(Color.BLACK);        
      }      
      g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);

      g.setColor(Color.WHITE);              
      g.drawString(root.element + "", x - 6, y + 4);

      g.setColor(Color.BLACK);                    
      if (root.left != null) {
        // Draw a line to the left node
        connectLeftChild(g, x - hGap, y + vGap, x, y);
        // Draw the left subtree recursively
        displayTree(g, root.left, x - hGap, y + vGap, hGap / 2);
      }
          
      if (root.right != null) {
        // Draw a line to the right node
        connectRightChild(g, x + hGap, y + vGap, x, y);
        // Draw the right subtree recursively
        displayTree(g, root.right, x + hGap, y + vGap, hGap / 2);  
      }
    }
        
    /** Connect a parent at (x2, y2) with 
     * its left child at (x1, y1) */
    private void connectLeftChild(Graphics g, 
        int x1, int y1, int x2, int y2) { 
      double d = Math.sqrt(vGap * vGap + (x2 - x1) * (x2 - x1));
      int x11 = (int)(x1 + radius * (x2 - x1) / d);
      int y11 = (int)(y1 - radius * vGap / d);
      int x21 = (int)(x2 - radius * (x2 - x1) / d);
      int y21 = (int)(y2 + radius * vGap / d);
      g.drawLine(x11, y11, x21, y21);
    }
        
    /** Connect a parent at (x2, y2) with 
     * its right child at (x1, y1) */
    private void connectRightChild(Graphics g, 
        int x1, int y1, int x2, int y2) {
      double d = Math.sqrt(vGap * vGap + (x2 - x1) * (x2 - x1));
      int x11 = (int)(x1 - radius * (x1 - x2) / d);
      int y11 = (int)(y1 - radius * vGap / d);
      int x21 = (int)(x2 + radius * (x1 - x2) / d);
      int y21 = (int)(y2 + radius * vGap / d);
      g.drawLine(x11, y11, x21, y21);
    }
  }
}