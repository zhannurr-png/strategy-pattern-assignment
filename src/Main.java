public class Main {
    public static void main(String[] args){

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("Addition: " + calculator.calculate(15, 5));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction " + calculator.calculate(16, 4));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.calculate(20, 8));

        calculator.setStrategy(new DivideStrategy());
        System.out.println("Division: " + calculator.calculate(90, 10));
    }
}