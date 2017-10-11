/* Alex Karacaoglu
 * CSCI1102 1PM
 * P1. [Interface/Class design & Java generics: Deque] 
 * Due October 12
 * 
 * This is just the Deque interface provided in the problem set.
 * 
*/ 
public interface Deque<Item> { 
  public Boolean isEmpty();  
  public int size();  
  public void pushLeft(Item item);
  public void pushRight(Item item);
  public Item popLeft(); 
  public Item popRight(); 
  public String toString();
} 