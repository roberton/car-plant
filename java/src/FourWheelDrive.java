public class FourWheelDrive implements Drive {
    @Override
    public void accelerate(int kmsPerHour, Wheel frontLeft, Wheel frontRight, Wheel rearLeft, Wheel rearRight) {
        frontLeft.rotate(kmsPerHour);
        frontRight.rotate(kmsPerHour);
        rearLeft.rotate(kmsPerHour);
        rearRight.rotate(kmsPerHour);
    }
}
