package onTap;

import java.io.IOException;

public class ATest {

	public static void main(String[] args) throws IOException {
		// String source1 = "E:\\thanghoang\\test.txt";
		// String dest1 = "D:\\LTM\\testB.txt";

		// System.out.println(source1);
		// System.out.println(dest1);
		// new CopyFile().copyDetailFile(source1, dest1 + 1);
		// new CloneCopyFile().copyFile(source1, dest1 + 2);
		// System.out.println(new CloneCopyFile1().copyFile(source1, dest1 + 3));

		// String source2 = "E:\\thanghoang";
		// String dest2 = "D:\\LTM";

		// System.out.println(source2);
		// System.out.println(dest2);
		// new CopyFolder().copyFolder(source2, dest2);
		// new CloneCopyFolder2().copyFolder(source2, dest2);

		// String source3 = "E:\\thanghoang\\test.txt";
		// String dest3 = "D:\\LTM\\abc\\";
		// new SplitFile().splitFile2(source3, dest3);
		// System.out.println(new SplitFile().splitFile(source3, dest3));
		// System.out.println(new SplitFile().splitFile2(source3, dest3, 5));

		// String source4 = "D:\\LTM\\abc\\test.txt1";
		// String dest4 = "D:\\LTM\\test.txt";
		// new JoinFile().joinFile(source4, dest4, 15);
		// String source5 = "D:\\LTM\\abc";
		// String dest5 = "D:\\LTM\\testJ2.txt";
		// new JoinFile().joinFile2(source5, dest5);

		String source6 = "D:\\LTM\\abc";
		String dest6 = "D:\\LTM\\abcd2.pack";
		// String dest6_1 = "D:\\LTM\\";
		new ClonePack().pack(source6, dest6);

		// new Unpack().unpack(dest6, "test.txt10", dest6_1);
	}

}
