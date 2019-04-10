package demo_3_collection;
//dung foreach
import java.util.*;

public class TestCollection2
{
	public static void main(String args[])
	{
		//tao mot mang danh sach
		ArrayList<String> aL = new ArrayList<String>();
		aL.add("Nguoi thu nhat");
		aL.add("Nguoi thu hai");
		aL.add("Nguoi thu ba");
		aL.add("Nguoi thu tu");
		//
		for (String obj : aL)
			System.out.println(obj);
	}
}
