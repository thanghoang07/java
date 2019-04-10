package khac;

import java.awt.*;
import java.awt.event.*;

public class MouseTracker extends Frame implements MouseListener, MouseMotionListener {
	private Label statusBar;

	// set up GUI and register mouse event handlers
	public MouseTracker() {
		super("Demonstrating Mouse Events");
		statusBar = new Label();
		this.add(statusBar, BorderLayout.SOUTH);
		// application listens to its own mouse events
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(275, 100);
		setVisible(true);
	}

	// MouseListener event handlers
	// handle event when mouse released immediately
	// after press
	public void mouseClicked(MouseEvent event) {
		statusBar.setText("Clicked at [" + event.getX() + ", " + event.getY() + "]");
	}

	// handle event when mouse pressed
	public void mousePressed(MouseEvent event) {
		statusBar.setText("Pressed at [" + event.getX() + ", " + event.getY() + "]");
	}

	// handle event when mouse released after dragging
	public void mouseReleased(MouseEvent event) {
		statusBar.setText("Released at [" + event.getX() + ", " + event.getY() + "]");
	}

	// handle event when mouse enters area
	public void mouseEntered(MouseEvent event) {
		statusBar.setText("Mouse in window");
	}

	// handle event when mouse exits area
	public void mouseExited(MouseEvent event) {
		statusBar.setText("Mouse outside window");
	}

	// MouseMotionListener event handlers
	// handle event when user drags mouse with button pressed
	public void mouseDragged(MouseEvent event) {
		statusBar.setText("Dragged at [" + event.getX() + ", " + event.getY() + "]");
	}

	// handle event when user moves mouse
	public void mouseMoved(MouseEvent event) {
		statusBar.setText("Moved at [" + event.getX() + ", " + event.getY() + "]");
	}

	// execute application
	public static void main(String args[]) {
		MouseTracker application = new MouseTracker();
	}
} // end class MouseTracker