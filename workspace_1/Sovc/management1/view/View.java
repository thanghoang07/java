package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;

public abstract class View extends JFrame {
	public JTextField txtCode, txtName, txtDob, txtPob;

	public View(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 478, 653);
		setVisible(true);
	}

	public abstract JToolBar createToolBar();

	public abstract JPanel createPanelInput();

	public abstract JPanel createPanelOutput();

	public void reset() {
		txtCode.setText("");
		txtName.setText("");
		txtDob.setText("");
		txtPob.setText("");
	}

	public abstract void createGUI();

	public abstract JTable getTable();

	public abstract String getViewPob();

	public abstract String getViewDob();

	public abstract String getViewName();

	public abstract String getViewCode();

	public abstract DefaultTableModel getModel();

	private static final long serialVersionUID = 1L;

	public abstract void suKienNutAdd(ActionListener listenForAddButton);

	public abstract void suKienNutExit(ActionListener listenForExitButton);

	public abstract void suKienNutEdit(ActionListener listenForEditButton);

	public abstract void suKienNutDelete(ActionListener listenForDeleteButton);

	public abstract void hienThiRaBang(String code, String name, String dob, String pob);

	public void thongBaoLoi(int number) {
		switch (number) {
		case 1:
			JOptionPane.showMessageDialog(null, "Cac truong dang trong", "Error", JOptionPane.WARNING_MESSAGE);
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Co mot truong dang trong", "Error", JOptionPane.WARNING_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Loi chua xac dinh", "Error", JOptionPane.WARNING_MESSAGE);
			break;
		default:
			break;
		}
	}
}
