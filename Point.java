public interface Point {    
    public double getX();
    public double getY();
    public Point move(double dx, double dy);

    public String toString();
    public boolean equals(Point other);
}
