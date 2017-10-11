/*Alex Karacaoglu
 * CSCI 1102 
 * Assignment 1: Number 1
 * [Loops]
 * Due September 16
 * 
 * This program does two things. It calculates the tution of the college for years 1-14, but then it prints the tuition
 * for years 1-10 but then it calculates the price of attendance for 4 years in years 10-13 and displays that on screen.
 * 
 * I use a for loop to calculate the tuition prices for years 1-13. Then I split these values into two categories
 * by using an if statement so that if the year is 10 or under it displays the price on screen, and if it is greater
 * than or equal to 10 it calculates the 4 year cost of attendance by adding together the prices of years 10-13 and displaying that
 * on screen. I used the years 10-13 because that is what the professor said the years should be on Piazza.
 */
public class Tuition {
  
  public static void main(String[] args) {
  double TuitionPrice = 10000;
  double FourYearAttendance = 0;
 
  for (int year = 1; year <= 13; year++) {
   TuitionPrice = TuitionPrice +(TuitionPrice * .05);
   if (year <= 10) {
    System.out.println("The cost of attendance in year " +year+ " is: $"
      + TuitionPrice);
   }
   if (year >= 10) {
    FourYearAttendance = FourYearAttendance + TuitionPrice;
   }
  }
 
  System.out.println("The total cost of attendance in years 10-13 is: $" +FourYearAttendance);
 }
}
        
