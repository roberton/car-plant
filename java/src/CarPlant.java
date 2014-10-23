public class CarPlant {
	public static String LOG;

	public static Car makeToyotaCorolla() {
		return new Car("Toyota Corolla", new FrontWheelDrive()) {
        };
	}

	public static Car makeToyotaCorollaSports() {
		return new Car("Toyota Corolla sports", new RearWheelDrive() );
	}

    public static Car makeMitsubishiTriton() {
		return new Car("Mitsubishi Triton", new FourWheelDrive());
	}

	public static Car makeSandBuggy() {
		return new Car("Sand Buggy", new FourWheelDrive());
	}

	public static Car makeSandBuggyLite() {
		return new Car("Sand Buggy Lite", new RearWheelDrive());
	}
}
