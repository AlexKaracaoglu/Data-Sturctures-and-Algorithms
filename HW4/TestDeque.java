/* Alex Karacaoglu
 * CSCI1102 1PM
 * P1. [Interface/Class design & Java generics: Deque] 
 * Due October 12
 * 
 * This is to test the two implemetnations. I have a few processes started, specifically pushing a few integers
 * onto the deque, displaying the deque and then popping of from the right and left and then displaying the new deque each time.
 * The deque does not need to be of Integer type, so feel free to change the type and the inputs associated with them. 
 * 
*/  

public class TestDeque { 
  public static void main(String[] args) { 
    Deque_LinkedList<Integer> d = new Deque_LinkedList<Integer>();           //By un commenting this line, you invoke the linkedList Deque implementation
    //Deque_ResizingArray<Integer> d = new Deque_ResizingArray<Integer>();   //By un commenting this line, you invoke the ResizingArray Deque implementation
      d.pushLeft(1);                                                         //Only invoke one of these at a time. Also, feel free to change the type of the deque, from Integer to String or whatever you like.
      d.pushLeft(66);                                                        //Check both of these, the linked list and resizing array.
      d.pushRight(768);
      d.pushRight(4);
      d.pushLeft(5);
     System.out.println("The Deque is: " +d.toString());
     System.out.println(d.popRight());
     System.out.println("The Deque is: " +d.toString());                    // For the resizing array, I show all the null indices also so that it can show that it shows
     System.out.println(d.popLeft());                                       // that the array does in fact resize.
     System.out.println("The Deque is: " +d.toString());
     System.out.println(d.popRight());
     System.out.println("The Deque is: " +d.toString());
     System.out.println(d.popLeft()); 
     System.out.println("The Deque is: " +d.toString());
     

}}
        

  
