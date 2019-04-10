package demoMvc2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	Model model;
	View view;

	public Controller() {
		System.out.println("Controller()");
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Controller: acting on Model");
		model.incrementValue();
	}

	public void addModel(Model m) {
		System.out.println("Controller: adding model");
		this.model = m;
	}

	public void addView(View v) {
		System.out.println("Controller: adding view");
		this.view = v;
	}

	public void initModel(int x) {
		model.setValue(x);
	}

} 
