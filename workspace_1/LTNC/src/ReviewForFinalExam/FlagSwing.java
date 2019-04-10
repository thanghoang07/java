package ReviewForFinalExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlagSwing extends JFrame implements ActionListener {
	JButton but;JButton fry;JButton lom;JButton guam;JButton vie;JLabel lb;JButton esp;JButton bru;JButton kny;JButton kyr;
public FlagSwing(){
	setTitle("");
	JPanel pn1=new JPanel();
	pn1.setLayout(new BoxLayout(pn1, BoxLayout.X_AXIS));
	JButton b1=new JButton("",new ImageIcon("hinh/mayIn.png"));
	//b1.setLayout(new BoxLayout(target, axis));
	JButton b2=new JButton("",new ImageIcon("hinh/luu.png"));
	pn1.add(b1);
	pn1.add(b2);
	pn1.setBorder(BorderFactory.createTitledBorder(""));
	add(pn1, BorderLayout.NORTH);
	JPanel pn2=new JPanel();
	pn2.setLayout(new BoxLayout(pn2, BoxLayout.Y_AXIS));
	but=new JButton("       BUTAN                      ");
	but.addActionListener(this);
	pn2.add(but); 
	fry=new JButton("       FRYSLAND               ");
	fry.addActionListener(this);
	pn2.add(fry);
	lom=new JButton("       LOMBARDY             ");
	lom.addActionListener(this);
	pn2.add(lom); 
	guam=new JButton("      GUAM                         ");
	guam.addActionListener(this);
	pn2.add(guam);  
	esp=new JButton("       ESPAIN                     ");
	esp.addActionListener(this);
	pn2.add(esp);
	bru=new JButton("       BRUNEI                     ");
	bru.addActionListener(this);
	pn2.add(bru);
	kny=new JButton("       KENYA                      ");
	kny.addActionListener(this);
	pn2.add(kny);
	kyr=new JButton("       KYRGYZSTAN         ");
	kyr.addActionListener(this);
	pn2.add(kyr);
	vie=new JButton("       VIET NAM                 ");
	vie.addActionListener(this);
	pn2.add(vie);
	pn2.setBorder(BorderFactory.createTitledBorder(""));
	add(pn2, BorderLayout.EAST);
	JPanel pn3=new JPanel();
	pn3.setLayout(new BoxLayout(pn3, BoxLayout.X_AXIS));
	lb=new JLabel("");
	add(pn3.add(lb));
	
	setSize(495,287);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setResizable(false);
	
}
public static void main(String[] args) {
	new FlagSwing();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==but) lb.setIcon(new ImageIcon("Imagess/BUT.jpg"));
	else if(e.getSource()==fry) lb.setIcon(new ImageIcon("Imagess/FRY.jpg"));
	else if(e.getSource()==lom) lb.setIcon(new ImageIcon("Imagess/LOM.jpg"));
	else if(e.getSource()==guam) lb.setIcon(new ImageIcon("Imagess/GUAM.jpg"));
	else if(e.getSource()==esp) lb.setIcon(new ImageIcon("Imagess/ESP.jpg"));
	else if(e.getSource()==bru) lb.setIcon(new ImageIcon("Imagess/BRU.jpg"));
	else if(e.getSource()==kny) lb.setIcon(new ImageIcon("Imagess/KNY.jpg"));
	else if(e.getSource()==kyr) lb.setIcon(new ImageIcon("Imagess/KYR.jpg"));
	else lb.setIcon(new ImageIcon("Imagess/VIE.jpg")); 
}

}
