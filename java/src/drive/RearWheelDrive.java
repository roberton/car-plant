package drive;

import wheels.WheelSet;

public class RearWheelDrive implements Drive {
    private final WheelSet wheels;

    public RearWheelDrive(WheelSet wheels) {
        this.wheels = wheels;
    }

    @Override
    public void accelerate(int kmsPerHour) {
        wheels.rearLeft.rotate(kmsPerHour);
        wheels.rearRight.rotate(kmsPerHour);
    }
}
