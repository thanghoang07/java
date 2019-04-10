package viewTree;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

public class Classify {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Hiển thị Tree.
		Instances data;
		data = DataSource.read("E:\\data\\weather.nominal.arff");
		J48 j48 = new J48();
		data.setClassIndex(data.numAttributes() - 1);
		j48.buildClassifier(data);
		System.out.println(j48);

		// Vẽ cây
		TreeVisualizer tv = new TreeVisualizer(null, j48.graph(), new PlaceNode2());
		JFrame jf = new JFrame("Weka Tree J48");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(600, 800);
		jf.getContentPane().setLayout(new BorderLayout());
		jf.add(tv, BorderLayout.CENTER);
		jf.setVisible(true);
		tv.fitToScreen();

	}

}
