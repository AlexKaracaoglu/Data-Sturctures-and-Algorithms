/* Alex Karacaoglu
 * CSCI1102 1PM
 * P3. [LinkedList application: Appending and Interleaving] 
 * Due October 12
 * 
 * This program makes the linked list class. And then given two linked lists i wrote methods that append the two of them
 * and then another that interlaeves the two into one linked list.
 * 
 * I imported the Arrays class to make us of sort method.
 * 
*/

import java.util.Arrays;

public class LinkedList {   
  Node first; 

  private static class Node
  {  int item;        
    Node next; } 
 
// Constructor: 
  
  public static Node buildLL (int[]a){
Node first= new Node ();
Arrays.sort(a);
    first.item = a[0];
    Node theNode= first;
    for (int i=1; i < a.length; i++)
    {
      Node oneNode = new Node ();
      oneNode.item = a[i];
      theNode.next = oneNode;
      theNode= theNode.next;}
    return first;}
  
  public LinkedList(int[]a){
     this.first = buildLL(a);
    }
  
  public static void display (int[] a){
    for (int i = 0 ; i<a.length; i++){
      System.out.println(a[i]);}}
    
      
   
        
  
  public static int countl (LinkedList a){
    int counter=0;
    for (Node p = a.first; p!=null;p=p.next){
      counter++;}
  return counter;}
  
  public static int[] linkedListToArray (LinkedList a){
    int [] b = new int [countl(a)];
    int count=0;
    for (Node p=a.first; p!=null;p=p.next){
      b[count]=p.item;
      count++;}
  return b;}
    

//Methods: 
  
  public  void displayLinkedList () {
        Node p = this.first;
        while(p!=null){
          System.out.println(p.item);
          p=p.next;}}
    
    public void append(LinkedList other){
      LinkedList a = this;
      LinkedList b = other;
      int [] c = linkedListToArray(a);
      int [] d = linkedListToArray(b);
      int length = countl(a) + countl(b);
      int [] e = new int [length];
      for (int i=0; i<length; i++){
        if (i<countl(a)) {e[i]=c[i];
       }
        else{e[i]=d[i-countl(a)];
        }}
      display(e);
        }
      
    
   
    public void interleave(LinkedList other){
      LinkedList a = this;
      LinkedList b = other;
      int [] c = linkedListToArray(a);
      int [] d = linkedListToArray(b);
      int length = countl(a) + countl(b);
      int [] e = new int [length];
      for (int i=0; i<length; i++){
        if (i<countl(a)) {e[i]=c[i];}
        else{e[i]=d[i-countl(a)];}}
      LinkedList f = new LinkedList(e);
      f.displayLinkedList();
    } 
   
        
        
}
                                   
    
   
