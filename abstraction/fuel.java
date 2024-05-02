package abstraction;

interface moveable {
    void move();
}

interface speedable {
    void speed(int speeding);
}

class Vehicle implements moveable, speedable {
    public void move() {
        System.out.println("Moving the vehicle");
    }

    public void speed(int speeding) {
        System.out.println("speeding the vehicle");
    }
}

public class fuel {
    public static void main(String[] args) {
        Vehicle aa = new Vehicle();
        aa.move();
        aa.speed(5);

    }
}