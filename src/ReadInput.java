import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first name:");

        String firstName = input.nextLine();
        System.out.println(firstName);

        System.out.println("last name:");
        String lastName = input.nextLine();
        System.out.println(lastName);

        System.out.println("You see a bear running towards you. " + "\n"  + "You can approach it (1) or run away (2). \nWhat do you do? (1/2)");
        String choice = input.nextLine();

        if (choice.equals("1")){
            System.out.println("you die :(");
        }
        else{
            System.out.println("you escape :)");
        }

    }

}
