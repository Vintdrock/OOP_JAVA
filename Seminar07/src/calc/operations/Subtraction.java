package calc.operations;

import calc.ComplexNumbers;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Subtraction implements Operations {
    private double newRe;
    private double newIm;

    private static final Logger log = Log.log(Subtraction.class.getName());
    @Override
    public ComplexNumbers operations(ComplexNumbers num1, ComplexNumbers num2) {
        newRe = num1.getReal() - num2.getReal();
        newIm = num1.getImaginary() - num2.getImaginary();
        log.log(Level.INFO, "Вычитание выполнено");
        return new ComplexNumbers(newRe, newIm);
    }
}
