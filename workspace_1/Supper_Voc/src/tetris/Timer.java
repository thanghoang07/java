package tetris;

import java.awt.event.ActionListener;

public class Timer extends Thread {
	private long m_delay;
	private boolean m_paused = true;
	private boolean m_fast = false;
	private ActionListener m_cb;
	public Timer(long delay, ActionListener cb) { 
		setDelay(delay);
		m_cb = cb;
	}
	public void setPaused(boolean pause) { 
		m_paused = pause;
		if(m_paused) {
		
		}
		else {
			
			synchronized(this) {
				this.notify();
			}
		}
	}
	public boolean isPaused() { return m_paused; }
	public void setDelay(long delay) { m_delay = delay; }
	public boolean isRunning() { return !m_paused; }
	public void setFast(boolean fast) {
		m_fast = fast;
		if(m_fast) {
			try {
				this.checkAccess();
				this.interrupt(); // no exception, so OK to interrupt
			} catch(SecurityException se) {}
		}
	}
	public boolean isFast() { return m_fast; }
	public void faster() {
		m_delay = (int)(m_delay * .9); //increase the speed exponentially in reverse
	}
	public void run() {
		while(true) {
			try { 
				sleep(m_fast ? 30 : m_delay); 
			} catch (Exception e) {}
			if(m_paused) {
				try {
					synchronized(this) {
						this.wait();
					}
				} catch(InterruptedException ie) {}
			}
			synchronized(this) {
				m_cb.actionPerformed(null);
			}
		}
	}
} // end class Timer
