package lab7;

public class Bai1 {
	public static void main(String[] args) {
		
		long start = 0, stop = 0, elapsed = 0;
		
		ArraySort<Integer> mangInt = new ArraySort<>(1000);
		ArraySort<Double> mangDou = new ArraySort<>(1000);
		ArraySort<String> mangStr = new ArraySort<>(1000);
		ArraySort<Character> mangCha = new ArraySort<>(1000);

		System.out.println("=====Bubble Sort=====\n" 
						+ "-----------Integer-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt + "\nChen phan tu vao mang: ");
		
		mangInt.intsert(0);
		mangInt.intsert(6);
		mangInt.intsert(8);
		mangInt.intsert(2);
		mangInt.intsert(1);
		
		System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangInt + "\nSap xep: ");
		
		start = System.nanoTime();
		mangInt.bubbleSortNew();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangInt + "\nThoi gian sap xep bubble sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangInt.clear();
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Double-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou + "\nChen phan tu vao mang: ");
		
		mangDou.intsert(1.0);
		mangDou.intsert(1.4);
		mangDou.intsert(9.5);
		mangDou.intsert(3.42);
		mangDou.intsert(5.8);
		
		System.out.print(mangDou.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangDou + "\nSap xep: ");
		
		start = System.nanoTime();
		mangDou.bubbleSortNew();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangDou + "\nThoi gian sap xep bubble sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangDou.clear();
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------String-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr + "\nChen phan tu vao mang: ");
		
		mangStr.intsert("Thang");		
		mangStr.intsert("Toan");	
		mangStr.intsert("Huy");		
		mangStr.intsert("Trinh");	
		mangStr.intsert("Vo");
		
		System.out.print(mangStr.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangStr + "\nSap xep: ");
		
		start = System.nanoTime();
		mangStr.bubbleSortNew();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangStr + "\nThoi gian sap xep bubble sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangStr.clear();
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Character-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha + "\nChen phan tu vao mang: ");
		
		mangCha.intsert('B');
		mangCha.intsert('A');
		mangCha.intsert('a');
		mangCha.intsert('L');
		mangCha.intsert('l');
		
		System.out.print(mangCha.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangCha + "\nSap xep: ");
		
		start = System.nanoTime();
		mangCha.bubbleSortNew();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangCha + "\nThoi gian sap xep bubble sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangCha.clear();
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha.toString());
		start = 0; stop = 0; elapsed = 0;
		//////////////////////////////////////////////////
		System.out.println("=====Selection Sort=====\n" 
						+ "-----------Integer-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt + "\nChen phan tu vao mang: ");
		
		mangInt.intsert(0);
		mangInt.intsert(6);
		mangInt.intsert(8);
		mangInt.intsert(2);
		mangInt.intsert(1);
		
		System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangInt + "\nSap xep: ");
		
		start = System.nanoTime();
		mangInt.selectionSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangInt + "\nThoi gian sap xep selection sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangInt.clear();
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Double-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou + "\nChen phan tu vao mang: ");
		
		mangDou.intsert(5.612343);
		mangDou.intsert(29.43331);
		mangDou.intsert(29.52344);
		mangDou.intsert(120.673);
		mangDou.intsert(0.68889);
		
		System.out.print(mangDou.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangDou + "\nSap xep: ");
		
		start = System.nanoTime();
		mangDou.selectionSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangDou+ "\nThoi gian sap xep selection sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangDou.clear();
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------String-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr + "\nChen phan tu vao mang: ");
		
		mangStr.intsert("Thang");
		mangStr.intsert("Toan");
		mangStr.intsert("Huy");
		mangStr.intsert("Trinh");	
		mangStr.intsert("Vo");
		
		System.out.print(mangStr.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangStr + "\nSap xep: ");
		
		start = System.nanoTime();
		mangStr.selectionSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangStr + "\nThoi gian sap xep selection sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangStr.clear();
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Character-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha + "\nChen phan tu vao mang: ");
		
		mangCha.intsert('p');
		mangCha.intsert('Y');
		mangCha.intsert('s');
		mangCha.intsert('o');
		mangCha.intsert('g');
		
		System.out.print(mangCha.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangCha + "\nSap xep: ");
		
		start = System.nanoTime();
		mangCha.selectionSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangCha + "\nThoi gian sap xep selection sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangCha.clear();
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha.toString());
		start = 0; stop = 0; elapsed = 0;
		//////////////////////////////////////////////////
		System.out.println("=====Insertion Sort=====\n" 
						+ "-----------Integer-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt + "\nChen phan tu vao mang: ");
		
		mangInt.intsert(4233);
		mangInt.intsert(7);
		mangInt.intsert(0000000);
		mangInt.intsert(8);
		mangInt.intsert(2222);
		
		System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangInt + "\nSap xep: ");
		
		start = System.nanoTime();
		mangInt.insertionSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangInt + "\nThoi gian sap xep insertion sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangInt.clear();
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Double-----------\n" + "Kiem tra mang co rong khong: ");
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou + "\nChen phan tu vao mang: ");
		
		mangDou.intsert(5.612343);
		mangDou.intsert(29.43331);
		mangDou.intsert(29.52344);
		mangDou.intsert(120.673);
		mangDou.intsert(0.68889);
		
		System.out.print(mangDou.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangDou + "\nSap xep: ");
		
		start = System.nanoTime();
		mangDou.insertionSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangDou + "\nThoi gian sap xep insertion sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangDou.clear();
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------String-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr + "\nChen phan tu vao mang: ");
		
		mangStr.intsert("Thang");
		mangStr.intsert("Hoang");
		mangStr.intsert("Toan");
		mangStr.intsert("Huy");		
		mangStr.intsert("Vo");
		
		System.out.print(mangStr.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangStr + "\nSap xep: ");
		
		start = System.nanoTime();
		mangStr.insertionSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangStr + "\nThoi gian sap xep insertion sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangStr.clear();
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Character-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha + "\nChen phan tu vao mang: ");
		
		mangCha.intsert('D');
		mangCha.intsert('R');
		mangCha.intsert('e');
		mangCha.intsert('w');
		mangCha.intsert('q');
		
		System.out.print(mangCha.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangCha + "\nSap xep: ");
		
		start = System.nanoTime();
		mangCha.insertionSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangCha + "\nThoi gian sap xep insertion sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangCha.clear();
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha.toString());
		start = 0; stop = 0; elapsed = 0;
		////////////////////////////////////////////////////
		System.out.println("=====Quick Sort=====\n" 
						+ "-----------Integer-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt + "\nChen phan tu vao mang: ");
		
		mangInt.intsert(0);
		mangInt.intsert(6);
		mangInt.intsert(8);
		mangInt.intsert(2);
		mangInt.intsert(1);
		
		System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangInt + "\nSap xep: ");
		
		start = System.nanoTime();
		mangInt.quickSort(0, 4);
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangInt + "\nThoi gian sap xep quick sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangInt.clear();
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Double-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou + "\nChen phan tu vao mang: ");
		
		mangDou.intsert(5.612343);
		mangDou.intsert(29.43331);
		mangDou.intsert(29.52344);
		mangDou.intsert(120.673);
		mangDou.intsert(0.68889);
		
		System.out.print(mangDou.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangDou + "\nSap xep: ");
		
		start = System.nanoTime();
		mangDou.quickSort(0, 4);
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangDou + "\nThoi gian sap xep quick sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangDou.clear();
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------String-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr + "\nChen phan tu vao mang: ");
		
		mangStr.intsert("Thang");
		mangStr.intsert("Hoang");
		mangStr.intsert("Toan");
		mangStr.intsert("Huy");
		mangStr.intsert("Trinh");
		
		System.out.print(mangStr.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangStr + "\nSap xep: ");
		
		start = System.nanoTime();
		mangStr.quickSort(0, 4);
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangStr + "\nThoi gian sap xep quick sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangStr.clear();
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Character-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha + "\nChen phan tu vao mang: ");	
		
		mangCha.intsert('B');
		mangCha.intsert('A');
		mangCha.intsert('e');
		mangCha.intsert('w');
		mangCha.intsert('q');
		
		System.out.print(mangCha.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangCha + "\nSap xep: ");
		
		start = System.nanoTime();
		mangCha.quickSort(0, 4);
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangCha + "\nThoi gian sap xep quick sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangCha.clear();
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha.toString());
		start = 0; stop = 0; elapsed = 0;
		//////////////////////////////////////////////////
		System.out.println("=====Merge Sort=====\n" 
						+ "-----------Integer-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt + "\nChen phan tu vao mang: ");
		
		mangInt.intsert(4233);
		mangInt.intsert(7);
		mangInt.intsert(0000000);
		mangInt.intsert(8);
		mangInt.intsert(2222);
		
		System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangInt + "\nSap xep: ");
		
		start = System.nanoTime();
		mangInt.mergeSort(0, 4);
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangInt + "\nThoi gian sap xep merge sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangInt.clear();
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Double-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou + "\nChen phan tu vao mang: ");	
		
		mangDou.intsert(1.12344);
		mangDou.intsert(99.5432);
		mangDou.intsert(43.43241);
		mangDou.intsert(5.8234);
		mangDou.intsert(5.612343);
		
		System.out.print(mangDou.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangDou + "\nSap xep: ");
		
		start = System.nanoTime();
		mangDou.mergeSort(0, 4);
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangDou + "\nThoi gian sap xep merge sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangDou.clear();
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------String-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr + "\nChen phan tu vao mang: ");
		
		mangStr.intsert("Thang");
		mangStr.intsert("Toan");
		mangStr.intsert("Duc");
		mangStr.intsert("Huy");
		mangStr.intsert("Van");
		
		System.out.print(mangStr.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangStr + "\nSap xep: ");
		
		start = System.nanoTime();
		mangStr.mergeSort(0, 4);
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangStr + "\nThoi gian sap xep merge sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangStr.clear();
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr.toString());
		start = 0; stop = 0; elapsed = 0;
		//
		System.out.println("-----------Character-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha + "\nChen phan tu vao mang: ");

		mangCha.intsert('J');
		mangCha.intsert('H');
		mangCha.intsert('D');
		mangCha.intsert('R');
		mangCha.intsert('e');
		
		System.out.print(mangCha.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangCha + "\nSap xep: ");
		
		start = System.nanoTime();
		mangCha.mergeSort(0, 4);
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println(mangCha + "\nThoi gian sap xep merge sort la: " + elapsed + " nanoseconds." + "\nXoa mang vua tao: ");
		mangCha.clear();
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha.toString());
		start = 0; stop = 0; elapsed = 0;
	}
}
