public class TestBicycle {

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        System.out.println(b1.getGear());
        b1.setGear(4);
        System.out.println(b1.getGear());
        Bicycle b2 = null;
        if (b2 != null)
        {
            b2.setGear(6);
        }

    }
}


class Bicycle {
    private int gear;

    public void setGear(int gear) {
        this.gear = gear;  // 'this' jest potrzebne, aby rozróżnić parametr od pola klasy
    }

    public int getGear() {
        return this.gear;  // 'this' można pominąć, ponieważ nie ma konfliktu nazw
    }
}