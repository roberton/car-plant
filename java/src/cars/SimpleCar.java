package cars;

import wheels.WheelSet;

public class SimpleCar implements Car {
    private String name = "";
    private WheelSet wheels;

    public SimpleCar(String name, WheelSet wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String name() {
        return name;
    }

    public void accelerate(int kmsPerHour) {
        wheels.frontLeft.rotate(kmsPerHour);
        wheels.frontRight.rotate(kmsPerHour);
    }

    public void turnLeft(int degrees) {
        wheels.frontLeft.turnLeft(degrees);
        wheels.frontRight.turnLeft(degrees);
    }

    public void turnRight(int degrees) {
        wheels.frontLeft.turnRight(degrees);
        wheels.frontRight.turnRight(degrees);
    }

    public WheelSet wheels() {
        return wheels;
    }
}
