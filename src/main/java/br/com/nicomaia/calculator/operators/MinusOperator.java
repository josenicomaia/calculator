package br.com.nicomaia.calculator.operators;

public class MinusOperator implements Operator {
    public int calculate(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }
}
