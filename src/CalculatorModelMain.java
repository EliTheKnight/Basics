public class CalculatorModelMain {
    public static void main(String[] args) {
        CalculatorModel calc = new CalculatorModel();

        System.out.println(calc.addition(3,3));
        System.out.println(calc.subtraction(3,3));
        System.out.println(calc.multiplication(3,3));
        System.out.println(calc.division(3,3));
        System.out.println(calc.exponents(3,3));

    }
}
