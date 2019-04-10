package nguyenvanquan7826;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * ----------------- @author nguyenvanquan7826 -----------------
 * ---------------nguyenvanquan7826.wordpress.com --------------
 */
public class GUI extends JFrame implements ActionListener {

	private final String title = "ChÆ°Æ¡ng trÃ¬nh duyá»‡t Ä‘á»“ thá»‹";
	private final String author = "NGUYá»„N VÄ‚N QUÃ‚N - ICTU";
	private final int colTextField = 5;
	private int widthGraphicsPanl = 400;
	private int heightGraphicsPanl = 0;
	private final int maxPoint = 10;

	private GraphicsPanel graphicsPanel;
	private Graph graph;

	private JButton btnCreateGraph, btnAddEdge, btnRun;
	private JRadioButton radBFS, radDFS;
	private JTextField tfNumberPoint, tfBeginPoint, tfEndPoint, tfStartPoint;

	public GUI() {
		add(createMainPanel());
		setDisplay();
	}

	private void setDisplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private JPanel createMainPanel() {
		JPanel panel = new JPanel(new BorderLayout());

		panel.add(createTitlePanel(), BorderLayout.PAGE_START);
		panel.add(createControlPanel(), BorderLayout.WEST);
		panel.add(createShowPanel(), BorderLayout.CENTER);
		panel.add(createAuthorPanel(), BorderLayout.PAGE_END);

		graphicsPanel.setPreferredSize(new Dimension(widthGraphicsPanl, heightGraphicsPanl));
		return panel;
	}

	private JPanel createTitlePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel(title.toUpperCase()));
		return panel;
	}

	private JPanel createControlPanel() {

		// create select panel - select algorithm
		JPanel selectPanel = new JPanel(new GridLayout(4, 2, 5, 5));
		selectPanel.setBorder(new TitledBorder("Khởi tạo"));
		selectPanel.add(new JLabel("Thuật toán:"));
		selectPanel.add(radBFS = createRadioButton("BFS", true));
		selectPanel.add(new JLabel(""));
		selectPanel.add(radDFS = createRadioButton("DFS", false));
		selectPanel.add(new JLabel("Số điểm:"));
		selectPanel.add(tfNumberPoint = createTextField());
		selectPanel.add(new JLabel(""));
		selectPanel.add(btnCreateGraph = createButton("Nhập"));

		ButtonGroup btnG = new ButtonGroup();
		btnG.add(radBFS);
		btnG.add(radDFS);

		// create edge panel - select algorithm
		JPanel edgePanel = new JPanel(new GridLayout(3, 2, 5, 5));
		edgePanel.setBorder(new TitledBorder("Thêm cạnh"));
		edgePanel.add(new JLabel("Điểm đầu:"));
		edgePanel.add(tfBeginPoint = createTextField());
		edgePanel.add(new JLabel("Điểm cuối"));
		edgePanel.add(tfEndPoint = createTextField());
		edgePanel.add(new JLabel(""));
		edgePanel.add(btnAddEdge = createButton("Thêm"));

		// create edge panel - select algorithm
		JPanel runPanel = new JPanel(new GridLayout(2, 2, 5, 5));
		runPanel.setBorder(new TitledBorder("Duyệt đồ thị"));
		runPanel.add(new JLabel("Điểm bắt đầu:"));
		runPanel.add(tfStartPoint = createTextField());
		runPanel.add(new JLabel(""));
		runPanel.add(btnRun = createButton("Duyệt"));

		JPanel contentPanel = new JPanel(new BorderLayout());
		contentPanel.add(selectPanel, BorderLayout.PAGE_START);
		contentPanel.add(edgePanel, BorderLayout.CENTER);
		contentPanel.add(runPanel, BorderLayout.PAGE_END);
		// contentPanel.setBorder(new LineBorder(Color.blue));

		JPanel panel = new JPanel();
		panel.add(contentPanel);
		// panel.setBorder(new LineBorder(Color.red));
		heightGraphicsPanl = (int) contentPanel.getPreferredSize().getHeight();
		return panel;
	}

	private JPanel createShowPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		// panel.add(new JLabel("Ä�á»“ thá»‹"), BorderLayout.PAGE_START);
		panel.add(graphicsPanel = new GraphicsPanel());
		return panel;
	}

	private JPanel createAuthorPanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel(author.toUpperCase()));
		return panel;
	}

	private JButton createButton(String text) {
		JButton btn = new JButton(text);
		btn.addActionListener(this);
		return btn;
	}

	private JRadioButton createRadioButton(String text, boolean select) {
		JRadioButton rad = new JRadioButton(text, select);
		rad.addActionListener(this);
		return rad;
	}

	private JTextField createTextField() {
		JTextField tf = new JTextField(colTextField);
		return tf;
	}

	// ----------------------

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCreateGraph) {
			createGraph();
			return;
		}
		if (e.getSource() == btnAddEdge) {
			addEdge();
			return;
		}
		if (e.getSource() == btnRun) {
			run();
		}
	}

	private void createGraph() {
		int numberPoint = getValue(tfNumberPoint, maxPoint);
		if (numberPoint > 0) {
			graphicsPanel.setNumberPoint(numberPoint);
			graphicsPanel.start(graphicsPanel.getPreferredSize().width, graphicsPanel.getPreferredSize().height);

			graph = new Graph();
			graph.setNumberPoint(numberPoint);
			graph.initValue();
			// disabale(true);
			tfBeginPoint.requestFocus();
		}

	}

	private void addEdge() {
		int max = graphicsPanel.getNumberPoint();
		int indexBeginPoint = getValue(tfBeginPoint, max);
		if (indexBeginPoint > 0) {
			int indexEndPoint = getValue(tfEndPoint, max);
			if (indexEndPoint > 0) {
				indexBeginPoint--;
				indexEndPoint--;
				graphicsPanel.addLine(indexBeginPoint, indexEndPoint);

				graph.getMatrix()[indexBeginPoint][indexEndPoint] = 1;
				graph.getMatrix()[indexEndPoint][indexBeginPoint] = 1;
				tfBeginPoint.setText("");
				tfEndPoint.setText("");
				tfBeginPoint.requestFocus();
			}
		}
	}

	private void run() {
		int startPoint = getValue(tfStartPoint, graphicsPanel.getNumberPoint());
		if (startPoint > 0) {
			startPoint--;
			graph.initVisit();
			graph.initListVisit();
			if (radBFS.isSelected()) {
				graph.BFS(startPoint);
			} else {
				graph.DFS(startPoint);
			}
			setPath();
		}
	}

	private int getValue(JTextField tf, int maxValue) {
		int value = 0;
		try {
			value = Integer.parseInt(tf.getText().toString().trim());
		} catch (Exception e) {
		}
		if (value <= 0 || value > maxValue) {
			JOptionPane.showMessageDialog(null, "Error input", "Error", JOptionPane.ERROR_MESSAGE);
			tf.requestFocus();
			return 0;
		}
		return value;
	}

	private void setPath() {
		int numberPointVisit = graph.getListVisit().size();
		graph.showMatrix();
		System.out.println(graph.toStringListPoint(1));

		int numberLine = graphicsPanel.getListLine().size();
		for (int i = 0; i < numberLine; i++) {
			graphicsPanel.getListLine().get(i).setType(0);
			graphicsPanel.getListLine().get(i).setOrder(0);
		}

		int numberPoint = graphicsPanel.getListPoint().size();
		for (int i = 0; i < numberPoint; i++) {
			graphicsPanel.getListPoint().get(i).setType(0);
		}

		for (int i = 0; i < numberPointVisit; i++) {
			int index = graph.getListVisit().get(i);
			if (i == 0) {
				graphicsPanel.getListPoint().get(index).setType(1);
			} else if (i == numberPointVisit - 1) {
				graphicsPanel.getListPoint().get(index).setType(3);
			} else {
				graphicsPanel.getListPoint().get(index).setType(2);
			}
		}

		for (int i = 0; i < numberPointVisit; i++) {
			int index = graph.getListVisit().get(i);

			for (int j = 0; j < numberLine; j++) {
				MyLine line = graphicsPanel.getListLine().get(j);
				if ((line.getIndexP1() == index && line.getIndexP2() == graph.getBack()[index])
						|| (line.getIndexP1() == graph.getBack()[index] && line.getIndexP2() == index)) {
					line.setType(1);
					line.setOrder(i);
					break;
				}
			}
		}
		graphicsPanel.repaint();
	}

	public static void main(String[] args) {
		GUI giaoDien = new GUI();
	}

}
