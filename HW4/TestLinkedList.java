/* Alex Karacaoglu
 * CSCI1102 1PM
 * P3. [LinkedList application: Appending and Interleaving] 
 * Due October 12
 * 
 * This program is the main method that will implement the LinkedList class that I made. I initialize the integer arrays
 * to these values, but they can be changed to anything. I then created two linked lists, that then are the ones that I 
 * call the methods onto. I set up my methods so that they automatically print the new linkedList that is the new appended/
 * interleaved linkedlist to avoid having to clutter up the main method. 
 * 
 */
public class TestLinkedList {
  public static void main (String[] args){
        int[]a= {1,2,3,4,5,6,7,-1,0}; //These integer arrays can be changed to anything
        int[]c={8,9,10,-2};
        LinkedList b = new LinkedList(a); //These are the two build linked lists
        LinkedList d = new LinkedList(c);
        b.append(d);      //Appends d onto b and prints
        //d.append(b);      //Appends b onto d and prints
        //b.interleave(d);  //Interleaves b and d  and prints
        
        //Only run one of the methods at a time because they each print the output right away and it might be hard to differentiate between the lists.  
  }}
