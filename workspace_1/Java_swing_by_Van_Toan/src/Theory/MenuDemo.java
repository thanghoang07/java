package Theory;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MenuDemo extends JFrame {
	public MenuDemo(String title) {
		super(title);

		// Creating Menu Bar
		JMenuBar jmb = new JMenuBar();
		this.setJMenuBar(jmb);

		// Creating Menus
		JMenu fileMenu = new JMenu("File");
		JMenu helpMenu = new JMenu("Help");
		jmb.add(fileMenu);
		jmb.add(helpMenu);

		// Creating menu items
		fileMenu.add(new JMenuItem("New"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Print"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Exit"));

		// Creating subMenu items
		JMenu softwareHelpSubMenu = new JMenu("Software");
		JMenu hardwareHelpSubMenu = new JMenu("Hardware");
		helpMenu.add(softwareHelpSubMenu);
		helpMenu.add(hardwareHelpSubMenu);
		softwareHelpSubMenu.add(new JMenuItem("Unix"));
		softwareHelpSubMenu.add(new JMenuItem("NT"));
		softwareHelpSubMenu.add(new JMenuItem("Win95"));

		// Creating check-box menu items
		helpMenu.add(new JCheckBoxMenuItem("Check it"));

		// Creating radio-button menu items
		JMenu colorHelpSububMenu = new JMenu("Color");
		helpMenu.add(colorHelpSububMenu);
		JRadioButtonMenuItem jrmiBlue, jrmiYellow, jrmiRed;
		colorHelpSububMenu.add(jrmiBlue = new JRadioButtonMenuItem("Blue"));
		colorHelpSububMenu.add(jrmiYellow = new JRadioButtonMenuItem("Yellow"));
		colorHelpSububMenu.add(jrmiRed = new JRadioButtonMenuItem("Red"));
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrmiBlue);
		btg.add(jrmiYellow);
		btg.add(jrmiRed);

		// Creating Image Icons, Mnemonics, Accelerators
		JMenuItem jmiNew, jmiOpen;
		fileMenu.add(jmiNew = new JMenuItem("New"));
		fileMenu.add(jmiOpen = new JMenuItem("Open"));
		jmiNew.setIcon(new ImageIcon("img/button_new.gif"));
		jmiOpen.setIcon(new ImageIcon("img/button_open.gif"));

		// Creating Mnemoic
		helpMenu.setMnemonic('H');
		fileMenu.setMnemonic('F');
		jmiNew.setMnemonic('N');
		jmiOpen.setMnemonic('O');

		// Creating accelerators
		jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,
				ActionEvent.CTRL_MASK));
		
		setVisible(true);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MenuDemo("Menu Demo");
	}
}
