package SOLID.Dependency;

public class DivOperation implements ICalculatorOperation{
    @Override
    public double calculate(double numA, double numB) {
        return numA / numB;
    }
}
