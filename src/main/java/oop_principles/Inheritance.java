package oop_principles;

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car(160, false);
        Vehicle vehicle = new Vehicle(300);
        // Vehicle type can be an instance of both Vehicle or Car (or any other child class object)
        Vehicle carVehicle = new Car(210, true);

        // toString override in parent class is available in child also!
        System.out.println(vehicle);
        System.out.println(car); // originally printed only the max speed of car

        // overridden toString in Car also:
        System.out.println(car); // printed the max speed of car + if it is convertible

        car.showSpeed();
        car.showParentSpeed();
    }
}

/*** parent class ***/
class Vehicle {
    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "max speed: " + maxSpeed;
    }
}

/*** child class ***/
class Car extends Vehicle {
    private boolean convertible = false;
    private double maxSpeed = 34.5;

    public Car(int maxSpeed, boolean convertible) {
        super(maxSpeed);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    @Override
    public String toString() {
        return super.toString() + ", convertible: " + convertible;
    }

    // if maxSpeed is private in Vehicle this has an error. use getMaxSpeed
    // field hiding - bad practice
    // this function prints this maxSpeed (34.5)
    public void showSpeed() {
        System.out.println(maxSpeed);
    }
    // this function prints parents maxSpeed (set by constructor)
    public void showParentSpeed() {
        System.out.println(super.maxSpeed);
    }
}
