/**
 * Alex Karacaoglu
 * P3. [Heap sort variant: Bottom-up Heap sort]
 * 1 PM
 * 
 *
 */
import java.util.*;
public class BottomUpHeapSort {

    private BottomUpHeapSort() { }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param pq the array to be sorted
     */
    public static void sort(Comparable[] pq) {
        int N = pq.length;
        int l = N;
        int j= leafSearch(pq,N,l,1);
        for (int k = N; k >= 0; k--)
            bottomuprearrange(pq, N, k, j);
        while (N > 1) {
            exch(pq, 1, N--);
            bottomuprearrange(pq, N,1,1);
        }
    }

   /***************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/

//    private static void sink(Comparable[] pq, int k, int n) {
//        while (2*k <= n) {
//            int j = 2*k;
//            if (j < n && less(pq, j, j+1)) j++;
//            if (!less(pq, k, j)) break;
//            exch(pq, k, j);
//            k = j;
//        }
//    }

    public static void bottomuprearrange(Comparable[] pq, int N, int i, int j){
      leafSearch(pq,N,i,j);
      bottomupsearch(pq,i,j);
      interchange(pq,i,j);}

    public static int leafSearch(Comparable[] pq, int N, int i, int j){
      j=i;
      while(2*j<=N){
        if(2*j+1<=N && (less(pq[2*j], pq[2*j+1]))) j=2*j+1;
        else j=2*j;}
      return j;}

    public static void bottomupsearch(Comparable[] pq, int i, int j){
      while(less(pq[j],pq[i])) j=j/2;}

    public static void interchange(Comparable[] pq, int i, int j){
      int x=(int)(pq[j]);
      pq[j]=pq[i];
      while(j>i){
        int w = (int)pq[j/2];
        exch(pq, w, x);}
        j=j/2;}



   /***************************************************************************
    * Helper functions for comparisons and swaps.
    * Indices are "off-by-one" to support 1-based indexing.
    ***************************************************************************/
    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i-1].compareTo(pq[j-1]) < 0;
    }

    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i-1];
        pq[i-1] = pq[j-1];
        pq[j-1] = swap;
    }

    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }


   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/
    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
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
        String[] a = StdIn.readAllStrings();
        BottomUpHeapSort.sort(a);
        show(a);}

}
