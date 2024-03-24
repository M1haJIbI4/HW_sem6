public class Bus implements Vehicle {
    int maxSpeed;
    String type;

    public Bus(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.type = "Bus";
    }

    @Override
    public double calculateAllowedSpeed() {
        return this.getMaxSpeed() * 0.6; // Возвращаем разрешенную скорость для автобуса
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String getType() {
        return this.type;
    }
}