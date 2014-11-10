package cars;

import drive.Drive;
import steering.Steering;
import wheels.WheelSet;

public class CompositeCar implements Car {
    private String _name = "";
    private Steering _steering;
    private Drive _drive;

    public CompositeCar(String name, Steering steering, Drive drive) {
        this._name = name;
        this._steering = steering;
        this._drive = drive;
    }

	@Override
    public String name() {
        return _name;
    }

	@Override
    public void accelerate(int kmsPerHour) {
        _drive.accelerate(kmsPerHour);
    }

	@Override
    public void turnLeft(int degrees) {
        _steering.turnLeft(degrees);
	}

	@Override
    public void turnRight(int degrees) {
        _steering.turnRight(degrees);
	}

    @Override
    public WheelSet wheels() {
        return null;
    }
}