package atm.simulation;

import javax.swing.JFrame;
import javax.swing.UIManager;
import atm.ATM;
import bank.Bank;

public class TestSim extends JFrame {

	public TestSim() {
		ATM theATM = new ATM("465", "e2346", new Bank("bidv", "345 nguyen"));
		Simulation theSimulation = new Simulation(theATM);
		add(theSimulation.getGUI());

		new Thread(theATM).start();

		setVisible(true);
		setSize(660, 620);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			new TestSim();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
