package LTNC_12072012;

import java.util.*;

import junit.framework.TestCase;

public class DaiLyTest extends TestCase {
	public void testConstructor() {
		DaiLy d1 = new Car("Xe du lich Civic", 2010, 28000, new Manufactor("hang Honda", "Japan"), 4, 200, 13);
		DaiLy d2 = new Bus("Xe khach Hiace", 2011, 35000, new Manufactor("hang Toyota", "Japan"), 12);
		DaiLy d3 = new Truck("Xe tai MIGHTY", 2010, 18000, new Manufactor("hang Huyndai", "Korea"), 2.5);
		DaiLy d4 = new Truck("Xe tai MIGHTY", 2010, 18000, new Manufactor("hang Huyndai", "Korea"), 2.5);
		DaiLy d5 = new Bus("Xe khach Hiace", 2011, 35000, new Manufactor("hang Toyota", "Japan"), 12);
		DaiLy d6 = new Car("Xe du lich Civic", 2010, 28000, new Manufactor("hang Honda", "Japan"), 4, 200, 13);
		DaiLy d7 = new Truck("Xe tai MIGHTY", 2010, 18000, new Manufactor("hang Huyndai", "Korea"), 2.5);
		DaiLy d8 = new Car("Xe du lich Civic", 2010, 28000, new Manufactor("hang Honda", "Japan"), 4, 200, 13);
		DaiLy d9 = new Bus("Xe khach Hiace", 2011, 35000, new Manufactor("hang Toyota", "Japan"), 12);
		DaiLy d10 = new Car("Xe du lich Civic", 2010, 28000, new Manufactor("hang Honda", "Japan"), 4, 200, 13);

		assertEquals(d1.khuyenMai(), 28000, 0.1);
		assertEquals(d2.khuyenMai(), 34000, 0.1);
		assertEquals(d3.khuyenMai(), 180, 0.1);

		ArrayList<DaiLy> array = new ArrayList<DaiLy>();
		array.add(d1);
		array.add(d2);
		array.add(d3);
		array.add(d4);
		array.add(d5);
		array.add(d6);
		array.add(d7);
		array.add(d8);
		array.add(d9);
		array.add(d10);

		Collections.sort(array);

		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
