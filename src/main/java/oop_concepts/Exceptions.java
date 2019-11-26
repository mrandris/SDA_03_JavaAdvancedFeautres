package oop_concepts;

public class Exceptions {
    public static void main(String[] args) {
        /** multiple catches **/
        try {
            int[] array = new int[] {1, 4};
            int x = 0;
            int y = array[5]/x; // no array element with index 5 - out of bounds exception
            // x = 0, division by zero - arithmetic exception
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } finally {
            System.out.println("This will be printed out oll the time - exception occurred or not");
        }

        /** multiple exceptions as parameters in the same catch **/
        try {
            int[] array = new int[] {1, 4};
            int x = 0;
            int y = array[5]/x; // no array element with index 5 - out of bounds exception
            // x = 0, division by zero - arithmetic exception
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Arithmetic exception caught or ArrayIndexOutOfBoundsException caught - or both");
        } finally {
            System.out.println("This will be printed out oll the time - exception occurred or not");
        }

        /** custom exception handling **/
        Car car = new Car(180);
        try {
            car.increaseSpeed();
        } catch (CarCrashedException e) {
            e.printStackTrace();
        }
    }
}

/** custom exception class **/
class CarCrashedException extends Exception {
    public CarCrashedException(Car car) {
// calling Exception(String message) constructor
        super(("Car " + car + " has crashed"));
    }
}

class Car {
    private int speed;
    public Car(int speed) {
        this.speed = speed;
    }
    public void increaseSpeed() throws CarCrashedException {
        speed += 70;
        if(speed > 200)
            throw new CarCrashedException(this);
    }
}
