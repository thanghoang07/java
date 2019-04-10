/*Lớp LinkedHashSet trong Java kế thừa HashSet.

Lớp LinkedHashSet duy trì một linked list của các entry trong Set, theo thứ tự chúng đã được chèn.
Điều này cho phép tính lặp lại theo thứ tự chèn qua Set đó.

Đó là, khi tuần hoàn qua một LinkedHashSet bởi sử dụng một Iterator,
các phần tử sẽ được trả về theo thứ tự như khi chúng đã được chèn.

Hash code sau đó được sử dụng như là index, tại đó dữ liệu mà được liên kết với key đã được lưu trữ.
Phép biến đổi của key này vào trong hash code được thực hiện tự động.
*/
package demo_3_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("XYZ");
		lhs.add("A");
		lhs.add("B");
	
		System.out.println("LinkedHashSet content: ");
		
		for(Iterator<String> i = lhs.iterator(); i.hasNext();)
		{
			System.out.println(i.next());
		}
	}
}
