import java.util.Scanner;

public class NumberGameMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("try to guess the number 1-100 in as few guesses as possible");
        System.out.println("guess a negative number to quit");
        System.out.println("start guessing");
        // goal to be a random number 1-100
        // Math.random() --> double [0,1) --> double [0, 100) --> int [0, 100) --> int [1,101)
        // Math.random() --> [0,1) --> [0,100) --> [1, 101)
        NumberGame game = new NumberGame((int)(Math.random() * 100)+1, 0);

        int guesses = 50000;

        while (guesses >= 0){
            guesses = input.nextInt();
            game.Guess(guesses);
        }

    }

}
