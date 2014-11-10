package cars;


import wheels.WheelSet;

public interface Car {
    String name();

    void accelerate(int kmsPerHour);

    void turnLeft(int degrees);

    void turnRight(int degrees);

    WheelSet wheels();
}
