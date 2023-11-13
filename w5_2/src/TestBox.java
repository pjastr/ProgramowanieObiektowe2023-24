public class TestBox {

    public static void main(String[] args) {
        Box b = new Box(150, -5, 60, new int[]{101, 50, -10, 75});
        System.out.println(b.getWidth());    // Wypisze: 100
        System.out.println(b.getHeight());   // Wypisze: 1
        System.out.println(b.getDepth());    // Wypisze: 60
        for (int tag : b.getTags()) {
            System.out.print(tag + " ");     // Wypisze: 100 50 1 75
        }
    }
}

class Box {
    private double width;
    private double height;
    private double depth;
    private int[] tags = new int[4];

    public Box(double width, double height, double depth, int[] tags) {
        this.width = (width < 1) ? 1 : (width > 100) ? 100 : width;
        this.height = (height < 1) ? 1 : (height > 100) ? 100 : height;
        this.depth = (depth < 1) ? 1 : (depth > 100) ? 100 : depth;

        for (int i = 0; i < 4; i++) {
            if (tags[i] < 1) {
                this.tags[i] = 1;
            } else if (tags[i] > 100) {
                this.tags[i] = 100;
            } else {
                this.tags[i] = tags[i];
            }
        }
    }

    // Gettery i settery
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

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = (depth < 1) ? 1 : (depth > 100) ? 100 : depth;
    }

    public int[] getTags() {
        return tags.clone();
    }

    public void setTags(int[] tags) {
        for (int i = 0; i < 4; i++) {
            if (tags[i] < 1) {
                this.tags[i] = 1;
            } else if (tags[i] > 100) {
                this.tags[i] = 100;
            } else {
                this.tags[i] = tags[i];
            }
        }
    }

}