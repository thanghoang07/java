package demo_dong_ho;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JTextField;
import javax.swing.Timer;

public class Clock extends JTextField implements ActionListener {
    javax.swing.Timer m_t;

    //================================================== constructor
    public Clock() {
        //... Set some attributes.
        setColumns(6);
        setFont(new Font("sansserif", Font.PLAIN, 48));

        //... Create a 1-second timer.
        m_t = new Timer(1000, new ClockTickAction());
        m_t.start();  // Start the timer
    }

    /////////////////////////////////////////// inner class listener
    private class ClockTickAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //... Get the current time.
            Calendar now = Calendar.getInstance();
            int h = now.get(Calendar.HOUR_OF_DAY);
            int m = now.get(Calendar.MINUTE);
            int s = now.get(Calendar.SECOND);
            setText("" + h + ":" + m + ":" + s);
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
} 
