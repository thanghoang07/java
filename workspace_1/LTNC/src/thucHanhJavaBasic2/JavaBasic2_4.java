package thucHanhJavaBasic2;

import java.util.Scanner;

public class JavaBasic2_4 {
	public static void main(String[] args) {
//		scanner 
		Scanner input = new Scanner(System.in);
		System.out.println("giai he phuong trinh");
//		nhap he so a
		System.out.print("nhap he so a");
		int soA = input.nextInt();
//		nhap he so b
		System.out.print("nhap he so b");
		int soB = input.nextInt();
//		nhap he so a
		System.out.print("nhap he so c");
		int soC = input.nextInt();
//		tinh denta, soX
//		double soX = ((-soC)/soB); 
//		double soDenta = soB*soB - 4*soA*soC;
//		double soX1= ((-soB)-Math.sqrt(soDenta)/(2*soA));
//		double soX2= ((-soB)+Math.sqrt(soDenta)/(2*soA));
//		double soX3= ((-soB)/(2*soA));
//		nghiem phuong trinh
//		a bang khong, b bang khong
		if(soA == 0 && soB ==0)
			System.out.println("ta co phuong tring co vo so nghiem");
		
//		a bang khong
		if(soA == 0)
			System.out.println("ta co phuong trinh: "+soB+"x + " +soC+" = 0"+ " va nghiem cua phuong trinh x: "+(-soC)/soB );
//		a khac khong
		else{
			if(soB*soB - 4*soA*soC > 0 )
				System.out.println("ta co phuong trinh: "+soA+"x^2 + " +soB+"x + " +soC+" = 0"+ " va phuong trinh co hai nghiem x la :"
						+ " "+((-soB)-Math.sqrt(soB*soB - 4*soA*soC)/(2*soA))+"va" +((-soB)+Math.sqrt(soB*soB - 4*soA*soC)/(2*soA)));
			if(soB*soB - 4*soA*soC < 0 )
				System.out.println("ta co phuong trinh: "+soA+"x^2 + " +soB+"x + " +soC+" = 0"+ "va phuong trinh vo nghiem");
			if(soB*soB - 4*soA*soC == 0)
				System.out.println("ta co phuong trinh: "+soA+"x^2 + " +soB+"x + " +soC+" = 0"+ " va phuong trinh co  nghiem x la : "+((-soB)/(2*soA)));
			
			}
	}
}
