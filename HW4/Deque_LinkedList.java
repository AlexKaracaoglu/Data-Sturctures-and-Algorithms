/* Alex Karacaoglu
 * CSCI1102 1PM
 * P1. [Interface/Class design & Java generics: Deque] 
 * Due October 12
 * 
 * This is the Linked List implementation of Deque. It implements the Deque interface
 * and implements the deque methods by a linked list. 
 * 
*/

import java.lang.*;

public class Deque_LinkedList<Item> implements Deque<Item>{
  private class Node<Item> {  
    Item item;  
    Node previous; 
    Node next; }
  private int n; //Number of elements in deque
  private Node<Item> first; //first node
  private Node<Item> last; // last node
  
  
  public Boolean isEmpty(){
    return n==0;}
  
  public int size(){
    return n;}
  
  public Deque_LinkedList(){
    first=null;
    last=null;
    n=0;}
  
  public void pushLeft(Item item){ //Adds item onto the front of the linked list. "Makes a new first"
    Node newFirst= new Node();
    newFirst.item=item;
     if (first != null) {
            newFirst.next = first;
            first.previous = newFirst;
            }
     first = newFirst;
     if (last==null) last=first;     
        n++;
    }
  
  public void pushRight(Item item){ //Adds item onto the end of the linked list. "Makes a new last"
    Node newLast= new Node();
    newLast.item=item;
     if (last != null) {
            newLast.previous = last;
            last.next = newLast;}
     last = newLast;
     if(first==null) first=last;
        n++;
    }
  
  public Item popLeft(){                    //Pop off the first item in the linked list
    Node<Item> oldFirst = first;
    first = first.next;
    if (first==null) {last=null;}
    else first.previous=null;
    n--;          
    return oldFirst.item;
  }
  
  public Item popRight(){                  //Pop off the last item in the linked list
    Node<Item> oldLast= last;
    last = last.previous;
    if (last==null){first=null;}
    else{last.next=null;}
    n--;          
    return oldLast.item;     
  }
  
  public String toString(){
    String s="";
    for (Node p = first; p!=null;p=p.next){
    s = s + " " +p.item;}
    return s;}
    
}
    
    
    
    
  

