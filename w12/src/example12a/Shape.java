package example12a;

public class Shape implements Cloneable {

    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public Shape clone() throws CloneNotSupportedException {
        //System.out.println("Shape.clone()");
        return (Shape) super.clone();
    }
}
