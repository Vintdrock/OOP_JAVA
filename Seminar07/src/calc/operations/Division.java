package calc.operations;

import calc.ComplexNumbers;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Division implements Operations{
    private double newRe;
    private double newIm;
    private static final Logger log = Log.log(Division.class.getName());
    @Override
    public ComplexNumbers operations(ComplexNumbers num1, ComplexNumbers num2) {

        ComplexNumbers tempNum = new ComplexNumbers(num2.getReal(), -num2.getImaginary());

        Multiplication disk = new Multiplication();
        ComplexNumbers denominator = new ComplexNumbers(disk.operations(num2,tempNum).getReal(),disk.operations(num2,tempNum).getImaginary());
        ComplexNumbers numerator = new ComplexNumbers(disk.operations(num1,tempNum).getReal(), disk.operations(num1,tempNum).getImaginary());

        newRe = numerator.getReal() / denominator.getReal();
        newIm = numerator.getImaginary() / denominator.getReal();
        log.log(Level.INFO, "Деление выполнено");
        return new ComplexNumbers(newRe, newIm);
    }
}
