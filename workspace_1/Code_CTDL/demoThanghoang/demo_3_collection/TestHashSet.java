/*Lớp HashSet trong Java kế thừa AbstractSet và triển khai Set Interface.
Nó tạo một collection mà sử dụng một hash table để lưu giữ.

Một hash table lưu giữ thông tin bởi sử dụng một kỹ thuật được gọi là hashing. 
Trong hashing, nội dung mang tính thông tin của một key được sử dụng để quyết định một value duy nhất,
được gọi là hash code của nó.

Hash code sau đó được sử dụng như là index, tại đó dữ liệu mà liên kết với key được lưu giữ.
Phép biến đổi của key vào trong hash code của nó được thực hiện tự động.
*/
package demo_3_collection;

import java.util.*;


public class TestHashSet 
{
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("XYZ");
		hs.add("B");
		hs.add("A");
		
		System.out.println("HashSet content:");
		
		for (Iterator<String> i = hs.iterator(); i.hasNext();)
		{
			System.out.println(i.next());
		}
	}
}
