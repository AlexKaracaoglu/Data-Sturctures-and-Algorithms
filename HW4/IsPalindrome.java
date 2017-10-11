/* Alex Karacaoglu
 * CSCI1102 1PM
 * P2. [Stack/Queue application: Palindrome] 
 * Due October 12
 * 
 * This method makes use of stack to test whether or not a given string is a palindrome or not and returns a boolean.
 * 
 * I imported the Stack class to make use of the pop,push, and isEmpty abilities.
 * 
*/ 
import java.util.Stack;
public class IsPalindrome {
  public static boolean isPalindrome (String s){
     s = s.replaceAll("\\W", "");  //This closes all the gaps. It would make "race car" -> "racecar" or "put it up" -> "putitup". Makes it easier to check if it is a palindrome. 
    Stack<String> sStack =new Stack<String>();
    for(int i= 0; i<s.length(); i++){
      sStack.push(s.substring(i,i+1)); 
    }
    String b="";
    while(!sStack.isEmpty()){
      b = b +sStack.pop();}
    if (b.equals(s)){return true;}
    else return false;}}
