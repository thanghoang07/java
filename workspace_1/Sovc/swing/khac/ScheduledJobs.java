package khac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ScheduledJobs extends JFrame {
	private JFileChooser jfcSource, jfcTarget;
	private JComboBox jcbAction;
	private JCheckBox jCbGhiDe, jCbSendMail;
	private JLabel jLbSource, jLbTarget, jlbMail;
	private JPanel jPanel1, panlAED, panlAction, panlPath, panlSetting;
	private JRadioButton jRBDelete, jRBRemove, jRbCopy;
	private JScrollPane jScrollPane1;
	private JButton jbAdd, jbDelete, jbEdit, jbtSource, jbtStart, jbtTarget;
	private JTable jtData;
	private JTextField jtfAddMail, jtfSource, jtfTarget;

	public ScheduledJobs() {
		super("ScheduledJobs");
		initComponents();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		// thiet lap jtable
		dataTable();

	}

	// load data jtable - jtData
	private void dataTable() {
		ImageIcon test = new ImageIcon("D:\\check.png");
		DefaultTableModel model = new DefaultTableModel(
				new Object[] { "STT", "Name", "From", "To", "Action", "Size", "Status" }, 10);
		// model.insertRow(0, new Object[]{"1", "toan", jtfSource.getText(),
		// jtfTarget.getText(), "Chosser", "1569kb", test});
		jtData.setModel(model);
		jtData.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		// TAO COT jcheckbox
		String[] action = { "Copy", "Delete", "Remove" };
		JComboBox jbAction = new JComboBox(action);
		TableColumn col = jtData.getColumnModel().getColumn(4);
		col.setCellEditor(new DefaultCellEditor(jbAction));

		TableColumn colStatus = jtData.getColumnModel().getColumn(6);

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new JPanel();
		panlPath = new JPanel();
		jLbSource = new JLabel();
		jLbTarget = new JLabel();
		jtfSource = new JTextField();
		jtfTarget = new JTextField();
		jbtSource = new JButton();
		jbtTarget = new JButton();
		panlAED = new JPanel();
		jbAdd = new JButton();
		jbEdit = new JButton();
		jbDelete = new JButton();
		panlAction = new JPanel();
		jRbCopy = new JRadioButton();
		jRBDelete = new JRadioButton();
		jRBRemove = new JRadioButton();
		jScrollPane1 = new JScrollPane();
		jtData = new JTable();
		panlSetting = new JPanel();
		jCbGhiDe = new JCheckBox();
		jCbSendMail = new JCheckBox();
		jtfAddMail = new JTextField();
		jlbMail = new JLabel();
		jbtStart = new JButton();

		

		jLbSource.setText("Source");
		jLbTarget.setText("Target");
		jtfSource.setText("Chọn tệp tin hoặc thư mục.. .  .   .    .");
		jtfSource.setEnabled(false);
		jtfTarget.setText("Chọn tệp tin hoặc thư mục.. .  .   .    .");
		jtfTarget.setEnabled(false);
		jtfSource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jtfSourceActionPerformed(evt);
			}
		});

		jbtSource.setText("...");
		jbtSource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jbtSourceActionPerformed(evt);
			}
		});

		jbtTarget.setText("...");
		jbtTarget.setToolTipText("");
		jbtTarget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jbtTargetActionPerformed(evt);
			}
		});

		GroupLayout panlPathLayout = new GroupLayout(panlPath);
		panlPath.setLayout(panlPathLayout);
		panlPathLayout.setHorizontalGroup(panlPathLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(panlPathLayout.createSequentialGroup().addContainerGap()
						.addGroup(panlPathLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLbSource).addComponent(jLbTarget))
						.addGap(18, 18, 18)
						.addGroup(panlPathLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jtfSource, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
								.addComponent(jtfTarget, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panlPathLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jbtTarget, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtSource, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panlPathLayout.setVerticalGroup(panlPathLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(panlPathLayout.createSequentialGroup().addContainerGap()
						.addGroup(panlPathLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addGroup(panlPathLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLbSource).addComponent(jtfSource, GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(jbtSource))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panlPathLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLbTarget)
								.addComponent(jtfTarget, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jbtTarget))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		panlPathLayout.linkSize(SwingConstants.VERTICAL, new java.awt.Component[] { jtfSource, jtfTarget });

		jbAdd.setText("Thêm");
		jbAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jbAddActionPerformed(evt);
			}
		});

		jbEdit.setText("Sửa");

		jbDelete.setText("Xóa");

		GroupLayout panlAEDLayout = new GroupLayout(panlAED);
		panlAED.setLayout(panlAEDLayout);
		panlAEDLayout.setHorizontalGroup(panlAEDLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(panlAEDLayout.createSequentialGroup().addContainerGap()
						.addComponent(jbAdd, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panlAEDLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(jbDelete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jbEdit, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		panlAEDLayout.setVerticalGroup(panlAEDLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, panlAEDLayout.createSequentialGroup().addContainerGap()
						.addGroup(panlAEDLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(jbAdd, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addGroup(panlAEDLayout.createSequentialGroup()
										.addComponent(jbEdit, GroupLayout.PREFERRED_SIZE, 36,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jbDelete,
												GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		panlAction.setBorder(BorderFactory.createTitledBorder("Chọn hành động"));

		jRbCopy.setSelected(true);
		jRbCopy.setLabel("Copy");
		jRbCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jRbCopyActionPerformed(evt);
			}
		});

		jRBDelete.setLabel("Delete");

		jRBRemove.setLabel("Remove");

		GroupLayout panlActionLayout = new GroupLayout(panlAction);
		panlAction.setLayout(panlActionLayout);
		panlActionLayout.setHorizontalGroup(panlActionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(panlActionLayout.createSequentialGroup()
						.addGroup(panlActionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jRBDelete).addComponent(jRBRemove).addComponent(jRbCopy))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panlActionLayout.setVerticalGroup(panlActionLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(panlActionLayout.createSequentialGroup().addComponent(jRbCopy)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jRBDelete)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jRBRemove)));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(32, Short.MAX_VALUE)
						.addComponent(panlAction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(panlPath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(14, 14, 14).addComponent(panlAED, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(26, 26, 26)));
		jPanel1Layout
				.setVerticalGroup(
						jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(
										jPanel1Layout
												.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(panlAED, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addContainerGap().addGroup(jPanel1Layout
																		.createParallelGroup(
																				GroupLayout.Alignment.LEADING)
																		.addComponent(panlPath,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(panlAction,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))))
												.addContainerGap()));

		/*jtData.setModel(
				new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));*/
		jScrollPane1.setViewportView(jtData);

		panlSetting.setBorder(BorderFactory.createTitledBorder("Setting"));

		jCbGhiDe.setText("Ghi đè khi trùng");

		jCbSendMail.setText("Gửi mail khi hoàn thành");

		jtfAddMail.setText(" ");

		jlbMail.setText("tomcat@example.com");
		jlbMail.setForeground(Color.GRAY);

		GroupLayout panlSettingLayout = new GroupLayout(panlSetting);
		panlSetting.setLayout(panlSettingLayout);
		panlSettingLayout.setHorizontalGroup(panlSettingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, panlSettingLayout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE).addGroup(panlSettingLayout
								.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jCbGhiDe)
								.addGroup(panlSettingLayout.createSequentialGroup().addComponent(jCbSendMail)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(
												panlSettingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(jlbMail, GroupLayout.PREFERRED_SIZE, 158,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(jtfAddMail, GroupLayout.PREFERRED_SIZE, 158,
																GroupLayout.PREFERRED_SIZE))))
						.addGap(54, 54, 54)));
		panlSettingLayout.setVerticalGroup(panlSettingLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(panlSettingLayout.createSequentialGroup().addComponent(jCbGhiDe)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panlSettingLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jCbSendMail).addComponent(jtfAddMail, GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jlbMail).addContainerGap()));

		jbtStart.setText("Start");

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(panlSetting, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jbtStart, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(8, 8, 8))
								.addComponent(jScrollPane1))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(panlSetting, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(
										jbtStart, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jbtSourceActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jbtSourceActionPerformed
		jfcSource = new JFileChooser();
		jfcSource.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		jtfSource.setEnabled(false);
		if (jfcSource.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			String fileName = jfcSource.getSelectedFile().getName();
			String dir = jfcSource.getCurrentDirectory().toString();
			jtfSource.setText(dir + "\\" + fileName);

		}

	}// GEN-LAST:event_jbtSourceActionPerformed

	private void jbtTargetActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jbtTargetActionPerformed
		jfcTarget = new JFileChooser();
		JPanel jpFileChooser = new JPanel(new FlowLayout());

		jfcTarget.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		if (jfcTarget.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			String fileName = jfcTarget.getSelectedFile().getName();
			String dir = jfcTarget.getCurrentDirectory().toString();
			jtfTarget.setText(dir + "\\" + fileName);
		}
	}// GEN-LAST:event_jbtTargetActionPerformed

	private void jbAddActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jbAddActionPerformed

	}// GEN-LAST:event_jbAddActionPerformed

	private void jRbCopyActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jRbCopyActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jRbCopyActionPerformed

	private void jtfSourceActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jtfSourceActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jtfSourceActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ScheduledJobs.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(ScheduledJobs.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(ScheduledJobs.class.getName()).log(Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			Logger.getLogger(ScheduledJobs.class.getName()).log(Level.SEVERE, null, ex);
		}
		// </editor-fold>
		try {// 10/03/16 10:25
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ScheduledJobs();
			}
		});
	}

}
