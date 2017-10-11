/* Alex Karacaoglu
 * CSCI1102 1PM
 * P2. [LinkedList application] 
 * Due September 28
 * 
 * This program takes in an integer array, transforms it into a linked list, finds the max item of that linked 
 * list and then prints the linked list without the max item in it.
 * 
 * I imported the Arrays class
*/

import java.util.Arrays;

public class LinkedListApplication {
  
private static class Node { 
int item; 
Node next; 
} 

  public static Node buildLinkedList(int[] a){
    Node first= new Node ();
    first.item = a[0];
    Node theNode= first;
    for (int i=1; i < a.length; i++)
    {
      Node oneNode = new Node ();
      oneNode.item = a[i];
      theNode.next = oneNode;
      theNode= theNode.next;}
    return first;}
  
public static int getMax (Node first) {
    Node p = first;
    Node maxNode = first;  
    while(p != null) {
      if (p.item > maxNode.item)
        maxNode=p;
      p=p.next; }
    return maxNode.item;}

public static Node removeMax(Node first, Node max){
  Node p = first;
  Node q = first;
  if (first.item == max.item){
    first = first.next;}
  else {
  while (q.item != max.item){
    p=q;
    q=q.next;
  }
  p.next=q.next;
  }
  return first;}

 public static Node removeK (Node first, int k){
    int counter=1;
    Node p = first;
    Node q = first;
    if (k==1){first=first.next;}
    else{
  for (counter=1;counter != k;counter++){
    p=q;
    q=q.next;
  }
  p.next=q.next;
  }
    return first;}
 
 public static void displayLinkedList (Node first) {
    Node p=first; 
    while (p!=null){  
      System.out.println(p.item); //Each element of the linked list will be printed on a new line when called
      p=p.next; }} 
  
  public static void main(String[] args) { 
    int [] arr = {2,3,4,6,10,7,8,9};     //Input the integer array here. 
    Node linkedList = buildLinkedList(arr); //builds linked list
    displayLinkedList(linkedList);
    //displayLinkedList(removeK(linkedList,3));
    System.out.println( getMax(linkedList));      //finds max of linked list
    //displayLinkedList(removeMax(linkedList, max)); //removess the max from the linked list and displays result on screen
  } 
}
