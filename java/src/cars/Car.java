package cars;

import drive.Drive;
import steering.Steering;

public class Car {
    private String _name = "";
    private Steering _steering;
    private Drive _drive;

    public Car(String name, Steering steering, Drive drive) {
        this._name = name;
        this._steering = steering;
        this._drive = drive;
    }

	public String name() {
        return _name;
    }

	public void accelerate(int kmsPerHour) {
        _drive.accelerate(kmsPerHour);
    }

	public void turnLeft(int degrees) {
        _steering.turnLeft(degrees);
	}

	public void turnRight(int degrees) {
        _steering.turnRight(degrees);
	}
}