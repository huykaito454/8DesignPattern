package Prototype;

public class Car {
    private String nameCar;
    private int numWheels;
    private int numSeat;
    private String color;
    public Car(String nameCar, int numWheels, int numSeat, String color) {
        this.nameCar = nameCar;
        this.numWheels = numWheels;
        this.numSeat = numSeat;
        this.color = color;
    }
    public Car(Car car){
        this.nameCar = car.nameCar;
        this.numWheels = car.numWheels;
        this.numSeat = car.numSeat;
        this.color = car.color;
    }
    @Override
    public String toString() {
        return "Car (" + " Name : " + nameCar + " - Number Wheels : "
                + numWheels + " - Number Seat : " + numSeat + " - Color : "
                + color + " }";
    }
    public void setColor(String color) {
        this.color = color;
    }

}

