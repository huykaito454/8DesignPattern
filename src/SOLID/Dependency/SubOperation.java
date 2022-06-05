package SOLID.Dependency;

public class SubOperation implements ICalculatorOperation{
    @Override
    public double calculate(double numA, double numB) {
        return numA - numB;
    }
}
