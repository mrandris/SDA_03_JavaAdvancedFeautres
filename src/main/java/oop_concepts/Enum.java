package oop_concepts;

public class Enum {
    public static void main(String[] args) {
        System.out.println(LengthEnum.FOOT.convertToMeters());

        LengthEnum centimeterUnit = LengthEnum.CENTIMETER;
        switch (centimeterUnit) {
            case FOOT:
                System.out.println("Foot unit is selected");
                break;
            case METER:
                System.out.println("Meter unit is selected");
                break;
            case INCH:
                System.out.println("Inch unit is selected");
                break;
            case CENTIMETER:
                System.out.println("Centimeter unit is selected");
                break;
        }

        System.out.println(centimeterUnit.ordinal()); // prints the position of the enum constant from the constant list

        for(Planets planet: Planets.values()) {
            System.out.println(planet);
        }

    }
}

enum LengthEnum {
    METER(1), // ordinal = 0
    CENTIMETER(0.01), // ordinal = 1
    FOOT(0.3),
    INCH(0.025);

    double value;

    LengthEnum(double valueComparedToMeters) {
        this.value = valueComparedToMeters;
    }

    double convertToMeters() {
        return value;
    }
}

enum Planets {
    MERCURY("first from the Sun"),
    VENUS("second from the Sun"),
    EARTH("third from the Sun"),
    MARS("fourth from the Sun"),
    JUPITER("fifth from the Sun"),
    SATURN("sixth from the Sun"),
    URANUS("seventh from the Sun"),
    NEPTUNE("eight from the Sun"),
    PLUTO("ninth from the Sun");

    String position;

    Planets(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + position;
    }
}
