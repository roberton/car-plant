package drive;

import wheels.WheelSet;

public class FrontWheelDrive implements Drive {
    private final WheelSet wheels;

    public FrontWheelDrive(WheelSet wheels) {
        this.wheels = wheels;
    }

    @Override
    public void accelerate(int kmsPerHour) {
        wheels.frontLeft.rotate(kmsPerHour);
        wheels.frontRight.rotate(kmsPerHour);
    }
}
