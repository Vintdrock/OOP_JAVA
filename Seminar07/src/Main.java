import calc.Viewer;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Запуск калькулятора выполнен");
        Viewer view = new Viewer();
        view.run();
    }

}