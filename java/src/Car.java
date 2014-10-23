class Car {

	public Wheel _frontLeft;
	public Wheel _frontRight;
	public Wheel _rearLeft;
	public Wheel _rearRight;
    private String name;

    Drive drive;

	public String name() {
        return name;
    }

    public void accelerate(int kph) {
        drive.accelerate(kph, _frontLeft, _frontRight, _rearLeft, _rearRight);
    }

	protected Car(String name, Drive drive) {
        this.name = name;
        _frontLeft = new Wheel("front left");
		_frontRight = new Wheel("front right");
		_rearLeft = new Wheel("rear left");
		_rearRight = new Wheel("rear right");
        this.drive = drive;
  	}

	public void turnLeft(int degrees) {
		_frontLeft.turnLeft(degrees);
		_frontRight.turnLeft(degrees);
	}

	public void turnRight(int degrees) {
		_frontLeft.turnRight(degrees);
		_frontRight.turnRight(degrees);
	}
}