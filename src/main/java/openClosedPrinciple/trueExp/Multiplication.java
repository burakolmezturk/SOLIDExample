package main.java.openClosedPrinciple.trueExp;

public class Multiplication implements ICalculate {
    private double number1;
    private double number2;

    @Override
    public double calculate() {
        return this.number1 * this.number2;
    }
}
