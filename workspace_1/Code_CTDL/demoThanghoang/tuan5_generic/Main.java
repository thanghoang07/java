package tuan5_generic;

public class Main
{
	public static void main(String[] args)
	{
		MyList t = new MyList();
		t.themVaoPhanTuDau(1);
		t.themVaoPhanTuCuoi(2);
		t.themVaoPhanTuCuoi(3);
		t.themVaoPhanTuCuoi(4);
		t.themVaoPhanTuCuoi(5);
		t.themVaoPhanTuCuoi(6);
		t.themVaoPhanTuCuoi(7);
		t.themVaoPhanTuCuoi(8);
		t.themVaoPhanTuCuoi(9);
		t.themVaoPhanTuCuoi(0);

		System.out.println(t);
		System.out.print(t.count());
		
		t.xoaPhanTuBatKy(2);
		t.xoaPhanTuDau();
		t.deleteLast();
		t.traverse();

		System.out.println();
		System.out.println(t.count());
	}
}
