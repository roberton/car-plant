package decorators;

import cars.Car;


abstract public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }
}
