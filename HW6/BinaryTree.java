/**
 * Alex Karacaoglu
 * P1.  [Binary Tree implementation] 
 * 1 PM
 * 
 * I did my best to do the Binary Tree implementation. I feel like I got most of the methods correct.
 */
import java.util.*;
public class BinaryTree<Key extends Comparable<Key>> {
  
private Key val; 
private BinaryTree<Key> parent; 
private BinaryTree<Key> left; 
private BinaryTree<Key> right; 

public BinaryTree() {} 
public BinaryTree(Key key){} 
public BinaryTree(Key key, BinaryTree<Key> parent, BinaryTree<Key> left, BinaryTree<Key> right){
  val = key;
  this.parent=parent;
  this.left=left;
  this.right=right;
}

public Key getData(){
  return val;
}

public BinaryTree<Key> getLeft(){
  return left;}

public BinaryTree<Key> getRight(){
  return right;}

public BinaryTree<Key> getParent(){
  return parent;}

public void setData(Key key){
  val=key;}

public void setParent(BinaryTree<Key> parent){
  this.parent=parent;}

public void setLeft(BinaryTree<Key> left){
  this.left=left;}

 public void setRight(BinaryTree<Key> right){
  this.right=right;} 
 
 public int height(){
   if (this==null) return 0;
   else if(this.left==null && this.right==null)return 1;
   else return 1+Math.max(this.left.height(), this.right.height());}
 
 public boolean isRoot(){  
   if (this.parent==null) return true;
   else{return false;}}
    
 public boolean isLeaf(){
   if (this.right==null && this.left==null) return true;
   else{return false;}}
 
 public List<Key> preorder(BinaryTree<Key> root){
   List<Key>aList= new ArrayList<Key>();
   if (root==null){
     return aList;}
   else{ aList.add(root.getData());
     if(root.left!=null) preorder(root.left);
     if(root.right!=null) preorder(root.right);}
     return aList;}
 

 
 public List<Key> inorder(BinaryTree<Key> root){
   List<Key>aList= new ArrayList<Key>();
   if (root==null){
     return aList;}
   else{ 
     if(root.left!=null) inorder(root.left);
     aList.add(root.getData());
     if(root.right!=null) inorder(root.right);}
     return aList;} 
                  
 public List<Key> postorder(BinaryTree<Key> root){
   List<Key>aList= new ArrayList<Key>();
   if (root==null){
     return aList;}
   else{ 
     if(root.left!=null) postorder(root.left);
     if(root.right!=null) postorder(root.right);
     aList.add(root.getData());}
     return aList;} 
 
 public int nodeSum(){
   if (this==null) return 0;
   else if (this.left==null && this.right==right) return Integer.parseInt(this.val.toString());
   else return Integer.parseInt(this.val.toString()) + this.left.nodeSum() + this.right.nodeSum();}
 
 public int maxPath(){
   if(this==null) return 0;
   else if (this.left==null && this.right==right) return Integer.parseInt(this.val.toString());
   else return Integer.parseInt(this.val.toString())+ Math.max(this.left.maxPath(), this.right.maxPath());}
 
 public String toString(List<Key> a){
   return a.toString();}
 
 
 
 
   
 
 
     
     
     




public static void main(String[] args){
  BinaryTree b= new BinaryTree(0,null,null,null);
  BinaryTree a = new BinaryTree(0, null, null, null);
  BinaryTree c= new BinaryTree(0,null,null,null);
  a.setData(1);
  b.setData(2);
  c.setData(3);
  b.setParent(a);
  c.setParent(a);
  a.setLeft(b);
  a.setRight(c);
  //System.out.println(a.getData());
  //System.out.println(a.isRoot());
  //System.out.println(b.isRoot());
  //System.out.println(b.isLeaf());
  //System.out.println(a.isLeaf());
}}
