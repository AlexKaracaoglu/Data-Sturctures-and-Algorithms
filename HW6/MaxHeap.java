/**
 * Alex Karacaoglu
 * P2.  [Priority Queue and Binary Heap implementation]
 * 1 PM
 */


import java.util.*;

public class MaxHeap<Key extends Comparable<Key>> implements MaxPQ<Key>{
   private BinaryTree<Key> root;
   private List<BinaryTree> treeList;
   private int N;


  public MaxHeap(){
    root = null;
   N = 0;
    treeList = new ArrayList<BinaryTree>();
  }
  public List getList(MaxHeap tree){
    return treeList;
  }
  public void insert(Key key){
    if (this.isEmpty()){
      treeList.add(null);
      root = new BinaryTree(key);
      treeList.add(1, root);
  }
    else{
     BinaryTree newNode = new BinaryTree(key);
     treeList.add(newNode);
     swim(treeList.size()-1);

    }
    N++;
  }

 public Key delMax(){
      Key max = (root.getData());
     BinaryTree promoted = treeList.get(this.N);

      this.root.setData((Key)(promoted.getData()));
      this.N--;
      if(this.isEmpty()){
        root = null;
      }
      else
        this.sink(Integer.parseInt(root.toString()));
      return max;

  }
  public boolean isEmpty(){
    return N == 0;
  }
  public int size(){
    return N;
  }

  private void swim(int k) {
    while (k > 1 && less(k/2, k) == true)
    {
      exch(k/2, k);
    }
  }
   private boolean less(int k1, int k2)
   {
     int cmp = treeList.get(k1).getData().compareTo(treeList.get(k2).getData());
     if(cmp < 0) return true;
     else return false;

   }
  private void sink(int k) {
    while (2*k <= N)
    {
      int j = 2*k;
      if (j < N && less(j, j+1)) j++;
      if (!less(k, j)) break;
      exch(k, j);
      k = j;
    }
  }
  private void exch(int k1, int k2){
    BinaryTree tempNode = treeList.get(k1);
    treeList.set(k1,treeList.get(k2));
    treeList.set(k2,tempNode);
    int parentOfParentIndex = k1/2;

    if (parentOfParentIndex == 0 && N == 2){
     treeList.get(k2).setLeft(treeList.get(k1));
    }
    if(parentOfParentIndex == 0 && N == 3)
    {
     treeList.get(k2).setRight(treeList.get(k1));
    }
     else if (k1%2==0){
      treeList.get(parentOfParentIndex).setLeft(treeList.get(k2));
    }
     else if(k1%2 != 0 && N>3){
      treeList.get(parentOfParentIndex).setRight(treeList.get(k2));
    }
    if (k2%2==0){
     treeList.get(k2).setLeft(tempNode);
    }
    else
      treeList.get(k2).setRight(tempNode);
    }

  public String toString(){

    String t= " ";

    for( int i = 1; i < treeList.size(); i++){
     t += treeList.get(i).getData() + " ";


    }
    return t;
  }


  public static void main(String[] args){
   MaxHeap tree = new MaxHeap();
   tree.insert("12");
   tree.insert("54");
   //tree.insert("9");
   //tree.insert("86");
   System.out.println(tree.size());
   System.out.println(tree.isEmpty());


   System.out.println(tree.toString());
}
}
