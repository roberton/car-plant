package decorators;

import cars.Car;
import wheels.WheelSet;

public class FourWheelSteeringDecorator implements Car {
    final private Car car;

    public FourWheelSteeringDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String name() {
        return car.name();
    }

    @Override
    public void accelerate(int kmsPerHour) {
        car.accelerate(kmsPerHour);
    }

    @Override
    public void turnLeft(int degrees) {
        car.wheels().frontLeft.turnLeft(degrees);
        car.wheels().frontRight.turnLeft(degrees);
        car.wheels().rearLeft.turnLeft(degrees);
        car.wheels().rearRight.turnLeft(degrees);
    }

    @Override
    public void turnRight(int degrees) {
        car.wheels().frontLeft.turnRight(degrees);
        car.wheels().frontRight.turnRight(degrees);
        car.wheels().rearLeft.turnRight(degrees);
        car.wheels().rearRight.turnRight(degrees);
    }

    @Override
    public WheelSet wheels() {
        return car.wheels();
    }
}
