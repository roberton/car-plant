package steering;

import wheels.Wheel;
import wheels.WheelSet;

public class FourWheelSteering implements Steering {
    private final Wheel frontLeft;
    private final Wheel frontRight;
    private final Wheel rearLeft;
    private final Wheel rearRight;

    public FourWheelSteering(WheelSet wheels) {
        this.frontLeft = wheels.frontLeft;
        this.frontRight = wheels.frontRight;
        this.rearLeft = wheels.rearLeft;
        this.rearRight = wheels.rearRight;
    }

    @Override
    public void turnLeft(int degrees) {
        frontLeft.turnLeft(degrees);
        frontRight.turnLeft(degrees);
        rearLeft.turnLeft(degrees);
        rearRight.turnLeft(degrees);
    }

    @Override
    public void turnRight(int degrees) {
        frontLeft.turnRight(degrees);
        frontRight.turnRight(degrees);
        rearLeft.turnRight(degrees);
        rearRight.turnRight(degrees);
    }
}
