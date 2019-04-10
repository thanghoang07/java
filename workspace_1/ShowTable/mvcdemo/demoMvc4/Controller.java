package demoMvc4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	private Model model;
	private View view;
	private ActionListener actionListener;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void contol() {
		actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				linkBtnAndLabel();
			}
		};
		view.getButton().addActionListener(actionListener);
	}

	private void linkBtnAndLabel() {
		model.incX();
		view.setText(Integer.toString(model.getX()));
	}
}
