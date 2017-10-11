/*
CSCI1102 HW#2
P2. [ADT: Interfaces and Classes] 
Alex Karacaoglu
Due on Sept 21th, 2016
This program tests my RationalC class, which in turn implemented my interface called Rational. It lets the user input 
4 integers where: the first is the numerator of the first rational number, the second is the denominator of the second 
rational number, the third is the numerator of the second rational number and the fourth is the denominator of the second
rational number. from these inputs, two rational numbers are then created. The two rational numbers are then output on 
screen. On the next line is the output when you add the two rational numbers and reduce them. On the final line the
program outputs the result when it compares the two rational numbers. 

I imported the Scanner class so that I could take in user input.
*/


import java.util.Scanner;

public class TestRational {
  
  
  public static void main(String[] args) { 
    int a,b,c,d;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter an integer to be the numerator of the first rational number ");
      a= sc.nextInt();
    System.out.println("Please enter a nonzero integer to be the denominator of the first rational number ");
      b= sc.nextInt();
    System.out.println("Please enter an integer to be the numerator of the second rational number: ");
      c= sc.nextInt();
    System.out.println("Please enter a nonzero integer to be the denominator of the second rational number ");
      d= sc.nextInt();  
    RationalC first= new RationalC (a, b);
    RationalC second= new RationalC (c,d);
    System.out.println("The first Rationa Number, in its reduced form, is: " + first);
    System.out.println("The second Rational Number, in its reduced form, is: " + second);
    System.out.println("The sum of the two rational numbers, when reduced, is: " + first.add(second));
    System.out.println("When comparing the first rational number to the second, we get the output: " + first.compareTo(second)); 
  }}
