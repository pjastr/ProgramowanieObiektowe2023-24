public class TestRetangle {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(150, -5);
        System.out.println(r.getWidth());
        System.out.println(r.getHeight());

        r.setWidth(50);
        r.setHeight(200);
        System.out.println(r.getWidth());
        System.out.println(r.getHeight());
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = (width < 1) ? 1 : (width > 100) ? 100 : width;
        this.height = (height < 1) ? 1 : (height > 100) ? 100 : height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width < 1) ? 1 : (width > 100) ? 100 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height < 1) ? 1 : (height > 100) ? 100 : height;
    }
}