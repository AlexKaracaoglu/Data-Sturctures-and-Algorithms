/*Alex Karacaoglu
 * CSCI 1102 
 * Assignment 1: Number 2
 * [Getting Input; If Statement]
 * Due September 16
 * 
 * This program takes in three user given edges using the scanner and compares them to see if there they are able to 
 * make a valid triangle and returns a boolean answer true or false.
 * 
 * This program makes use of a scanner to take user input by way of typing in 3 doubles. It then processes rhese
 * doubles and by way of an if statement it checks to see if the three lengths foem a valid triangle. It then returns
 * to the user a true or a false depending on if they are able to form a triangle or not.
 * 
 * I imported the Scanner class
*/
import java.util.Scanner;
public class Triangle {
      public static boolean isTriangleValid(double a, double b, double c) {
        if((a+b)>c && (b+c)>a && (a+c)>b) {
            return true;
        }else {
          return false;}}
  public static void main(String[] args) { 
    double a, b, c;
    
 Scanner sc = new Scanner(System.in);
 System.out.println("The three edges of the triangle are:");
  a = sc.nextDouble();
  b = sc.nextDouble();
  c = sc.nextDouble();
  System.out.println("Can the three edges " + a + ", " + b + ", and "  + c + " form a triangle?"); 
     System.out.println(isTriangleValid(a,b,c));
        }}