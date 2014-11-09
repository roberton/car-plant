package wheels;

public class WheelSet {
    final public Wheel frontLeft;
    final public Wheel frontRight;
    final public Wheel rearLeft;
    final public Wheel rearRight;

    public WheelSet() {
        frontLeft = new Wheel("front left");
        frontRight = new Wheel("front right");
        rearLeft = new Wheel("rear left");
        rearRight = new Wheel("rear right");
    }
}
