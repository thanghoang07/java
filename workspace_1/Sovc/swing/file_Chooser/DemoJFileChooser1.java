package file_Chooser;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoJFileChooser1 extends JPanel implements ActionListener {
	JButton go;

	JFileChooser chooser;
	String choosertitle;

	public DemoJFileChooser1() {
		go = new JButton("Do it");
		go.addActionListener(this);
		add(go);
	}

	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}

	public static void main(String s[]) {
		JFrame frame = new JFrame("");
		DemoJFileChooser2 panel = new DemoJFileChooser2();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(panel, "Center");
		frame.setSize(panel.getPreferredSize());
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int result;
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle(choosertitle);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		//
		// disable the "All files" option.
		//
		chooser.setAcceptAllFileFilterUsed(false);
		//
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
			System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
		} else {
			System.out.println("No Selection ");
		}
	}
}
