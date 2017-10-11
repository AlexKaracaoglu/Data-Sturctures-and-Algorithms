//Alex Karacaoglu
//PS 9
//Option 3: (10 Points) The Great-Tree List Recursion Problem
//Due Saturday December 10


public class GreatTreeListRecursionProblem{

//Creating a nested, recursively defined Node class that we used in the LL and BST problem sets and then instantiated it
  private static class Node{
    int value;
    Node left,right;
    public Node(int value){
      this.value=value;
      this.left=null;
      this.right=null;
    }}
  
//To append two individual nodes, will be used to vonnect specific segments to form a list
  public static void merge(Node a, Node b){
    a.right=b;
    b.left=a;}

//Need to append two doubly linked lists of nodes, which will be used later when we make three LL: One of the
//left subtree, one of te right subtree, and one of the starting node(root node)
  public static Node mergeLists(Node a, Node b){
    if (a==null) return b; 
    if (b==null) return a;
    Node endA = a.left; 
    Node endB = b.left;  
    merge(endA,b); 
    merge(endB,a);
    return a;} 

//Made a helper function less that will be used in the next function to avoid clutter
    public static boolean less(Node a, int b){
      return a.value < b;}
    
//Need to first make the initial binary tree in order to make the doubly LL from it, I will make an insert
//function using recursion. Insert according to conventional binary tree rules and when you encounter a 
//null tree you make a new node and place the int value into it. Basic convention of a BT is that left < parent < right
  public static void insert(Node start, int value){
    if (less(start,value)){    
      if(start.right!=null) insert(start.right,value); 
      else start.right = new Node(value);}
    else {if (start.left!=null) insert(start.left,value); 
      else start.left=new Node(value);}}
 
  
//Now that we have the BST we need to make a list form it. Input the start of the tree and build the linked list.
//The list is "in order" of the tree and the front of the list(left most element) connects itself to the 
//the end of the list(the right most element)
  public static Node makeList(Node start){
    if (start==null)return null;
    //In the notes for this problem, Professor Muller said that we should "create a circularly linked list A from the left 
    //subtree, a circularly linked list B from the right subtree, and make the root a one node circularly 
    //linked list. Then merge the three lists." Here is where I'm doing that 
    Node A = makeList(start.left); //Making a LL A from left subtree
    Node B = makeList(start.right);//Making a LL B from right subtree 
    start.left= start; //Making the root node a one node circular linked list
    start.right=start; 
    A = mergeLists(A, start);
    A=mergeLists(A,B);
    return A;}
  
//This prints the value of the tree "in order" by recursion  
  public static void printTree(Node start) {
        if (start==null) return;
        printTree(start.left);
        System.out.print(start.value + ",");
        printTree(start.right);}

//This prints the LL of nodes from the front to the end and "breaks" once it gets back to the front: ends loop 
  public static void printLinkedList(Node start) {
        Node iter = start;  
        while (iter != null) {
            System.out.print(iter.value + ",");
            iter = iter.right;
            if (iter.equals(start)) break; 
        }}      
 
 
        public static void main(String[] args) {
        Node rootNode = new Node(75); //Need a starting root Node an then can insert a bunch of others
        insert(rootNode, 3);
        insert(rootNode, 80);
        insert(rootNode, 123);
        insert(rootNode, 2);
        insert(rootNode, 90);
        insert(rootNode, 800);
        insert(rootNode, 12);
        insert(rootNode, 0);
        insert(rootNode, 65);
        insert(rootNode, 13);
        insert(rootNode, 27);
        insert(rootNode, 94);
        insert(rootNode, 10);
        insert(rootNode, 145);
        insert(rootNode, 5);
        
        
        printTree(rootNode);   
        System.out.println(" ");
        Node start= makeList(rootNode);
        printLinkedList(start);  

       
        
       
        
        
        

        
   
        
 }}
  
   
      
  