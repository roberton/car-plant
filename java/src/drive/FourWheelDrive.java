package drive;

import wheels.WheelSet;

public class FourWheelDrive implements Drive {
    private final WheelSet wheels;

    public FourWheelDrive(WheelSet wheels) {
        this.wheels = wheels;
    }

    @Override
    public void accelerate(int kmsPerHour) {
        wheels.frontLeft.rotate(kmsPerHour);
        wheels.frontRight.rotate(kmsPerHour);
        wheels.rearLeft.rotate(kmsPerHour);
        wheels.rearRight.rotate(kmsPerHour);
    }
}
