package tuan8_2_stack;
import java.util.Scanner;

import tuan8_stack.ArrayStack;

/**
 *
 * @author ACHCHUTHAN
 */
public class Infix2Postfix extends ArrayStack<Integer> {

    public Infix2Postfix(int x) {
        super(x);
    }

    /**
     *@return postfixString value
     */
   
    public String InToPost(String infixString) {
        String postfixString = " ";

        for (int index = 0; index < infixString.length(); ++index) {
            char chValue = infixString.charAt(index);
            if (chValue == '(') {
                push((int) '(');
            } else if (chValue == ')') {
                Integer oper = peek();
                while (!(oper.equals('(')) && !(isEmpty())) {
                    postfixString += oper.intValue();
                    pop();
                    oper = peek();
                }
                pop();
            } else if (chValue == '+' || chValue == '-') {
                //Stack is empty
                if (isEmpty()) {
                    push((int) chValue);
                    //current Stack is not empty
                } else {
                    Integer oper = peek();
                    while (!(isEmpty() || oper.equals(new Character('(')) || oper.equals(new Character(')')))) {
                        pop();
                        postfixString += oper.intValue();
                    }
                    push((int) chValue);
                }
            } else if (chValue == '*' || chValue == '/') {
                if (isEmpty()) {
                    push((int) chValue);
                } else {
                    Integer oper = peek();
                    while (!oper.equals(new Character('+')) && !oper.equals(new Character('-')) && !isEmpty()) {
                        pop();
                        postfixString += oper.intValue();
                    }
                    push((int) chValue);
                }
            } else {
                postfixString += chValue;
            }
        }
        while (!isEmpty()) {
            Integer oper = peek();
            if (!oper.equals(new Character('('))) {
                pop();
                postfixString += oper.intValue();
            }
        }
        return postfixString;
    }

    public static void main(String[] args) {
        Infix2Postfix mystack = new Infix2Postfix(10);
        System.out.println("Type in an expression like (1+2)*(3+4)/(12-5)\n "
                + "with no monadic operators like in-5 or +5 followed by key");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("The Expression you have typed in infix form :\n"+str);
        System.out.println("The Equivalent Postfix Expression is :\n"+mystack.InToPost(str));
    }
}
