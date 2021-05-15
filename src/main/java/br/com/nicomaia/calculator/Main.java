package br.com.nicomaia.calculator;

import br.com.nicomaia.calculator.operators.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var operatorsMap = new HashMap<Character, Operator>() {{
            put('+', new SumOperator());
            put('-', new MinusOperator());
            put('*', new MultiplyOperator());
            put('/', new DivisionOperator());
        }};

        var calculator = new Calculator(operatorsMap);
        System.out.println(calculator.calculate(1, '+', 2));
    }
}
