package CuoiKy15;

import java.util.ArrayList;
import java.util.Collections;

import junit.framework.TestCase;

public class ArtObjectTest extends TestCase {
	public void testConstructor() {
		ArtObject a1 = new Painting("The Annunciation", "Leonardo Da Vinci",
				1473, "son dau", "hien dai");
		ArtObject a2 = new Painting("The Baptism of Christ",
				"Leonardo Da Vinci", 1476, "son dau", "co dien");
		ArtObject a3 = new Painting("Madonna of the Carnation",
				"Leonardo Da Vinci", 1475, "son dau", "hien dai");
		ArtObject a4 = new Painting("Text of the original cherry",
				"Vincent Vangogh", 0, "son dau", "co dien");
		ArtObject a5 = new Painting("Botero beat oil painting", "Botero", 0,
				"son dau", " co dien");
//		ArtObject a6 = new Painting("The Annunciation", "Leonardo Da Vinci", 1473, "son dau", "hien dai");

		ArrayList<ArtObject> array = new ArrayList<ArtObject>();
		array.add(a1);
		array.add(a2);
		array.add(a3);
		array.add(a4);
		array.add(a5);
//		array.add(a6);
		
		Collections.sort(array);
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
