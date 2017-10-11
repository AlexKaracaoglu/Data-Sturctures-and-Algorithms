/* Alex Karacaoglu
 * CSCI1102 1PM
 * P1.  [Merge Sort: 3-way merge sort implementation and testing] 
 * 2. [Empirical Study of the Running time]   
 * 
 * Due October 28
 * 
 * This program ist the empirical study function. This makes 3 stop watches and runs the merge, the BUmerge and the
 * 3 way merge functions and prints their run times onto EmpiricalStudy.txt. It also prints the results of 
 * 3 way merge run on largeW.txt and prints it to largeWresult.txt.
 * 
*/ 
public class EmpiricalStudy { 
  public static void main(String[] args) { 
    In in = new In(args[0]);
    String[] a=in.readAllStrings();
    in.close();
Stopwatch sw = new Stopwatch(); 
Merge.sort(a);
Stopwatch stw= new Stopwatch(); 
MergeBU.sort(a);
Stopwatch stwa= new Stopwatch(); 
MergeSort3way.sort(a);  
Out out = new Out(args[1]);
    out.println("Regular Top Down MergeSort time: " +sw.elapsedTime());
    out.println("Bottom Up MergeSort time: " +stw.elapsedTime());   
    out.println("3 Way MergeSort time: " +stwa.elapsedTime());
    out.close();
Out results = new Out(args[2]); 
        for (int i=0; i<a.length; i++){     
        results.print(a[i]+ " ");     }  
        results.println();
        results.close();



  //To run: ****   java EmpiricalStudy largeW.txt EmpiricalStudy.txt largeWresult.txt   ****
  }}
