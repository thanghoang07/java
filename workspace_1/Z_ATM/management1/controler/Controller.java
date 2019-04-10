package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Students;
import view.StudentView;
import view.TeacherView;

public class Controller {
	private Students theModel;
	private StudentView theViewStd;
	private TeacherView theViewTec;

	public Controller(Students theModel, StudentView theView) {
		super();
		this.theModel = theModel;
		this.theViewStd = theView;
		this.theViewStd.suKienNutAdd(new ControllerAddListen());
		this.theViewStd.suKienNutExit(new ControllerExitListen());
		this.theViewStd.suKienNutDelete(new ControllerDeleteListen());
		//
		this.theViewTec.suKienNutAdd(new ControllerAddListen());
		this.theViewTec.suKienNutExit(new ControllerExitListen());
		this.theViewTec.suKienNutDelete(new ControllerDeleteListen());
	}

	class ControllerAddListen implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String stdCode = theViewStd.getViewCode(), stdName = theViewStd.getViewName(), stdDob = theViewStd.getViewDob(),
					stdPob = theViewStd.getViewPob();
			try {
				if (stdCode.equals("") && stdName.equals("") && stdDob.equals("") && stdPob.equals("")
						|| stdCode.equals("") || stdName.equals("") || stdDob.equals("") || stdPob.equals("")) {
					theViewStd.thongBaoLoi();
				} else {
					theModel.setData(stdCode, stdName, stdDob, stdPob);
					theViewStd.hienThiRaBang(stdCode, stdName, stdDob, stdPob);
					theViewStd.reset();
				}
			} catch (NumberFormatException ex) {
				System.out.println(ex);
			}
		}
	}

	class ControllerExitListen implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	class ControllerDeleteListen implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
//			int temp = theView.getTable().getSelectedRow();
//			if (temp >= 0) {
//				theView.getModel().removeRow(temp);
//				for (int i = temp; i < theView.getTable().getRowCount(); i++) {
//					theView.getModel().setValueAt(++temp, i, 0);
//				}
//			}
//			theView.reset();
			JOptionPane.showMessageDialog(null, "Chuc nang chua lam xong", "Error", JOptionPane.WARNING_MESSAGE);
		}
	}
}
