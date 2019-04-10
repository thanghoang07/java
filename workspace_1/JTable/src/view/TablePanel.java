package view;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablePanel extends JScrollPane {
	private static final long serialVersionUID = 1L;
	
	public TablePanel(JTable table) {
		super(table);
		table.setAutoCreateRowSorter(true);
		table.setAutoscrolls(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	}

}
