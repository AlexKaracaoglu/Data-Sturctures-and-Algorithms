/* Alex Karacaoglu
 * CSCI1102 1PM
 * P1.  [Merge Sort: 3-way merge sort implementation and testing] 
 * 1. Implementing 3-way Merge sort  
 * 
 * Due October 28
 * 
 * This program is just the 3 way merge ssort function. It is pretty much the exact same as the original merge sort function, but
 * it splits the array into 3 parts instead of 2. It then performs the 3 way merge algorithm and returns the sorted
 * result. In the main, it takes in the argument of the tinyW.txt and prints the result to tinyWresult.txt.
 * 
*/ 
public class MergeSort3way {
  
    private MergeSort3way() { }
    

    
//MERGE
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid1, int mid2, int hi) {
        {
    int i = lo;
    int j = mid1+1;
    int k = mid2+1;
    int l = lo;
    while ((i <= mid1) && (j <= mid2) && (k <= hi)) {
      if (less(a[i],a[j]))  {
        if (less(a[i],a[k])) {
          aux[l++] = a[i++];
        }
        else {
          aux[l++] = a[k++];
        }
      }
      else {
        if (less(a[j],a[k])) {
          aux[l++] = a[j++];
        }
        else {
          aux[l++] = a[k++];
        }
      }
    }
    while ((i <= mid1) && (j <= mid2)) {

      if (less(a[i],a[j])) {
        aux[l++] = a[i++];
      }
      else {
        aux[l++] = a[j++];
      }
    }
    while ((j <= mid2) && (k <= hi)) {
      if (less(a[j],a[k])) {
        aux[l++] = a[j++];
      }
      else {
        aux[l++] = a[k++];
      }
    }
    while ((i <= mid1) && (k <= hi)) {
      if (less(a[i],a[k])) {
        aux[l++] = a[i++];
      }
      else {
        aux[l++] = a[k++];
      }
    }
    while (i <= mid1) {
      aux[l++] = a[i++];
    }
    while (j <= mid2) {
      aux[l++] = a[j++];
    }
    while (k <= hi) {
      aux[l++] = a[k++];
    }
    for (int p=lo; p<l; p++){
      a[p]=aux[p];
    }
        }}
 //SORT   
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
      int mid1, mid2;
       
        if (hi <= lo) return;
        mid1 = lo + ((hi- lo) / 3);  
        mid2 = lo + 2 * ((hi - lo) / 3);
        sort(a, aux, lo, mid1);
        sort(a, aux, mid1+1, mid2);
        sort(a,aux,mid2+1,hi);
        merge(a, aux, lo, mid1, mid2, hi);
    }
    
//SORT
     public static void sort(Comparable[] a) {       
    Comparable[] aux = new Comparable[a.length];
    for (int i = 0; i < aux.length; i++) {
      aux[i] = a[i];
    }
    sort(a, aux, 0, a.length-1);
    for (int i = 0; i < aux.length; i++) {
      a[i] = aux[i];
    }
  }
    
     /***********************************************************************
    *  Helper sorting functions
    ***********************************************************************/
    
    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }
    
    private static boolean least(Comparable v, Comparable w, Comparable u) {
        return ((v.compareTo(w) < 0)&&(v.compareTo(u) < 0));
    }
        
    // exchange a[i] and a[j]
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    
     /***********************************************************************
    *  Check if array is sorted - useful for debugging
    ***********************************************************************/
    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
    
     // print array to standard output
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }
    
    
 public static void main(String[] args) {
        In in = new In(args[0]);  
        String[] a=in.readAllStrings();  
        in.close();         
          MergeSort3way.sort(a);        
        Out out = new Out(args[1]);  
        for (int i=0; i<a.length; i++){     
          out.print(a[i]+ " ");     }  
        out.println();     
        out.close();  
        
       //******* To run, copy and paste this into the interactions window:    java MergeSort3way tinyW.txt tinyWresult.txt          *******
       // To view the results look into tinyWresults.txt 
        
     
 }}
  
    

  

  

