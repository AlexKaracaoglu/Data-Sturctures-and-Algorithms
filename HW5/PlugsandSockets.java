/* Alex Karacaoglu
 * CSCI1102 1PM
 * P2.  [Quick sort application: sockets and plugs]  
 * Due October 28
 * 
 * This program is the plug and socket application of quicksort.
 * 
*/ 

import java.util.Arrays;
public class PlugsandSockets {
   
    public static void match(int[] plugs, int[] sockets, int lo, int hi){
        if (lo < hi){
            int pivot = partition(plugs, lo, hi, sockets[hi]);         
            partition(sockets, lo, hi, plugs[pivot]);
            match(plugs, sockets, lo, pivot-1);
            match(plugs, sockets, pivot+1, hi);
        }
    }
  public static int partition(int[] a, int lo, int hi, int pivot)
    {
        int i = lo;
        int aux1, aux2;
        for (int j = lo; j < hi; j++){
            if (a[j] < pivot){
                aux1 = a[i];
                a[i] = a[j];
                a[j] = aux1;
                i++;
            }
            else if(a[j] == pivot){
                aux1 = a[j];
                a[j] = a[hi];
                a[hi] = aux1;
                j--;}    }
        aux2 = a[i];
        a[i] = a[hi];
        a[hi] = aux2;
        return i;
  }
  
  
  
   public static void main(String[] args){
        int[] plugs = {5,4,1,9,6,2,100,99,7} ;
        int[] sockets = {4,2,9,6,99,1,5,7,100}; 
        int n = plugs.length-1;
        if(sockets.length==plugs.length){
        match(plugs, sockets, 0, n);
        System.out.println("Plugs:   " +Arrays.toString(plugs));
        System.out.println("Sockets: " +Arrays.toString(sockets));}
        else{System.out.println("Sorry, but these plugs and sockets can not be compared.");}
    } 
  }
