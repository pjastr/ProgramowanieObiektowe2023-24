package example12a;

public class Circle extends Shape implements Cloneable{

    private int radius;


    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }


    @Override
    public Circle clone() throws CloneNotSupportedException {
        //System.out.println("Circle.clone()");
        return (Circle) super.clone();
    }
}
