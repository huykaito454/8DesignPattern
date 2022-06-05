package SOLID.Dependency;

public class Calculator {
    public double calculate(double numA, double numB,
                            ICalculatorOperation operation){
        return operation.calculate(numA, numB);
    }
}
