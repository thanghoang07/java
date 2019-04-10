package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo extends JFrame 
{    
	/**
	 * 
	 */
	private static final long serialVersionUID = -4525930233577791320L;
	public Demo()
	{  
		setLayout(new FlowLayout(FlowLayout.LEFT, 12, 25));
		add(new JLabel("FirstName"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1)); 
		add(new JLabel("LastName"));
		add(new JTextField(8)); 
	}  
	public static void main(String[] args)
	{ 
		Demo frame = new Demo();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(200, 200);  
		frame.setLocationRelativeTo(null);//Center the frame 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);  
	}
} 
	