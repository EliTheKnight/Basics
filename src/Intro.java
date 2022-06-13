public class Intro {

    public static void main(String[] args) {
        System.out.println("hello world");
        int funNumbers = 1298312;
        boolean question = true;
        double pi = 3.14159;
        String word = "Eli";
        System.out.println(word);

        int firstNum = 5;
        int secondNum = 5;
        int sum = secondNum / firstNum * firstNum;
        secondNum = firstNum;
        System.out.println(sum);

        boolean x = true;
        // Comparisons: ==, !=, >, <, >=, <=
        // multiple conditions: && and      || or
        if ((firstNum <= secondNum) || (x == true)) {
            System.out.println(x);
        }
    }
}
