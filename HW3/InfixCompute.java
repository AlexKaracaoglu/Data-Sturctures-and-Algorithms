/* Alex Karacaoglu
 * CSCI1102 1PM
 * P1. [Stack application: infix arithmetic expression without fully parenthesis] 
 * Due September 28
 * 
 * This program takes in an infix expression that is a string that does not have full parentheses and computes
 * its value according to the order of operations. As stated by professor Yang, all inputs are to be started with a 
 * left parenthese and ended with a right. The parentheses however, in the middle do not need to be balanced and order 
 * of operations is to be performed.
 * 
 * I imported the Stack class.
*/
import java.util.Stack;
public class InfixCompute {

  static int precedenceLevel(String op) {
    switch (op) {
        case "+":
        case "-":
            return 1;
        case "*":
        case "/":
            return 2;
        case "^":
          return 3;  }
   return 0; }

public static boolean isPreceded (String a, String b){
    if (precedenceLevel(a) <= precedenceLevel(b))
      return true;
    else {return false;}
}
 public static boolean isNumber (String s){
   if ((!s.equals("(")) &&
      (!s.equals(")")) &&
      (!s.equals("+")) &&
      (!s.equals("-")) &&
      (!s.equals("*")) &&
      (!s.equals("/")) &&
      (!s.equals("^"))) return true; 
    
    else {return false;}}
  
  public static void main(String[] args) { 
    Stack<String> ops  = new Stack<String>();     
    Stack<Double> vals = new Stack<Double>(); 
    while (!StdIn.isEmpty()) {           
          String token = StdIn.readString(); 
      if (isNumber(token)) vals.push(Double.parseDouble(token));
      
      else if (token.equals("(")) ops.push(token);
         
       else if (token.equals(")")) {
         while (!ops.peek().equals("(")){
           double v = vals.pop();
           String op = ops.pop();
           if (op.equals("+"))    v = vals.pop() + v;              
               else if (op.equals("-"))    v = vals.pop() - v;    
               else if (op.equals("*"))    v = vals.pop() * v;               
               else if (op.equals("/"))    v = vals.pop() / v;  
               else if (op.equals("^"))    v= Math.pow(vals.pop(), v); 
               vals.push(v); }
       ops.pop();}
           
       else if ((token.equals("+")) || (token.equals("-")) || (token.equals("*")) || (token.equals("/")) || (token.equals("^"))) {
               if ((!ops.peek().equals("(")) && isPreceded(token, ops.peek()))  {
              double v= vals.pop();
              String op = ops.pop();   
              if      (op.equals("+"))    v = vals.pop() + v;              
               else if (op.equals("-"))    v = vals.pop() - v;    
               else if (op.equals("*"))    v = vals.pop() * v;               
               else if (op.equals("/"))    v = vals.pop() / v;  
               else if (op.equals("^"))    v= Math.pow(vals.pop(), v); 
              vals.push(v); 
              ops.push(token);}
              else {ops.push(token);}}}
   
    StdOut.println(vals.pop());
    }}
                 
        
