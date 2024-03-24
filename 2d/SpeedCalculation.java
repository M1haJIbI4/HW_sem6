// Обновим класс SpeedCalculation для использования новых классов Car и Bus
public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed(); // Возвращаем разрешенную скорость для любого типа транспортного средства
    }
}