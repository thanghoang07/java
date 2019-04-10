package demo002;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.GridLayout;
import java.awt.KeyboardFocusManager;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

public class JXButtonPanel extends JPanel {
	private boolean isCyclic;
	private boolean isGroupSelectionFollowFocus;

	public JXButtonPanel() {
		super();
		init();
	}

	public JXButtonPanel(LayoutManager layout) {
		super(layout);
		init();
	}

	public JXButtonPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		init();
	}

	public JXButtonPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		init();
	}

	private void init() {
		setFocusTraversalPolicyProvider(true);
		setFocusTraversalPolicy(new JXButtonPanelFocusTraversalPolicy());
		ActionListener actionHandler = new ActionHandler();
		registerKeyboardAction(actionHandler, ActionHandler.FORWARD, KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0),
				JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		registerKeyboardAction(actionHandler, ActionHandler.FORWARD, KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0),
				JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		registerKeyboardAction(actionHandler, ActionHandler.BACKWARD, KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0),
				JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		registerKeyboardAction(actionHandler, ActionHandler.BACKWARD, KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0),
				JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		setGroupSelectionFollowFocus(true);
	}

	public boolean isCyclic() {
		return isCyclic;
	}

	public void setCyclic(boolean isCyclic) {
		this.isCyclic = isCyclic;
	}

	public boolean isGroupSelectionFollowFocus() {
		return isGroupSelectionFollowFocus;
	}

	public void setGroupSelectionFollowFocus(boolean groupSelectionFollowFocus) {
		isGroupSelectionFollowFocus = groupSelectionFollowFocus;
	}

	private static ButtonGroup getButtonGroup(AbstractButton button) {
		ButtonModel model = button.getModel();
		if (model instanceof DefaultButtonModel) {
			return ((DefaultButtonModel) model).getGroup();
		}
		return null;
	}

	private class ActionHandler implements ActionListener {
		private static final String FORWARD = "moveSelectionForward";
		private static final String BACKWARD = "moveSelectionBackward";

		public void actionPerformed(ActionEvent e) {
			FocusTraversalPolicy ftp = JXButtonPanel.this.getFocusTraversalPolicy();

			if (ftp instanceof JXButtonPanelFocusTraversalPolicy) {
				JXButtonPanelFocusTraversalPolicy xftp = (JXButtonPanelFocusTraversalPolicy) ftp;

				String actionCommand = e.getActionCommand();
				Component fo = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
				Component next;

				xftp.setAlternativeFocusMode(true);

				if (FORWARD.equals(actionCommand)) {
					next = xftp.getComponentAfter(JXButtonPanel.this, fo);
				} else if (BACKWARD.equals(actionCommand)) {
					next = xftp.getComponentBefore(JXButtonPanel.this, fo);
				} else {
					throw new AssertionError("Unexpected action command: " + actionCommand);
				}

				xftp.setAlternativeFocusMode(false);

				if (fo instanceof AbstractButton) {
					AbstractButton b = (AbstractButton) fo;
					b.getModel().setPressed(false);
				}
				if (next != null) {
					if (fo instanceof AbstractButton && next instanceof AbstractButton) {
						ButtonGroup group = getButtonGroup((AbstractButton) fo);
						AbstractButton nextButton = (AbstractButton) next;
						if (group != getButtonGroup(nextButton)) {
							return;
						}
						if (isGroupSelectionFollowFocus() && group != null && group.getSelection() != null
								&& !nextButton.isSelected()) {
							nextButton.setSelected(true);
						}
						next.requestFocusInWindow();
					}
				}
			}
		}
	}

	private class JXButtonPanelFocusTraversalPolicy extends LayoutFocusTraversalPolicy {
		private boolean isAlternativeFocusMode;

		public boolean isAlternativeFocusMode() {
			return isAlternativeFocusMode;
		}

		public void setAlternativeFocusMode(boolean alternativeFocusMode) {
			isAlternativeFocusMode = alternativeFocusMode;
		}

		protected boolean accept(Component c) {
			if (!isAlternativeFocusMode() && c instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) c;
				ButtonGroup group = JXButtonPanel.getButtonGroup(button);
				if (group != null && group.getSelection() != null && !button.isSelected()) {
					return false;
				}
			}
			return super.accept(c);
		}

		public Component getComponentAfter(Container aContainer, Component aComponent) {
			Component componentAfter = super.getComponentAfter(aContainer, aComponent);
			if (!isAlternativeFocusMode()) {
				return componentAfter;
			}
			if (JXButtonPanel.this.isCyclic()) {
				return componentAfter == null ? getFirstComponent(aContainer) : componentAfter;
			}
			if (aComponent == getLastComponent(aContainer)) {
				return aComponent;
			}
			return componentAfter;
		}

		public Component getComponentBefore(Container aContainer, Component aComponent) {
			Component componentBefore = super.getComponentBefore(aContainer, aComponent);
			if (!isAlternativeFocusMode()) {
				return componentBefore;
			}
			if (JXButtonPanel.this.isCyclic()) {
				return componentBefore == null ? getLastComponent(aContainer) : componentBefore;
			}
			if (aComponent == getFirstComponent(aContainer)) {
				return aComponent;
			}
			return componentBefore;
		}
	}
}

class JXButtonPanelDemo extends JFrame {
	private ButtonGroup radioGroup = new ButtonGroup();

	public JXButtonPanelDemo() {
		super("JXButtonPanel demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		JPanel topPanel = new JPanel(new GridLayout(1, 0));

		final JXButtonPanel radioGroupPanel = createRadioJXButtonPanel();
		topPanel.add(radioGroupPanel);

		final JXButtonPanel checkBoxPanel = createCheckBoxJXButtonPanel();
		topPanel.add(checkBoxPanel);

		add(topPanel);
		add(createButtonJXButtonPanel(), BorderLayout.SOUTH);
		pack();

		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Options");
		JMenuItem item = new JMenuItem("Unselect radioButtons");
		item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.ALT_MASK));
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// hack for 1.5
				// in 1.6 ButtonGroup.clearSelection added
				JRadioButton b = new JRadioButton();
				radioGroup.add(b);
				b.setSelected(true);
				radioGroup.remove(b);
			}
		});
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);

		setSize(300, 300);
		setLocationRelativeTo(null);
	}

	private JXButtonPanel createRadioJXButtonPanel() {
		JXButtonPanel panel = new JXButtonPanel();
		panel.setLayout(new GridLayout(0, 1));
		JRadioButton one = new JRadioButton("One");
		panel.add(one);
		radioGroup.add(one);
		JRadioButton two = new JRadioButton("Two");
		panel.add(two);
		radioGroup.add(two);
		JRadioButton three = new JRadioButton("Three");
		panel.add(three);
		radioGroup.add(three);
		JRadioButton four = new JRadioButton("Four");
		panel.add(four);
		radioGroup.add(four);
		one.setSelected(true);
		panel.setBorder(BorderFactory.createTitledBorder("JXButtonPanel"));
		return panel;
	}

	private JXButtonPanel createCheckBoxJXButtonPanel() {
		JXButtonPanel panel = new JXButtonPanel();
		panel.setLayout(new GridLayout(0, 1));
		JCheckBox one = new JCheckBox("One");
		panel.add(one);
		JCheckBox two = new JCheckBox("Two");
		panel.add(two);
		JCheckBox three = new JCheckBox("Three");
		panel.add(three);
		JCheckBox four = new JCheckBox("Four");
		panel.add(four);
		panel.setBorder(BorderFactory.createTitledBorder("JXButtonPanel"));
		return panel;
	}

	private JPanel createButtonJXButtonPanel() {
		JPanel ret = new JPanel(new BorderLayout());
		JLabel label = new JLabel("Does JXButtonPanel support arrow keys ?");
		label.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
		JPanel temp = new JPanel();
		temp.add(label);
		ret.add(temp);

		JXButtonPanel panel = new JXButtonPanel();
		panel.setCyclic(true);
		panel.add(new JButton("Yes"));
		panel.add(new JButton("Sure"));
		panel.add(new JButton("Absolutely !"));
		panel.setBorder(BorderFactory.createTitledBorder(null, "JXButtonPanel.setCyclic(true)", TitledBorder.CENTER,
				TitledBorder.BOTTOM));
		ret.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

		ret.add(panel, BorderLayout.SOUTH);
		return ret;
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JXButtonPanelDemo().setVisible(true);
			}
		});
	}
}
