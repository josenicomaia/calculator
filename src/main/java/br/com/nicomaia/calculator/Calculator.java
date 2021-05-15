package br.com.nicomaia.calculator;

import br.com.nicomaia.calculator.operators.Operator;

import java.util.Map;
import java.util.NoSuchElementException;

public class Calculator {
    private final Map<Character, Operator> availableOperatorsMap;

    public Calculator(Map<Character, Operator> operatorsMap) {
        this.availableOperatorsMap = operatorsMap;
    }

    public int calculate(int leftOperand, Character charOperator, int rightOperand) {
        var operator = availableOperatorsMap.get(charOperator);

        if (operator == null) {
            throw new NoSuchElementException("Operator not available");
        }

        return operator.calculate(leftOperand, rightOperand);
    }
}
