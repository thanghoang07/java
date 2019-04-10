import java.util.List;

import weka.associations.Apriori;
import weka.associations.AssociationRule;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.Tag;
import weka.core.converters.ConverterUtils.DataSource;

public class DemoApriori {
	protected static final int CONFIDENCE = 0;
	/** Metric type: Lift */
	protected static final int LIFT = 1;
	/** Metric type: Leverage */
	protected static final int LEVERAGE = 2;
	/** Metric type: Conviction */
	protected static final int CONVICTION = 3;
	public static final Tag[] TAGS_SELECTION = { new Tag(CONFIDENCE, "Confidence"), new Tag(LIFT, "Lift"),
			new Tag(LEVERAGE, "Leverage"), new Tag(CONVICTION, "Conviction") };

	public static void main(String[] args) throws Exception {
		// System.out.println("aaaa");
		Instances data;
		data = DataSource.read("E:\\data\\supermarket2.arff");

		Apriori apriori = new Apriori();
		apriori.setClassIndex(data.classIndex());
		apriori.setLowerBoundMinSupport(0.2);
		// chon confidence = 0
		apriori.setMetricType(new SelectedTag(0, TAGS_SELECTION));
		apriori.setMinMetric(0.8);
		apriori.buildAssociations(data);

		//
		System.out.println("Luat ket hop");
		List<AssociationRule> rule = apriori.getAssociationRules().getRules();
		for (AssociationRule ass : rule) {
			System.out.println(ass.toString());
		}
	}
}
