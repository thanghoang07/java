package com.showtable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JScrollPane;

public class UserManageGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManageGUI frame = new UserManageGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ParseException 
	 * @throws ClassNotFoundException 
	 */
	public UserManageGUI() throws ClassNotFoundException, ParseException, SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBounds(10, 11, 934, 234);
		contentPane.add(tablePanel);
		tablePanel.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 0, 930, 234);
		table.setModel(new DefaultTableModel(
				new Object [][]{
						{},
						{},
						{},
						{}
				},
				new String[]{}
			));
		ShowData();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 690, 234);
		scrollPane.setViewportView(table);
		tablePanel.add(scrollPane);
	}
	
	private void ShowData()
	{
		Connection conn;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanage", "root", "##y$ql");
			Statement stm = conn.createStatement();
			ResultSet rss = stm.executeQuery("SELECT * FROM usertbl");
			ResultSetMetaData rssmd = rss.getMetaData();
			int columnCount = rssmd.getColumnCount();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setColumnCount(0);
			for(int i = 1; i <= columnCount; i++)
			{
				model.addColumn(rssmd.getColumnName(i));
			}
			model.setRowCount(0);
			while(rss.next())
			{
				String[] a = new String[columnCount];
				for(int i = 0; i < columnCount; i++)
				{
					a[i] = rss.getString(i+1);
				}
				model.addRow(a);
			}
			model.fireTableDataChanged();
			rss.close();
			stm.close();
			conn.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(this, e, e.getMessage(), WIDTH, null);
		}
	}
}
