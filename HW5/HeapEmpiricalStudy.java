/**
 * Auto Generated Java Class.
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
  
 //java HeapEmpiricalStudy largeW.txt EmpiricalStudy.txt largeWresult.txt
  
}
