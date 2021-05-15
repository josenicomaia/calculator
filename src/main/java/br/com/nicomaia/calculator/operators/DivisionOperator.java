package br.com.nicomaia.calculator.operators;

public class DivisionOperator implements Operator {
    public int calculate(int leftOperand, int rightOperand) {
        return leftOperand / rightOperand;
    }
}
