package notePad;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.MessageFormat;
import java.util.Scanner;
import javax.swing.*;

public class MySimpleNotepad extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenuBar jMenubar;
	private JMenu mFile, mEdit, mHelp;
	private JMenuItem itemNew, itemOpen, itemSave, itemPrint, itemExit, itemCut, itemCopy, itemPaste, itemAbout;
	private JTextPane jtxContent;
	private JLabel lblStatusBar;

	public MySimpleNotepad() {
		super("Simple Notepad");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		createGUI();
		createMenu();
	}

	void createGUI() {
		jtxContent = new JTextPane();
		this.add(new JScrollPane(jtxContent), BorderLayout.CENTER);
		lblStatusBar = new JLabel("Ready … ");
		// lblStatusBar = new JLabel();
		this.add(lblStatusBar, BorderLayout.SOUTH);
	}

	void createMenu() {
		jMenubar = new JMenuBar();
		this.setJMenuBar(jMenubar);
		jMenubar.add(mFile = new JMenu("File"));
		jMenubar.add(mEdit = new JMenu("Edit"));
		jMenubar.add(mHelp = new JMenu("Help"));
		// file
		// new
		mFile.add(itemNew = new JMenuItem("Tập tin mới", 'T'));
		itemNew.setAccelerator(KeyStroke.getKeyStroke('N', java.awt.event.InputEvent.CTRL_DOWN_MASK));
		itemNew.addActionListener(this);
		mFile.addSeparator();
		// open
		mFile.add(itemOpen = new JMenuItem("Mở tập tin", 'M'));
		itemOpen.setAccelerator(KeyStroke.getKeyStroke('O', java.awt.event.InputEvent.CTRL_DOWN_MASK));
		itemOpen.addActionListener(this);
		// save
		mFile.add(itemSave = new JMenuItem("Lưu tập tin", 'L'));
		itemSave.setAccelerator(KeyStroke.getKeyStroke('S', java.awt.event.InputEvent.CTRL_DOWN_MASK));
		itemSave.addActionListener(this);
		mFile.addSeparator();
		// print
		mFile.add(itemPrint = new JMenuItem("In ra máy in", 'I'));
		itemPrint.setAccelerator(KeyStroke.getKeyStroke('P', java.awt.event.InputEvent.CTRL_DOWN_MASK));
		itemPrint.addActionListener(this);
		mFile.addSeparator();
		// exit
		mFile.add(itemExit = new JMenuItem("Thoát", 'T'));
		itemExit.setAccelerator(KeyStroke.getKeyStroke('X', java.awt.event.InputEvent.ALT_DOWN_MASK));
		itemExit.addActionListener(this);
		//
		// edit
		// copy
		mEdit.add(itemCopy = new JMenuItem("Copy", 'C'));
		itemCopy.addActionListener(this);
		itemCopy.setAccelerator(KeyStroke.getKeyStroke('C', java.awt.event.InputEvent.CTRL_DOWN_MASK));
		// cut
		mEdit.add(itemCut = new JMenuItem("Cut", 'u'));
		itemCut.setAccelerator(KeyStroke.getKeyStroke('X', java.awt.event.InputEvent.CTRL_DOWN_MASK));
		itemCut.addActionListener(this);
		// paste
		mEdit.add(itemPaste = new JMenuItem("Paste", 'P'));
		itemPaste.addActionListener(this);
		itemPaste.setAccelerator(KeyStroke.getKeyStroke('V', java.awt.event.InputEvent.CTRL_DOWN_MASK));
		//
		// help
		mHelp.add(itemAbout = new JMenuItem("About"));
		itemAbout.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(itemExit)) {
			System.exit(1);
		} else if (obj.equals(itemNew))
			jtxContent.setText("");
		else if (obj.equals(itemOpen))
			OpenFunction();
		else if (obj.equals(itemSave))
			SaveFunction();
		else if (obj.equals(itemPrint))
			PrintFunction();
		else if (obj.equals(itemCopy))
			jtxContent.copy();
		else if (obj.equals(itemPaste))
			jtxContent.paste();
		else if (obj.equals(itemCut))
			jtxContent.cut();
		else if (obj.equals(itemAbout))
			About();
	}

	/*** Dùng cho menu mở tập tin */
	void OpenFunction() {
		JFileChooser fc = new JFileChooser();
		if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			try {
				String selFile = fc.getSelectedFile().getAbsolutePath();// lấy_đường_dẫn_của_file_được_chọn
				Scanner sc = new Scanner(new FileInputStream(selFile), "UTF-8");
				lblStatusBar.setText("Opened: " + selFile);
				String line = "";
				while (sc.hasNextLine())
					line += sc.nextLine() + "\n";
				jtxContent.setText(line);
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/*** Dùng cho menu lưu tập tin */
	void SaveFunction() {
		try {
			String pathSave = " ";
			JFileChooser fc = new JFileChooser();
			if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
				// savefile
				String fileName = fc.getSelectedFile().getName();
				String dir = fc.getCurrentDirectory().toString();
				pathSave = dir + "\\" + fileName + ".txt";
				// ghi vao jLabel
				lblStatusBar.setText("Saved: " + fileName);
				// ghi vao file
				PrintWriter out = new PrintWriter(new FileOutputStream(pathSave), true);
				out.print(jtxContent.getText());
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// In ấn
	void PrintFunction() {
		try {
			MessageFormat header = new MessageFormat("https://www.facebook.com/thanghoang07");
			MessageFormat footer = new MessageFormat("Best java tutorial website");
			jtxContent.print(header, footer, true, null, null, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// About
	void About() {
		JDialog dlg = new JDialog(this);
		dlg.setLayout(new BorderLayout());
		dlg.setTitle("About");
		dlg.setSize(350, 100);
		final String URL = "https://www.facebook.com/thanghoang07";
		JLabel l1 = new JLabel(URL, JLabel.CENTER);
		l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		l1.setForeground(Color.blue);
		dlg.add(l1, BorderLayout.CENTER);
		l1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String commands = "cmd /c start " + URL;
				try {
					Runtime rt = Runtime.getRuntime();
					rt.exec(commands);
				} catch (Exception ioe) {
					ioe.printStackTrace();
				}
			}
		});
		dlg.setVisible(true);
	}
}
