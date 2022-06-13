public class NumberGame {

    private int goal, numGuesses;

    public NumberGame(int goal, int numGuesses){
        this.goal = goal;
        this.numGuesses = numGuesses;
    }

    public void Guess(int guess){
        if (guess > 100){
            System.out.println("guess numbers 1-100");
            return;
        }

        numGuesses++;
        if (guess < goal){
            System.out.println("higher");
        }
        else if (guess > goal){
            System.out.println("lower");
        }
        else{
            System.out.println("correct");
            System.out.println("You guessed the number in " + numGuesses + " guesses");
            //TODO: reset the number of guesses
            numGuesses = 0;
            //give instructions "can you guess this new number?"
            System.out.println("can you guess this new number?");
            //make a new random goal number
            goal = (int)(Math.random() * 100)+1;
        }
    }

}
