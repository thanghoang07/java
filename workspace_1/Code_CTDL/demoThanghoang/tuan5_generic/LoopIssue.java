package tuan5_generic;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
 
public class LoopIssue {
 
    public static final int BOUNDARY = 100000;
 
    public static void main(String[] args) {
        List<Integer> aList = (new LoopIssue()).getData();
        useFor(aList);
        explicitIterator(aList);
        useForEach(aList);
    }
 
    /**
     * Get data from a datasource, a simulation of real situations
     */
    public List<Integer> getData() {
        List<Integer> aList = new LinkedList();
        for (int i = 0; i < BOUNDARY; i++) {
            aList.add(i);
        }
        return aList;
    }
 
    static void useFor(List<Integer> aList) {
 
        //read the list
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }
    }
 
    static void useForEach(List<Integer> aList) {
 
        //read the list
        for (Integer i : aList) {
            System.out.println(i);
        }
    }
 
    static void explicitIterator(List<Integer> aList) {
        //read the list
        for (Iterator<Integer> it = aList.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}

