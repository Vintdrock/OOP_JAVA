package calc;

import calc.ComplexNumbers;
import calc.operations.Division;
import calc.operations.Multiplication;
import calc.operations.Subtraction;
import calc.operations.Summ;

import java.util.Scanner;

public class Viewer {
    Scanner scan = new Scanner(System.in);
    public void run(){

        System.out.println("Введите действительную часть 1-го числа: ");
        double re1 = scan.nextDouble();
        System.out.println("Введите мнимую часть 1-го числа: ");
        double im1 = scan.nextDouble();
        ComplexNumbers num1 = new ComplexNumbers(re1, im1);
        System.out.println("Введите действительную часть 2-го числа: ");
        double re2 = scan.nextDouble();
        System.out.println("Введите мнимую часть 2-го числа: ");
        double im2 = scan.nextDouble();
        ComplexNumbers num2 = new ComplexNumbers(re2, im2);
        System.out.println(num1);
        System.out.println(num2);

        int command = prompt("Введите операцию: \n1. Cложение \n2. Вычитание \n3. Умножение \n4. Деление \n");

        switch (command){
            case 1:
                Summ sum = new Summ();
                System.out.println(sum.operations(num1,num2));
                break;
            case 2:
                Subtraction sub = new Subtraction();
                System.out.println(sub.operations(num1,num2));
                break;
            case 3:
                Multiplication mul = new Multiplication();
                System.out.println(mul.operations(num1,num2));
                break;
            case 4:
                Division div = new Division();
                System.out.println(div.operations(num1,num2));
                break;
            default:
                System.out.println("Команда не поддерживается");
        }


    }
    private int prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }
}
