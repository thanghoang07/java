package apriori;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Apriori {
	Data dao;
	Itemset item;
	List<List<Integer>> trans;

	public Apriori(Data dao, Itemset item) {
		this.dao = dao;
		this.item = item;
		//
		trans = dao.transection;
		List<Itemset> i = getListItem();
		sortItemset(i);
		//
		System.out.println("tap pho bien mot phan tu: \n Item" + "\t" + "sup");
		for (int j = 0; j < i.size(); j++) {
			System.out.println(i.get(j).getItemset() + "\t" + i.get(j).getSupport());
		}
		// xoa cac phan tu co sup<minsup
		tapPhoBien(i, 2);
		//
		System.out.println("tap pho bien mot phan tu co sup >= minsup(tap pho bien): \n Item" + "\t" + "sup");
		for (int j = 0; j < i.size(); j++) {
			System.out.println(i.get(j).getItemset() + "\t" + i.get(j).getSupport());
		}

		//
		List<List<Itemset>> l = new ArrayList<>();
		l.add(i);
		List<Itemset> ck = new ArrayList<>();
		for (int j = 1; !l.get(j - 1).isEmpty(); j++) {
			ck = aprioriGen(l.get(j - 1));
			sortItemset(ck);
			countSupport(ck, 2);
			//System.out.println(ck);
			l.add(ck);
		}
		if (l.isEmpty()) {
			System.out.println("loi");
		} else {
			System.out.println("tap pho bien");
			System.out.println(l);
		}
	}

	// kiem tra itemset co trong itemset chua va lay tap pho bien mot phan tu
	public List<Itemset> getListItem() {
		List<Itemset> list = new ArrayList<Itemset>();
		for (int i = 0; i < trans.size(); i++) {
			for (int j = 0; j < trans.get(i).size(); j++) {
				List<Integer> item = new ArrayList<>();
				item.add(trans.get(i).get(j));
				Itemset itemset = new Itemset(item, 1);
				list.add(itemset);
			}
		}
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getItemset().equals(list.get(j).getItemset())) {
					list.remove(j);
					list.get(i).updateMinSuppor(1);
				}
			}
		}
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getItemset().equals(list.get(j).getItemset())) {
					list.remove(j);
					list.get(i).updateMinSuppor(1);
				}
			}
		}
		return list;
	}

	// sap xep ds itemset
	public void sortItemset(List<Itemset> listItem) {
		Collections.sort(listItem);
	}

	// loai bo tap ung vien be hon minsupport
	public List<Itemset> tapPhoBien(List<Itemset> list, double minsupport) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSupport() < minsupport) {
				list.remove(i);
			}
		}
		return list;

	}

	public List<Itemset> countSupport(List<Itemset> c, double minsupport) {
		for (int i = 0; i < trans.size(); i++) {
			for (int j = 0; j < c.size(); j++) {
				int count = 0;
				for (int j2 = 0; j2 < c.get(j).getItemset().size(); j2++) {
					if (trans.get(i).contains(c.get(j).getItemset().get(j2))) {
						count++;
					}
					if (count == c.get(j).getItemset().size()) {
						c.get(j).updateMinSuppor(1);
					}
				}

			}
		}
		tapPhoBien(c, minsupport);
		return c;
	}

	// tìm tập ứng viên ck
	public List<Itemset> aprioriGen(List<Itemset> arrayList) {
		List<Itemset> ck = new ArrayList<Itemset>();
		int tmp = 0;
		Itemset c = new Itemset();
		for (int l1 = 0; l1 < arrayList.size(); l1++) {
			for (int l2 = l1 + 1; l2 < arrayList.size(); l2++) {
				// so sanh cac item dau va cuoi cua l1 va l2
				if (arrayList.get(l1).prefix().equal(arrayList.get(l2).prefix())
						&& (arrayList.get(l1).getLastItem().equal(arrayList.get(l2).getLastItem()))) {
					// so sanh phan tu cuoi l1 voi l2
					if (arrayList.get(l1).lastItem() <= arrayList.get(l2).lastItem()) {
						// lay phan tu cuoi cua l2
						tmp = arrayList.get(l2).lastItem();
					} else if (arrayList.get(l1).lastItem() > arrayList.get(l2).lastItem()) {
						// lay phan tu cuoi cua l2
						tmp = arrayList.get(l2).lastItem();
					}
					// phat sinh tập ứng viên
					ArrayList<Integer> candidate = new ArrayList<Integer>();
					// them cac item vao tap ung vien
					candidate.addAll(arrayList.get(l1).getItemset());
					// candidate.add(arrayList.get(l2).lastItem());
					candidate.add(tmp);
					// gan lai
					c.setListItem(candidate);
					// nếu phổ biến thì thêm vào (tỉa)
					if (!hasInfrequentSubset(c, arrayList)) {
						ck.add(c);
						sortItemset(ck);
					}
				}
			}
		}
		return ck;
	}

	// tìm tập con không phổ biến
	public boolean hasInfrequentSubset(Itemset c, List<Itemset> arrayList) {
		// lấy tập con phổ biến (k - 1)
		List<Itemset> s = getSubSet(c);
		//
		for (Itemset i : s) {
			for (int j = 0; j < arrayList.size(); j++) {
				if (!(i.equal(arrayList.get(j)))) {
					return false;
				}
			}
		}
		return true;
	}

	private List<Itemset> getSubSet(Itemset itemSet) {
		List<Itemset> subSet = new ArrayList<Itemset>();
		ArrayList<Integer> listItem = (ArrayList<Integer>) itemSet.getItemset();
		// lay tung phan tu
		for (int i = 0; i < listItem.size(); i++) {
			ArrayList<Integer> a = new ArrayList<>();
			a.add(listItem.get(i));
			subSet.add(new Itemset(a, 0));
			int k = i;
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			while (k != listItem.size()) {
				tmp.add(listItem.get(k));
				// chi ket hop voi nhung phan tu ke tiep
				for (int j = i + tmp.size(); j < listItem.size(); j++) {
					ArrayList<Integer> subTMP = new ArrayList<Integer>();
					subTMP.addAll(tmp);
					subTMP.add(listItem.get(j));
					subSet.add(new Itemset(subTMP, 0));
				}
				k++;
			}
		}
		return subSet;
	}

}
