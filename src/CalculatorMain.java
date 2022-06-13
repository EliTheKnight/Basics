public class CalculatorMain {
    public static void main(String[] args) {
        //Calculator with methods to do
        // + - * / ^

        int x = 0;
        Calculator math = new Calculator(5.9, 7.1);
        System.out.println(math.addition());
        System.out.println(math.subtraction());
        System.out.println(math.multiplication());
        double quotient = math.division();
        System.out.println(quotient);
    }
}
