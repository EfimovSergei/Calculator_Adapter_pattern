package org.example;


import java.util.function.IntToDoubleFunction;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {

        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.SUM);
        return formula.result.intValue();

    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.MULT);
        return formula.result.intValue();
    }

    @Override
    public int pow(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.POW);
        return formula.result.intValue();
    }
}

