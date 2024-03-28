package calc.operations;

import calc.ComplexNumbers;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Multiplication implements Operations{
    private double newRe;
    private double newIm;
    private static final Logger log = Log.log(Multiplication.class.getName());
    @Override
    public ComplexNumbers operations(ComplexNumbers num1, ComplexNumbers num2) {
        newRe = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        newIm = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        log.log(Level.INFO, "Умножение выполнено");
        return new ComplexNumbers(newRe, newIm);
    }
}
