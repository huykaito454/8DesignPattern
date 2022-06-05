package SOLID.Dependency;

public class AddOperation implements ICalculatorOperation{
    @Override
    public double calculate(double numA, double numB) {
        return numA + numB;
    }
}
