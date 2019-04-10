package adaptee;

import javax.swing.JOptionPane;

public class Adaptee {
	public void specificRequest() {
		JOptionPane.showMessageDialog(null, "Hello Design Pattern", "from Adaptee", JOptionPane.OK_OPTION);
	}
}
