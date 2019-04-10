package view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.ControllerInterface;
import controller.Direction;

/**
 * Unit tests using JUnit to test the {@link ViewListener.java User Input Listener} of the game.
 */
public class ViewListenerTest {
    private static FakeController cont;
    private static MyFrame myFrame;
    private static JButton restartBut;
    private static JComboBox<Object> widthBox, heightBox;
    private static HashMap<Integer, String> keyResponse = new HashMap<Integer, String>(13);
    private static boolean inputAllowed;
    private static String expectedResponse;
    private static Object expectedWidth;
    private static Object expectedHeight;
    private static Random rand = new Random();

    @BeforeClass
    public static void beforeClass() {
	keyResponse.put(KeyEvent.VK_UP, String.valueOf(Direction.UP));
	keyResponse.put(KeyEvent.VK_W, String.valueOf(Direction.UP));
	keyResponse.put(KeyEvent.VK_RIGHT, String.valueOf(Direction.RIGHT));
	keyResponse.put(KeyEvent.VK_D, String.valueOf(Direction.RIGHT));
	keyResponse.put(KeyEvent.VK_DOWN, String.valueOf(Direction.DOWN));
	keyResponse.put(KeyEvent.VK_S, String.valueOf(Direction.DOWN));
	keyResponse.put(KeyEvent.VK_LEFT, String.valueOf(Direction.LEFT));
	keyResponse.put(KeyEvent.VK_A, String.valueOf(Direction.LEFT));
	keyResponse.put(KeyEvent.VK_R, "RESTART");
	cont = new FakeController();
	restartBut = new JButton();
	widthBox = new JComboBox<Object>();
	heightBox = new JComboBox<Object>();
	for (int i = 4; i <= 20; i++) {
	    widthBox.addItem(new Integer(i));
	    heightBox.addItem(new Integer(i));
	}
	widthBox.addItem(new String("bad object"));
	heightBox.addItem(new String("bad object"));
	myFrame = new MyFrame(cont);
	expectedWidth = 4;
	expectedHeight = 4;
    }

    @AfterClass
    public static void afterClass() {
	myFrame.dispose();
    }

    @Test
    public void testKeyPressed() {
	for (int modifierCode : new int[] { 0, KeyEvent.SHIFT_DOWN_MASK, KeyEvent.ALT_DOWN_MASK, KeyEvent.CTRL_DOWN_MASK }) {
	    if (modifierCode == 0) inputAllowed = true;
	    else inputAllowed = false;
	    for (Field f : KeyEvent.class.getDeclaredFields()) {
		if (f.getModifiers() != (Modifier.STATIC + Modifier.FINAL + Modifier.PUBLIC)) continue;
		try {
		    Object obj = f.get(new KeyEvent(myFrame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), modifierCode, 0, 'f'));
		    if (!(obj instanceof Integer)) continue;
		    Integer keyCode = (Integer) obj;
		    expectedResponse = keyResponse.get(keyCode);
		    myFrame.doKeyEvent(new KeyEvent(myFrame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), modifierCode, keyCode, 'f'));
		} catch (IllegalArgumentException | IllegalAccessException e) {
		    e.printStackTrace();
		}
	    }
	}
    }

    @Test
    public void mousePressedMovedReleasedTest() {
	Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
	Point press = null, rel = null;
	int hor, vert;
	for (int modifierCodePress : new int[] { 0, KeyEvent.SHIFT_DOWN_MASK, KeyEvent.ALT_DOWN_MASK, KeyEvent.CTRL_DOWN_MASK }) {
	    for (int button : new int[] { MouseEvent.BUTTON1, MouseEvent.BUTTON2, MouseEvent.BUTTON3 }) {
		for (int modifierCodeRelease : new int[] { 0, KeyEvent.SHIFT_DOWN_MASK, KeyEvent.ALT_DOWN_MASK, KeyEvent.CTRL_DOWN_MASK }) {
		    press = new Point(rand.nextInt(scrSize.width + 1), rand.nextInt(scrSize.height + 1));
		    rel = new Point(rand.nextInt(scrSize.width + 1), rand.nextInt(scrSize.height + 1));
		    if (press.distance(rel) > 20 && button == MouseEvent.BUTTON1) {
			inputAllowed = true;
			hor = rel.x - press.x;
			vert = rel.y - press.y;
			if (Math.abs(hor) >= Math.abs(vert)) expectedResponse = String.valueOf(hor > 0 ? Direction.RIGHT : Direction.LEFT);
			else if (Math.abs(hor) < Math.abs(vert)) expectedResponse = String.valueOf(vert > 0 ? Direction.DOWN : Direction.UP);
		    } else {
			inputAllowed = false;
			expectedResponse = null;
		    }
		    myFrame.doMouseEvent(new MouseEvent(myFrame, MouseEvent.MOUSE_PRESSED, System.currentTimeMillis(), modifierCodePress, press.x, press.y, press.x,
			    press.y, 1, false, button));
		    myFrame.doMouseEvent(new MouseEvent(myFrame, MouseEvent.MOUSE_RELEASED, System.currentTimeMillis(), modifierCodeRelease, rel.x, rel.y, rel.x,
			    rel.y, 1, false, button));
		}
	    }
	}
	// run a test to guarantee that the two points will be < 20px apart at least once
	rel = new Point(press.x + 1, press.y + 2);
	inputAllowed = false;
	expectedResponse = null;
	myFrame.doMouseEvent(
		new MouseEvent(myFrame, MouseEvent.MOUSE_PRESSED, System.currentTimeMillis(), 0, press.x, press.y, press.x, press.y, 1, false, MouseEvent.BUTTON1));
	myFrame.doMouseEvent(
		new MouseEvent(myFrame, MouseEvent.MOUSE_RELEASED, System.currentTimeMillis(), 0, rel.x, rel.y, rel.x, rel.y, 1, false, MouseEvent.BUTTON1));
    }

    @Test
    public void testActionPerformed() {
	inputAllowed = true;
	expectedResponse = "restart";
	restartBut.doClick(0);
	restartBut.setActionCommand("bad command");
	inputAllowed = false;
	restartBut.doClick(0);
	restartBut.setActionCommand(null);
	restartBut.doClick(0);
	restartBut.setActionCommand("restart");
	inputAllowed = true;
	restartBut.doClick(0);
    }

    @Test
    public void testItemStateChanged() {
	inputAllowed = true;
	expectedResponse = "restart";
	restartBut.doClick();
	for (int x = 0; x < widthBox.getItemCount(); x++) {
	    widthBox.setSelectedIndex(x);
	    if (widthBox.getItemAt(x) instanceof Integer) expectedWidth = (Integer) widthBox.getItemAt(x);
	    for (int y = 0; y < heightBox.getItemCount(); y++) {
		heightBox.setSelectedIndex(y);
		if (heightBox.getItemAt(y) instanceof Integer) expectedHeight = (Integer) heightBox.getItemAt(y);
		restartBut.doClick(0);
	    }
	}
    }

    @Test
    public void testMouseClicked() {
	testUnusedMouseEvent(MouseEvent.MOUSE_CLICKED);
    }

    @Test
    public void testMouseEntered() {
	testUnusedMouseEvent(MouseEvent.MOUSE_ENTERED);
    }

    @Test
    public void testMouseExited() {
	testUnusedMouseEvent(MouseEvent.MOUSE_EXITED);
    }

    private static void testUnusedMouseEvent(int mouseEvent) {
	assertTrue(mouseEvent == MouseEvent.MOUSE_ENTERED || mouseEvent == MouseEvent.MOUSE_EXITED || mouseEvent == MouseEvent.MOUSE_CLICKED);
	inputAllowed = false;
	expectedResponse = null;
	Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
	Point press;
	for (int modifierCodePress : new int[] { 0, KeyEvent.SHIFT_DOWN_MASK, KeyEvent.ALT_DOWN_MASK, KeyEvent.CTRL_DOWN_MASK }) {
	    for (int button : new int[] { MouseEvent.BUTTON1, MouseEvent.BUTTON2, MouseEvent.BUTTON3 }) {
		press = new Point(rand.nextInt(scrSize.width + 1), rand.nextInt(scrSize.height + 1));
		myFrame.doMouseEvent(
			new MouseEvent(myFrame, mouseEvent, System.currentTimeMillis(), modifierCodePress, press.x, press.y, press.x, press.y, 1, false, button));
	    }
	}
    }

    private static void testResponse(String str, int width, int height) {
	assertTrue(inputAllowed);
	assertTrue((expectedResponse == null && str == null) || expectedResponse.equalsIgnoreCase(str));
	if (str != null && str.equalsIgnoreCase("restart")) {
	    assertEquals(expectedWidth, width);
	    assertEquals(expectedHeight, height);
	}
    }

    static class MyFrame extends JFrame {
	private static final long serialVersionUID = 1460601346622152728L;

	MyFrame(ControllerInterface cont) {
	    super();
	    ViewListener listener = new ViewListener(cont);
	    addKeyListener(listener);
	    addMouseListener(listener);
	    restartBut.addActionListener(listener);
	    restartBut.setActionCommand("restart");
	    widthBox.addItemListener(listener);
	    heightBox.addItemListener(listener);
	    widthBox.setActionCommand("width");
	    heightBox.setActionCommand("height");
	    widthBox.setSelectedIndex(widthBox.getItemCount() - 1);
	    widthBox.setSelectedIndex(0);
	    heightBox.setSelectedIndex(heightBox.getItemCount() - 1);
	    heightBox.setSelectedIndex(0);
	    add(restartBut);
	    add(widthBox);
	    add(heightBox);
	    setVisible(false);
	}

	void doKeyEvent(KeyEvent e) {
	    super.processKeyEvent(e);
	}

	void doMouseEvent(MouseEvent e) {
	    super.processMouseEvent(e);
	}

    }

    private static class FakeController implements ControllerInterface {

	@Override
	public void makeMove(Direction d) {
	    testResponse(String.valueOf(d), 0, 0);
	}

	@Override
	public void restartGame(int newWidth, int newHeight) {
	    testResponse("restart", newWidth, newHeight);
	}

	@Override
	public void endGame() {}

    }

}