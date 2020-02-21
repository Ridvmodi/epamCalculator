package com.ridhav.calculator.calculator;
import com.ridhav.calculator.operations.Operations;

public class Calculator {
    private Operations operation;
    public Calculator(){
        operation = new Operations();
    }
    public float operate(char operator,int a,int b){
        switch (operator){
            case '+':
                return this.operation.add(a,b);
            case '-':
                return this.operation.sub(a,b);
            case '*':
                return this.operation.mul(a,b);
            case '/':
                return this.operation.divide(a,b);
        }
        System.out.println("Operator not found");
        return -1;
    }
}
