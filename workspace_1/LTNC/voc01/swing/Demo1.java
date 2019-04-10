package swing;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Demo1 extends JFrame implements MouseListener, 
MouseMotionListener 
{  
	JTextField tf; 
	public Demo1(String title) 
	{  
		super(title);
		tf = new JTextField(60); 
		addMouseListener(this); 
		setLayout(new BorderLayout());
		add(tf, BorderLayout.SOUTH);
		setSize(300, 300); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);  
		}    
	public static void main(String[] args) 
	{  
		Demo1 me = new Demo1("Mouse Event Demo");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		String msg = "Mouse clicked";
		tf.setText(msg); 
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		String msg = "Mouse pressed"; 
		tf.setText(msg); 
	}
	@Override
	public void mouseExited(MouseEvent e) {
		String msg = "Mouse exited component";
		tf.setText(msg);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		String msg = "Mouse entered component";
		tf.setText(msg); 
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		String msg = "Mouse released";
		tf.setText(msg);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		String msg = "Mouse dragged at" + e.getX() + ", " + e.getY(); 
		tf.setText(msg); 
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		String msg = "Mouse moved at" + e.getX() + ", " + e.getY();
		tf.setText(msg); 
	} 
}

