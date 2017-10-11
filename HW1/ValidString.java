/*Alex Karacaoglu
 * CSCI 1102 
 * Assignment 1: Number 4
 * [Strings; Methods]
 * Due September 16
 * 
 * I used three methods in this program. I used the main method, count, and isValid. I used count as a way to count the
 * amount of each of the characters used in the string. Then I used isValid to compare the insances of of the open vs
 * closed parentheses, brackets, and braces. In the main method I input some string s and then print whether the string
 * when comparing the 6 different type of characters is valid. 
 * 
 * Upon speaking to the professor, she informed me that indeed ")(" is considered valid and so is "([)]". By
 * making these valid, it is almost as if she told us to think of the problem as counting the number of each particular
 * character and comparing it to the number of its counterpart. If they are ALL equal then we shall return true, else 
 * false. 
*/
public class ValidString {
  public static int count (String s, char c){
    int counter = 0;
    for (int i=0; i < s.length(); i++)
    {
        if (s.charAt(i) == c)
        {
             counter++;
        }
    }
    return counter;
}
  public static boolean isValid (String s){
    if ((count(s,'(')) == (count (s,')')) && (count(s,'[')) == (count (s,']')) && (count(s,'{')) == (count (s,'}'))){
      return true;}
        else
          { return false;}}
  public static void main(String [] args){
    String s= "(()))({[[}]]";
    System.out.println(isValid (s));}}
    
    
