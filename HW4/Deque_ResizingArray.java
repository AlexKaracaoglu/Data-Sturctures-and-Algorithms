/* Alex Karacaoglu
 * CSCI1102 1PM
 * P1. [Interface/Class design & Java generics: Deque] 
 * Due October 12
 * 
 * This is the Resizing Array implementation of a deque. It also implements the deque interface.
 * 
 * I imported the Arrays class to make the toString function a bit easier.
 * 
 */

import java.util.Arrays;

public class Deque_ResizingArray<Item> implements Deque<Item> {
  private Item[] d =(Item[]) new Object[2]; //deque elements in an array and initialize
  private int n=0; //number of deque elements and initialize at 0


   
   public Boolean isEmpty() {  
     return n == 0;     }
   
    public int size() {
      return n;     }
    
    public void resize(int capacity) {       //To resize array if necessary.  
      assert capacity >=n;
      Item[] temp = (Item[]) new Object[capacity]; 
      for (int i = 0; i < n; i++) {  
        temp[i] = d[i];         }  
      d = temp;            }   
    
     public void pushRight(Item item){
        if (n == d.length-1) resize(2*d.length);   //Doubling length of array if needed
        d[n] = item;            
        n++;                
    }  
     
     public void pushLeft(Item item){
       if (n == d.length-1) resize(2*d.length);    //Doubling length of array if needed
        for (int i=n; i>-1;i--){ 
            d[i+1] = d[i];}
        d[0] = item;             
        n++;                 
        }
     
     public Item popRight(){
       Item item = d[n-1];  
       d[n-1] = null;                  
       n--;         
       if (n > 0 && n == d.length/4) resize(d.length/2);     //Shrinking the array if needed
       return item;     }
     
     public Item popLeft(){
       Item item = d[0];          
       for (int i=1;i<n;i++){
         d[i-1]=d[i];}
       n--;          
       if (n > 0 && n == d.length/4) resize(d.length/2);     //Shrrinking the array if needed
       d[n]=null;
       return item;     }
     
     public String toString(){
       return Arrays.toString(d);}          //Using the toString method to print the array
         
}
