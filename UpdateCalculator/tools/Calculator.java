package UpdateCalculator.tools;

public abstract class Calculator {

    private int firstNumber;

    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public abstract int add(int firstNumber, int secondNumber);

    public abstract int subtract(int firstNumber, int secondNumber);

    public abstract int multiply(int firstNumber, int secondNumber);

    public abstract int divide(int firstNumber, int secondNumber);
    
}
