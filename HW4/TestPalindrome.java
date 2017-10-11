/* Alex Karacaoglu
 * CSCI1102 1PM
 * P2. [Stack/Queue application: Palindrome] 
 * Due October 12
 * 
 * This is to test the isPalindrome method. I make use of a scanner to get user input for the tested string.
 * 
 * I imported the Scanner class.
 * 
*/ 

import java.util.Scanner;

public class TestPalindrome { 
  public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    System.out.println("Please type the desired string to be tested as a palindrome: ");
    String s = sc.nextLine();
    System.out.println(IsPalindrome.isPalindrome(s));
  }}
