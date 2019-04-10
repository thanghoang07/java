import java.util.List;

import weka.associations.AssociationRule;
import weka.associations.FPGrowth;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class DemoFPFGrowth {

	public static void main(String[] args) throws Exception {
		System.out.println("aaaa");
		
		Instances data;
		data = DataSource.read("E:\\data\\supermarket2.arff");
		
		FPGrowth apriori = new FPGrowth();
		apriori.setLowerBoundMinSupport(0.2);
		apriori.setMinMetric(0.8);
		apriori.buildAssociations(data);
		
		List<AssociationRule> rule = apriori.getAssociationRules().getRules();
		for (AssociationRule ass : rule) {
			System.out.println(ass.toString());
		}
	}

}
