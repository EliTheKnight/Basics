import javax.swing.*;

public class Basics {

    public static void main(String[] args) {

        System.out.println("Hi Henry");

        String name = "Eli";

        int integer = 7;

        System.out.println(integer);

        System.out.println(name + " " + integer);

        int number = 5;                 //4 bytes
        boolean question = false;       //1 bit
        double pi = 3.141592653589793;
        char letter = 'a';              //2 bytes

        // longs are 8 byte numbers | shorts are 2 byte numbers


        System.out.println(number + " " + question + " " + pi + " " + letter);
        System.out.println(pi + number);

        // 5 main math operators: + - * / %

        int secondNumber = number+2;
        System.out.println(secondNumber);

        secondNumber = number-2;
        System.out.println(secondNumber);

        secondNumber = number*2;
        System.out.println(secondNumber);

        secondNumber = number/2;
        System.out.println(secondNumber);

        secondNumber = number/6;
        System.out.println(secondNumber);

        secondNumber = number%2;
        System.out.println(secondNumber);


        secondNumber = (int)(number + pi);
        System.out.println(secondNumber);


        boolean condition = true;

        // comparing operator ==
        if (condition == true){
            System.out.println("the condition is true");
        }

        boolean conditionTwo = false;

        //compound conditions && and ||
        if (condition == true && conditionTwo == true){
            System.out.println("both conditions are true");
        }

        if (condition == true || conditionTwo == true){
            System.out.println("at least one condition is true");
        }


    }

}
