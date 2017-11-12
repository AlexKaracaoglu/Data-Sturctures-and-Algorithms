/*Alex Karacaoglu
 * CSCI 1102 - Professor Yang
 * Assignment 1: Number 5
 * [Methods; Recursion]
 * Due September 16
 *
 * This program takes in 2 integers, a and b, and runs the Euclidean Algorithm (which I have done extensive work with
 * in MATH2216) on them to obtain the greatest common divisor.
 *
 * I define a method gcd that takes in two integers and I start off with the basic statement that if b=0 then the gcd
 * is a. If not, then I return the two integers: (b, a mod b) and due to the way the Euclidean algorithm works,
 * the gcd(a,b)=gcd(b,a mod b). I then used recurssion to continue this process until the gcd is found.
 */
public class gcd {
  public static int gcd ( int a, int b) {
     if (b==0) return a;
     else return gcd (b, a % b);
  }
  public static void main(String[] args){
  System.out.println (gcd (5, 1));
  }}
