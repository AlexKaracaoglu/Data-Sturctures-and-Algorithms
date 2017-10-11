/*
CSCI1102 HW#2
P2. [ADT: Interfaces and Classes] 
Alex Karacaoglu
Due on Sept 21th, 2016
This program is making the class RationalC and implementing the interface Rational. It creates rational numbers, and
and reduces them. There are a variety of methods that were taken from the interface. These methods, reuturn the numerator
or the denominator, adds two rartionals together, compares two rationals, and transforms a number of RationalC type to 
a string. I also created a few other methods to help me with these. I created a method called gcd that finds the gcd of 
two numbers. I then used gcd in another method called reduceRational that reduces a rational number to its reduced form.
*/

public class RationalC implements Rational{
  int numerator;
  int denominator;
  public RationalC(){}
  public RationalC(int n, int d){
    numerator=n;
    denominator=d;
    reduceRational();
  }
  
  public int getNumerator(){
    return numerator;
  }
  
  public int getDenominator(){
    return denominator;
  }
  
  public Rational add(Rational other){
    RationalC otherRational = (RationalC)other;
    int commonDenominator= this.denominator * other.getDenominator();
    int numerator1= this.numerator * other.getDenominator();
    int numerator2= this.denominator * other.getNumerator();
    int sum= numerator1 + numerator2;
    reduceRational();
    Rational finalSum= new RationalC(sum, commonDenominator);
    return finalSum;
    
  }
  
  public void reduceRational(){
    if (numerator != 0){
      int commonDivisor= gcd (Math.abs(numerator), Math.abs (denominator));
      numerator= numerator/ commonDivisor;
      denominator= denominator/ commonDivisor;}
  }
  
  public int gcd ( int a, int b) {
     if (b==0) return a;
     else return gcd (b, a % b);
  }   
  
  public String toString(){
    String s;
    s = numerator + "/" + denominator;
    return s;
  }
  public int compareTo(Rational others){
    RationalC othersRational = (RationalC)others;
    int left= this.numerator * othersRational.denominator;
    int right=  this.denominator * othersRational.numerator;
    if (left > right) return +1;
    if (right > left) return -1;
    return 0;
  }
} 
  
  
  
