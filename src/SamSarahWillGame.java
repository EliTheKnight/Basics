import java.util.Scanner;

public class SamSarahWillGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First Name:");
        String firstName = input.nextLine();
        System.out.println(firstName);

        System.out.println("Last Name: ");
        String lastName = input.nextLine();
        System.out.println(lastName);

        System.out.println("You see a bear running towards you. " + "\n"  + "You can approach it (1) or run away (2). \nWhat do you do? (1/2)");
        String choice = input.nextLine();

        if (choice.equals("1")){
            choice = input.nextLine();
        }
        else {

        }



    }
}
