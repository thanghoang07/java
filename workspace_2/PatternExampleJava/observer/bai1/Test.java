package bai1;

public class Test {
	public static void main(String[] args) {
		Blog bl = new Blog();
		Use u1 = new Use();
		Use u2 = new Use();
		Use u3 = new Use();
		// dang ky 
		bl.registerObserver(u1);
		bl.registerObserver(u2);
		//bl.registerObserver(u3);
		
		u1.setSubject(bl);
		u2.setSubject(bl);
		//u3.setSubject(bl);
		
		System.out.println("1" + u1.getArticle());
		bl.postNewArticle();
		System.out.println(u1.getArticle());
		
		bl.unRegisterObserver(u2);
		
		System.out.println("2" + u1.getArticle());
		bl.postNewArticle();
		System.out.println(u1.getArticle());
	}
}
