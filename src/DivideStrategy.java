public class DivideStrategy implements CalculationStrategy{
    @Override
    public double execute(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Can't divide by 0");
        }
        return (a / b);
    }
}
