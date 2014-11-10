package cars;

import decorators.FourWheelDriveDecorator;
import decorators.FourWheelSteeringDecorator;
import decorators.RearWheelDriveDecorator;
import wheels.WheelSet;

public class CarPlant {
	public static String LOG;

	public static Car makeToyotaCorolla() {
        WheelSet wheels = new WheelSet();
        return new SimpleCar("Toyota Corolla", wheels);
	}

	public static Car makeToyotaCorollaSports() {
        WheelSet wheels = new WheelSet();
        return new RearWheelDriveDecorator(new SimpleCar("Toyota Corolla sports", wheels));
	}

	public static Car makeMitsubishiTriton() {
        WheelSet wheels = new WheelSet();
		return new FourWheelDriveDecorator(new SimpleCar("Mitsubishi Triton", wheels));
	}

	public static Car makeSandBuggy() {
        WheelSet wheels = new WheelSet();
        return new FourWheelSteeringDecorator(new FourWheelDriveDecorator(new SimpleCar("Sand Buggy", wheels)));
	}

	public static Car makeSandBuggyLite() {
        WheelSet wheels = new WheelSet();
		return new RearWheelDriveDecorator(new FourWheelSteeringDecorator(new SimpleCar("Sand Buggy Lite", wheels)));
	}
}
