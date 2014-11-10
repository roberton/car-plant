package cars;


import wheels.WheelSet;

public interface Car {
    String name();

    void accelerate(int kmsPerHour);

    void turnLeft(int degrees);

    void turnRight(int degrees);

    // TODO: would be nice to get rid of this as it is only here for the decorators, not the clients
    WheelSet wheels();
}
