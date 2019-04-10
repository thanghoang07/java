package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.PeopleModel;
import view.View;

public class Controller {
	private PeopleModel theModel;
	private View theView;

	public Controller(PeopleModel theModel, View theView) {
		super();
		this.theModel = theModel;
		this.theView = theView;
		//
		this.theView.suKienNutAdd(new ControllerAddListen());
		this.theView.suKienNutExit(new ControllerExitListen());
		this.theView.suKienNutDelete(new ControllerDeleteListen());
		this.theView.suKienNutEdit(new ControllerEditListen());
	}

	class ControllerAddListen implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String stdCode = theView.getViewCode(), stdName = theView.getViewName(), stdDob = theView.getViewDob(),
					stdPob = theView.getViewPob();
			if (stdCode.equals("") && stdName.equals("") && stdDob.equals("") && stdPob.equals("")) {
				theView.thongBaoLoi(1);
			} else if (stdCode.equals("") || stdName.equals("") || stdDob.equals("") || stdPob.equals("")) {
				theView.thongBaoLoi(3);
			} else {
				theModel.setData(stdCode, stdName, stdDob, stdPob);
				theView.hienThiRaBang(stdCode, stdName, stdDob, stdPob);
				theView.reset();
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
			// int temp = theView.getTable().getSelectedRow();
			// if (temp >= 0) {
			// theView.getModel().removeRow(temp);
			// for (int i = temp; i < theView.getTable().getRowCount(); i++) {
			// theView.getModel().setValueAt(++temp, i, 0);
			// theModel.removeData(theView.getModel().getColumnName(1),
			// theView.getModel().getColumnName(2),
			// theView.getModel().getColumnName(3),
			// theView.getModel().getColumnName(4));
			//
			// }
			// }
			// theView.reset();
			theView.thongBaoLoi(2);
			System.out.println("chua co chuc nang delete");
		}
	}

	class ControllerEditListen implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			theView.thongBaoLoi(2);
			System.out.println("chua co chuc nang edit");
		}
	}
}
