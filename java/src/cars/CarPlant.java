package cars;

import drive.FourWheelDrive;
import drive.FrontWheelDrive;
import drive.RearWheelDrive;
import steering.FourWheelSteering;
import steering.FrontWheelSteering;
import wheels.WheelSet;

public class CarPlant {
	public static String LOG;

	public static Car makeToyotaCorolla() {
        WheelSet wheels = new WheelSet();
        return new Car("Toyota Corolla", new FrontWheelSteering(wheels), new FrontWheelDrive(wheels));
	}

	public static Car makeToyotaCorollaSports() {
        WheelSet wheels = new WheelSet();
        return new Car("Toyota Corolla sports", new FrontWheelSteering(wheels), new RearWheelDrive(wheels));
	}

	public static Car makeMitsubishiTriton() {
        WheelSet wheels = new WheelSet();
		return new Car("Mitsubishi Triton", new FrontWheelSteering(wheels), new FourWheelDrive(wheels));
	}

	public static Car makeSandBuggy() {
        WheelSet wheels = new WheelSet();
        return new Car("Sand Buggy", new FourWheelSteering(wheels), new FourWheelDrive(wheels));
	}

	public static Car makeSandBuggyLite() {
        WheelSet wheels = new WheelSet();
		return new Car("Sand Buggy Lite", new FourWheelSteering(wheels), new RearWheelDrive(wheels));
	}
}
