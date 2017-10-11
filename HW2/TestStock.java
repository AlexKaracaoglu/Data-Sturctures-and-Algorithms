/*
CSCI1102 HW#2
P1. [Classes and objects] 
Alex Karacaoglu
Due on Sept 21th, 2016
This program is to create an instance of a Stock and run the methods created in Stock on it and output the results.
*/
public class TestStock {
  public static void main(String[] args) { 
    Stock testStock= new Stock ("GOOGL", "Alphabet Inc"); //Creates instance of a Stock
    testStock.setCurrentPrice (788.12); //Sets the current price to 788.12
    testStock.setPreviousClosingPrice (789.12); //Sets previous closing price to 789.12
    System.out.println("Previous closing price was: $" +testStock.getPreviousClosingPrice()); //outputs the previous closing price
    System.out.println("Current price is: $" +testStock.getCurrentPrice()); //outouts the curent price
    System.out.println("Percent Change was: " +testStock.getChangePercent()+ "%"); //Outputs the percent change of the stock from previous closing price to current price
  }}
  
  

