public interface MaxPQ<Key extends Comparable<Key>>{ 
  public void insert(Key key); 
  public Key delMax(); 
  public boolean isEmpty(); 
  public int size(); 
  public String toString(); 
}
