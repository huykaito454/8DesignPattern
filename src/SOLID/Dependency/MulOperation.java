package SOLID.Dependency;

public class MulOperation implements ICalculatorOperation{
    @Override
    public double calculate(double numA, double numB) {
        return numA * numB;
    }
}
