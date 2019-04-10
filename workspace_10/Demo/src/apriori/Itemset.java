package apriori;

import java.util.ArrayList;
import java.util.List;

public class Itemset implements Comparable<Itemset> {
	private List<Integer> listItem = null;
	private double support;

	public double getSupport() {
		return support;
	}

	public void setSupport(double support) {
		this.support = support;
	}

	public Itemset() {
		super();
	}

	public Itemset(List<Integer> listItem, double support) {
		super();
		this.listItem = listItem;
		this.support = support;
	}

	public List<Integer> getItemset() {
		return listItem;
	}

	public void setListItem(List<Integer> listItem) {
		this.listItem = listItem;
	}

	public Itemset(List<Integer> I) {
		this.listItem = I;
		support = 0;
	}

	public boolean equal(Object object) {
		Itemset itemset = (Itemset) object;
		if (listItem.size() != itemset.listItem.size()) {
			return false;
		}
		for (int i = 0; i < listItem.size(); i++) {
			if (!(listItem.contains(itemset.listItem.get(i)))) {
				return false;
			}
		}
		return true;
	}

	public int lastItem() {
		return listItem.get(listItem.size() - 1);
	}

	// bỏ phần tử cuối và trả về Itemset
	public Itemset getLastItem() {
		List<Integer> mtp = new ArrayList<Integer>();
		for (int i = 0; i < listItem.size() - 1; i++) {
			mtp.add(listItem.get(listItem.size() - 1));
		}
		return new Itemset(mtp);
	}

	public Itemset prefix() {
		List<Integer> mtp = new ArrayList<Integer>();
		for (int i = 0; i < listItem.size() - 1; i++) {
			mtp.add(listItem.get(i));
		}
		return new Itemset(mtp);
	}

	public Itemset addItem(Itemset itemset) {

		return null;
	}

	public void updateMinSuppor(double values) {
		support = support + values;
	}

	@Override
	public int compareTo(Itemset o) {
		Itemset i = (Itemset) o;
		int value = this.lastItem() - i.lastItem();
		if (value > 0) {
			return value;
		}
		return value;
	}
}
