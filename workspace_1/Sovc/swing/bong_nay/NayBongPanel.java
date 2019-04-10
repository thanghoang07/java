package bong_nay;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NayBongPanel extends JPanel {
    NayBongTrongBox m_bb;
    
    public NayBongPanel() {

        m_bb = new NayBongTrongBox();        
        JButton startButton = new JButton("Start");        
        JButton stopButton  = new JButton("Stop");
        
        startButton.addActionListener(new StartAction());
        stopButton.addActionListener(new StopAction());
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        
        this.setLayout(new BorderLayout());
        this.add(buttonPanel, BorderLayout.PAGE_END);
        this.add(m_bb , BorderLayout.CENTER);
    }
    
    
    class StartAction implements ActionListener {
        @Override
		public void actionPerformed(ActionEvent e) {
			m_bb.setAnimation(true);
			
		}
    }
    
    class StopAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            m_bb.setAnimation(false);
        }
    }
}
