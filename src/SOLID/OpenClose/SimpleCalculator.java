package SOLID.OpenClose;

import java.security.InvalidParameterException;

public class SimpleCalculator implements ICalculator{
    @Override
    public void calculate(IOperation operation) {
        if(operation == null) {
            throw new InvalidParameterException("Error");
        }
        operation.performOperation();
    }
}
