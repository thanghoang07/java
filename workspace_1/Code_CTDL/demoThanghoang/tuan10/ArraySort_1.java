package tuan10;

public class ArraySort_1 {
	public static <E> void bubbleSort(E[] mang) {
        for(int i =1; i< mang.length; i++){
            for(int inner = 0; inner < (mang.length - i); inner ++){
                if((((Comparable) (mang[inner])).compareTo(mang[inner+1])) > 0){
                    E tmp = mang[inner];
                    mang[inner] = mang[inner + 1];
                    mang[inner + 1] = tmp;
                }                
            }
        }
    }

    public static <E> void display(E[] unsorted) {
        for(E i : unsorted){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] unsorted = {9,8,7,6,5,4,3,2,1};
        display(unsorted);
        bubbleSort(unsorted);
        display(unsorted);
    }
}
