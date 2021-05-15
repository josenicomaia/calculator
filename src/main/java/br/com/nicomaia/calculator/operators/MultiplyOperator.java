package br.com.nicomaia.calculator.operators;

public class MultiplyOperator implements Operator {
    public int calculate(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }
}
