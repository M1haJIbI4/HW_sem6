5) Переписать код в соответствии с Dependency Inversion Principle:
public class Car {
private PetrolEngine engine;
public Car(PetrolEngine engine) {
this.engine = engine;
}
public void start() {
this.engine.start();
}
}
public class PetrolEngine {
public void start() {
}
}
Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.

В этом коде зависимость между классами Car и PetrolEngine разорвана благодаря введению интерфейса Engine. 
Теперь класс Car может работать с любым типом двигателя, реализующим этот интерфейс, например, DieselEngine.