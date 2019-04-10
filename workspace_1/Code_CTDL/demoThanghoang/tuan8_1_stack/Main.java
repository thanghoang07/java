/*
    Vladimir Jimenez
    License: MIT
 */

package tuan8_1_stack;

import java.io.File;

public class Main
{
    public static void main (String[] args)
    {
        PostFixEvaluator test = new PostFixEvaluator(new File("C:\\Users\\allejo\\Downloads\\PostFix\\src\\sample"));
        test.printToFile();
    }
}
