// Переопределим классы Car и Bus для соответствия принципу OCP
public class Car implements Vehicle {
    int maxSpeed;
    String type;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.type = "Car";
    }

    @Override
    public double calculateAllowedSpeed() {
        return this.getMaxSpeed() * 0.8; // Возвращаем разрешенную скорость для автомобиля
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