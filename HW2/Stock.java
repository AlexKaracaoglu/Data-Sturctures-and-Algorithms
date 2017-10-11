/*
CSCI1102 HW#2
P1. [Classes and objects] 
Alex Karacaoglu
Due on Sept 21th, 2016
This program is creating the Stock class. This class is then used in TestStock to see if the methods I created here
actually work.
*/

public class Stock {
  private String symbol; //Stock's Symbol
  private String name; //Stock's Name
  private double previousClosingPrice; //Stock's Previous Closing Price
  private double currentPrice; //Stock's Current Price
  
  public Stock(){}
  public Stock (String symbol, String name){ 
    this.symbol= symbol;
    this.name= name;} //Creating instance of Stock that has specified symbol and name
  
  //Methods with Stock
  public double getPreviousClosingPrice(){
    return previousClosingPrice;} //Returns previous closing price
  public double getCurrentPrice(){
    return currentPrice;} //Returns current price
  public double getChangePercent() {
    return (currentPrice-previousClosingPrice) / previousClosingPrice;} //finds percent change
  public void setCurrentPrice(double newCurrentPrice){
    currentPrice=newCurrentPrice;} //Sets the current price to the new current price
  public void setPreviousClosingPrice(double newPreviousPrice){
    previousClosingPrice=newPreviousPrice;} //Sets previous price to new previous price
  
}
