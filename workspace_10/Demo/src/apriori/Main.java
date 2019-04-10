package apriori;

public class Main {

	@SuppressWarnings("unused")
	private static Apriori apriori;

	public static void main(String[] args) {
		Data data = new Data();
		Itemset itemset = new Itemset();
		
		apriori = new Apriori(data, itemset);
	}

}