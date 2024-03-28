package calc.operations;

import calc.ComplexNumbers;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Summ implements Operations {
    private double newRe;
    private double newIm;

    private static final Logger log = Log.log(Summ.class.getName());

    @Override
    public ComplexNumbers operations(ComplexNumbers num1, ComplexNumbers num2) {
        newRe = num1.getReal() + num2.getReal();
        newIm = num1.getImaginary() + num2.getImaginary();
        log.log(Level.INFO, "Сложение выполнено");
        return new ComplexNumbers(newRe, newIm);
    }
}
