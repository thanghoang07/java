/*
    Vladimir Jimenez
    License: MIT
 */

package tuan8_1_stack;

import java.util.ArrayList;
import java.util.List;

public class Stack
{
    private List<Integer> stackArray;

    public Stack()
    {
        stackArray = new ArrayList<Integer>();
    }

    public void push(int j)
    {
        stackArray.add(0, j);
    }

    public int pop()
    {
        int popValue = stackArray.get(0);
        stackArray.remove(0);
        return popValue;
    }

    public int peek()
    {
        return stackArray.get(0);
    }

    public boolean isEmpty()
    {
        return stackArray.isEmpty();
    }

    public int size()
    {
        return stackArray.size();
    }

    public int peekN(int n)
    {
        return stackArray.get(n);
    }

    public String toString()
    {
        String stringToReturn = "";
        stringToReturn += "(top->bottom): ";

        for(int j = 0; j < size(); j++)
        {
            stringToReturn += peekN(j) + " ";
        }

        return stringToReturn.trim();
    }
}
