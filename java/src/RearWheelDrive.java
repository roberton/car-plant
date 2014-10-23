public class RearWheelDrive implements Drive {
    @Override
    public void accelerate(int kmsPerHour, Wheel frontLeft, Wheel frontRight, Wheel rearLeft, Wheel rearRight) {
        rearLeft.rotate(kmsPerHour);
        rearRight.rotate(kmsPerHour);
    }
}
