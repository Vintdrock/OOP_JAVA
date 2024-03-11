package calculator;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String... args) {  //[] и ... одно и тоже, когда не знаем сколько аргументов
        Calculator calc = new Calculator();
        System.out.println(calc.calculate("*", 4,7));

        Foo foo = new Foo() {
            @Override
            public double plus(int a, int b) {
                return 0;
            }

            @Override
            public double minus(int a, int b) {
                return 0;
            }
        };


    }
}
class Calculator {
    Map<String, Calculable> map = new HashMap<>();

    public Calculator() {
        fill();
    }

    private void fill(){
        map.put("+", new Addition());
        map.put("-",(arg) ->  (arg[0] - arg[1]));
        map.put("*",(arg) ->  (arg[0] * arg[1]));

        Calculable calculable = args -> args[0] / args[1];

        //Лямбда пример
//        Calculable calculable = (operation, arg) ->  map.get(operation).calculate(operation, b[0], b[1]);

//        Calculable calculable = new Calculable() {
//            @Override
//            public double calculate(String operation, double... args) {
//                return 0;
//            }
//        };
    }

    public double add(int a, int b){
        return a + b;
    }
    public double substract(int a, int b){
        return a - b;
    }
    public double multi(int a, int b){
        return a * b;
    }
    public double calculate(String operator, int a, int b){
//        if (operator.equals("+")){
//            return add(a,b);
//        } else if (operator.equals("-")){
//            return substract(a,b);
//        } else if (operator.equals("*")) {
//            return multi(a,b);
//        } else throw new RuntimeException("Операция не поддерживается ");
        return map.get(operator).calculate(a,b);
    }
}

class Addition implements Calculable{

    @Override
    public double calculate(double... args) {
        if (args.length < 2){
            throw new RuntimeException("Мало аргументов ");
        }
        return args[0] + args[1];
    }
}
interface Calculable{
    double calculate(double ... args);
}

interface Foo{
    double plus(int a, int b);
    double minus(int a, int b);
}