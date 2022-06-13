public class IfStatementDemo {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 10;

        if (a < b){
            System.out.println("a is less than b");
        }
        else if (a > b){
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is equal to b");
        }

        // how to make boolean expressions...
        // numerical comparisons: < > == != <= >=
        // String comparisons:  string1.equals("")
        // Common error: = vs ==, assignment vs comparison


        // % is modulo which is the remainder after division
        // any number modulo 2 is even if 0, odd if 1
        if (c % 2 == 0){
            System.out.println("c is even");
        }
        else   {
            System.out.println("c is odd");
        }

        if (a < 10){
            if (a % 2 == 0){
                System.out.println("you did it");
            }
        }

        // combining boolean expressions: && and, || or
        if (a< 10 && a % 2== 0){
            System.out.println("you did it");
        }
        if (a< 10 || a % 2== 0){
            System.out.println("you did it");
        }


    }
}
