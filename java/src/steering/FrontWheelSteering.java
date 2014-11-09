package steering;

import wheels.Wheel;
import wheels.WheelSet;

public class FrontWheelSteering implements Steering {
    private final Wheel frontLeft;
    private final Wheel frontRight;

    public FrontWheelSteering(WheelSet wheels) {
        this.frontLeft = wheels.frontLeft;
        this.frontRight = wheels.frontRight;
    }

    @Override
    public void turnLeft(int degrees) {
        frontLeft.turnLeft(degrees);
        frontRight.turnLeft(degrees);
    }

    @Override
    public void turnRight(int degrees) {
        frontLeft.turnRight(degrees);
        frontRight.turnRight(degrees);
    }
}
