/*
CSCI1102 HW#2
P2. [ADT: Interface and Classes] 
Alex Karacaoglu
Due on Sept 21th, 2016
This program is creating an interface named Rational the will be implemented by the RationalC class. I saw RationalC on
the problem set so i used RationalC as the name as my Rational Class that implements the Rational Interface.
*/

public interface Rational {  
    public int getNumerator();
    public int getDenominator();
    public Rational add(Rational other);
    public int compareTo(Rational other); 
    public String toString(); } 