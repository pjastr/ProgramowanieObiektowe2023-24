package example12;

public class Engine implements Cloneable{

    private String type;

    public Engine(String type) {
        this.type = type;
    }


    public String toString() {
        return "Engine: " + type;
    }


    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
}
