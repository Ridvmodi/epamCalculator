package com.ridhav.calculator;
import com.ridhav.calculator.calculator.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int operand1 = sc.nextInt();
        char opr = sc.next().charAt(0);
        int operand2 = sc.nextInt();
        float result = calculator.operate(opr,operand1,operand2);
        System.out.println(result);
    }
}
