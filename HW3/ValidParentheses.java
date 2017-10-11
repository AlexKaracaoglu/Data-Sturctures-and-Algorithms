/* Alex Karacaoglu
 * CSCI1102 1PM
 * P3.  Extra Credits: 20 [Stack application: valid string]  
 * Due September 28
 *
 * This program uses a scanner to take in a string of brackets, parentheses, and curly brackets. It then checks to make
 * sure that they are place in an order that is in proper order.
 *
 * I imported that Stack class
 * I imported the Scanner class
*/

import java.util.Stack;
import java.util.Scanner;
public class ValidParentheses {
 public static boolean isStringValid(String str) {
    Stack<Character> stack = new Stack<Character>();
    char c;
    for(int i=0; i < str.length(); i++) {
        c = str.charAt(i);

        if(c == '(')
            stack.push(c);
        else if(c == '{')
            stack.push(c);
        else if(c == '[')
                  stack.push(c);
        else if(c == ')')
            if(stack.empty())
                return false;
            else if(stack.peek() == '(')
                stack.pop();
            else
                return false;
        else if(c == '}')
            if(stack.empty())
                return false;
            else if(stack.peek() == '{')
                stack.pop();
            else
                return false;
        else if(c == ']')
            if(stack.empty())
                return false;
            else if(stack.peek() == '[')
                stack.pop();
            else
                return false;
    }
    return stack.empty();
 }
public static void main(String[] args) {
  String s;
   Scanner sc = new Scanner(System.in);
   s = sc.next();
   System.out.println(isStringValid(s));
}

}
