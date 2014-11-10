package decorators;

import cars.Car;
import cars.SimpleCar;
import wheels.WheelSet;

public class FourWheelDriveDecorator implements Car {
    private final SimpleCar car;

    public FourWheelDriveDecorator(SimpleCar car) {
        this.car = car;
    }

    @Override
    public String name() {
        return this.car.name();
    }

    @Override
    public void accelerate(int kmsPerHour) {
        this.car.wheels.frontLeft.rotate(kmsPerHour);
        this.car.wheels.frontRight.rotate(kmsPerHour);
        this.car.wheels.rearLeft.rotate(kmsPerHour);
        this.car.wheels.rearRight.rotate(kmsPerHour);
    }

    @Override
    public void turnLeft(int degrees) {
        this.car.turnLeft(degrees);
    }

    @Override
    public void turnRight(int degrees) {
        this.car.turnRight(degrees);
    }

    @Override
    public WheelSet wheels() {
        return car.wheels();
    }
}
