package tuan14_1;

import java.util.*;

public class TreeSetDemo {
	 
    public static void main( String []args) {
        LinkedHashSet<String> objTree = new LinkedHashSet<String>();
        objTree.add("beta");
        objTree.add("gama");
        objTree.add("tera");
        objTree.add("alpha");
        objTree.add("penta");
        objTree.add("alpha");
        System.out.println("Automatically sorted contents of the Tree : \n" + objTree);
    }

}
