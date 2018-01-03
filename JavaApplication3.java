package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {

    public final static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Print.format();
        Print.enterFirstCoef();
        int a = input.nextInt();
        Print.enterSecondCoef();
        int b = input.nextInt();
        Print.enterFreeCoef();
        int c = input.nextInt();
        Print.yourEquation(Convert.delete(a), Convert.toString(b), Convert.toString(c));
        Equation equation = new Equation(a, b, c);
        if(equation.count_result == 0) Print.result();
        if(equation.count_result == 1) Print.result(equation.result_1);
        if(equation.count_result == 2) Print.result(equation.result_1, equation.result_2);
    }

}
