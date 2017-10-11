/**
 * Alex Karacaoglu
 * P3. [Heap sort variant: Bottom-up Heap sort] 
 * 1 PM
 * Empirical Study
 */
public class HeapEmpiricalStudy {
  
  
  public static void main(String[] args) { 
    In in = new In(args[0]);
    String[] a=in.readAllStrings();
    in.close();
    Stopwatch sw = new Stopwatch(); 
    Heap.sort(a);
    Out out = new Out(args[1]);
    out.println("Heap Sort sorting time: " +sw.elapsedTime());
  }
  
 //java HeapEmpiricalStudy largeW.txt LargeWResult.txt 
  
  //I could not get the Bottom up heap sort to work so i could not do an empirical study on it. But I did do an empirical
  //study on the regular heap sort.
  
}
