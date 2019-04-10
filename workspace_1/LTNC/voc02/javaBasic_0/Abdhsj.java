package javaBasic_0;
import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.swing.event.*;
import java.beans.*;

public class Abdhsj extends JComponent
	implements Externalizable {

  // Property names (only needed for bound or constrained properties)
  public static final String BEAN_VALUE = "Value";
  public static final String BEAN_COLOR = "Color";

  // Properties
  private Font m_beanFont;           // simple
  private Dimension m_beanDimension; // simple
  private int m_beanValue;           // bound
  private Color m_beanColor;         // constrained
  private String m_beanString;       // change

  // Manages all PropertyChangeListeners
  protected SwingPropertyChangeSupport m_supporter = 
    new SwingPropertyChangeSupport(this);

  // Manages all VetoableChangeListeners
  protected VetoableChangeSupport m_vetoer = 
    new VetoableChangeSupport(this);

  // Only one ChangeEvent is needed since the event's only 
  // state is the source property.  The source of events generated
  // is always "this". -- you’ll see this in lots of Swing code.
  protected transient ChangeEvent m_changeEvent = null;

  // This can manage all types of listeners, as long as we set
  // up the fireXX methods to correctly look through this list.
  // This makes you appreciate the XXSupport classes.
  protected EventListenerList m_listenerList = 
    new EventListenerList();

  public Abdhsj() {
    m_beanFont = new Font("SanSerif", Font.BOLD | Font.ITALIC, 12);
    m_beanDimension = new Dimension(150,100);
    m_beanValue = 0;
    m_beanColor = Color.black;
    m_beanString = "BakedBean #";
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(m_beanColor);
    g.setFont(m_beanFont);
    g.drawString(m_beanString + m_beanValue,30,30);
  }

  public void setBeanFont(Font font) {
    m_beanFont = font;
  }

  public Font getBeanFont() {
    return m_beanFont;
  }

  public void setBeanValue(int newValue) {
    int oldValue = m_beanValue;
    m_beanValue = newValue;

    // Notify all PropertyChangeListeners
    m_supporter.firePropertyChange(BEAN_VALUE,
      new Integer(oldValue), new Integer(newValue));
  }

  public int getBeanValue() {
    return m_beanValue;
  }

  public void setBeanColor(Color newColor) 
   throws PropertyVetoException {
    Color oldColor = m_beanColor;

    // Notify all VetoableChangeListeners before making change
    // ...exception will be thrown here if there is a veto
    // ...if not we continue on and make the change
    m_vetoer.fireVetoableChange(BEAN_COLOR, oldColor, newColor);

    m_beanColor = newColor;
    m_supporter.firePropertyChange(BEAN_COLOR, oldColor, newColor);
  }
 
  public Color getBeanColor() {
    return m_beanColor;
  }

  public void setBeanString(String newString) {
    m_beanString = newString;

    // Notify all ChangeListeners
    fireStateChanged();
  }

  public String getBeanString() {
    return m_beanString;
  }

  public void setPreferredSize(Dimension dim) {
    m_beanDimension = dim;
  }

  public Dimension getPreferredSize() {
    return m_beanDimension;
  }

  public void setMinimumSize(Dimension dim) {
    m_beanDimension = dim;
  }

  public Dimension getMinimumSize() {
    return m_beanDimension;
  }

  public void addPropertyChangeListener(
   PropertyChangeListener l) {
    m_supporter.addPropertyChangeListener(l); 
  } 
    
  public void removePropertyChangeListener(
   PropertyChangeListener l) {
    m_supporter.removePropertyChangeListener(l); 
  }

  public void addVetoableChangeListener(
   VetoableChangeListener l) { 
    m_vetoer.addVetoableChangeListener(l); 
  } 

  public void removeVetoableChangeListener(
   VetoableChangeListener l) { 
    m_vetoer.removeVetoableChangeListener(l); 
  }

  // Remember that EventListenerList is an array of
  // key/value pairs.
  // key = XXListener class reference
  // value = XXListener instance
  public void addChangeListener(ChangeListener l) {
    m_listenerList.add(ChangeListener.class, l);
  }
    
  public void removeChangeListener(ChangeListener l) {
    m_listenerList.remove(ChangeListener.class, l);
  }

  // This is typical EventListenerList dispatching code.
  // You will see this in lots of Swing source.
  protected void fireStateChanged() {
    Object[] listeners = m_listenerList.getListenerList();
    // Process the listeners last to first, notifying
    // those that are interested in this event
    for (int i = listeners.length-2; i>=0; i-=2) {
      if (listeners[i]==ChangeListener.class) {
       if (m_changeEvent == null)
         m_changeEvent = new ChangeEvent(this);
         ((ChangeListener)listeners[i+1]).stateChanged(m_changeEvent);
      }          
    }
  }

  public void writeExternal(ObjectOutput out)   
		throws IOException {
    out.writeObject(m_beanFont);
    out.writeObject(m_beanDimension);
    out.writeInt(m_beanValue);
    out.writeObject(m_beanColor);
    out.writeObject(m_beanString);
  }

  public void readExternal(ObjectInput in)
	  throws IOException, ClassNotFoundException {
    setBeanFont((Font)in.readObject());
    setPreferredSize((Dimension)in.readObject());
      // Use preferred size for minimum size..
      setMinimumSize(getPreferredSize());
    setBeanValue(in.readInt());
    try {
      setBeanColor((Color)in.readObject());
    }
    catch (PropertyVetoException pve) {
      System.out.println("Color change vetoed..");
    }
    setBeanString((String)in.readObject());
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("BakedBean");
    frame.getContentPane().add(new Abdhsj());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 1.3
    frame.setVisible(true);
    frame.pack();
  }
}
