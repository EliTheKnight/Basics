public class Calculator {

    //TODO: Make 2 double variables
    private double a, b;
    //TODO: Make a constructor
    // the parameters to be 2 double

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    //TODO: Make methods for each operation
    // return type double
    // addition
    public double addition(){
//        double c = a + b;
//        return c;
        return a + b;
    }
    // subtraction
    public double subtraction(){
        return a-b;
    }
    // multiplication
    public double multiplication(){
        return a*b;
    }
    // division
    public double division(){
        return a/b;
    }
    //for (int i = 0; i<10; i++){}
    // for (making a variable; condition; increment)
}
