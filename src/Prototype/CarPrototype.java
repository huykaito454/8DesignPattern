package Prototype;

public class CarPrototype implements IClone<Car> {
    Car car;

    public CarPrototype(Car car) {
        this.car = car;
    }

    @Override
    public Car clone() {
        return new Car(this.car);
    }
}
