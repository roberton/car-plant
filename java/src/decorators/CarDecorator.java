package decorators;

public interface CarDecorator {
    public String name();
    public void accelerate(int kmsPerHour);
    public void turnLeft(int degrees);
    public void turnRight(int degrees);
}
