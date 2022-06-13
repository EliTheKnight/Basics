import java.util.Scanner;

public class ChooseYourOwnAdventure {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("First Name:");
        String userName = input.nextLine();
        System.out.println(userName);

        System.out.println("Last Name:");
        String lastName = input.nextLine();
        System.out.println(lastName);
        // \n is a line break in java
        System.out.println("You see a bear running towards you. \n You can approach it (1) or run away (2)." + "\n" + "What do you do? (1/2)");

        String choice = input.nextLine();

        if (choice.equals("1")) {
            System.out.println("the bear got closer \n you can stay where you are (1) or run away (2)");

            choice = input.nextLine();
            if (choice.equals("1")){
                System.out.println("the bear killed you :( \n do you go to heaven (1) or hell (2)");

                choice = input.nextLine();
                if (choice.equals("1")){
                    System.out.println("you are greedy and go to hell");
                }
                else {
                    System.out.println("you are humble and go to heaven to live happily in the afterlife");
                }

            }
            else {
                System.out.println("you ran away and hid in a tree \n a snake slithers down from the top of the tree but you hear the bear below you \n do you stay in the tree (1) or jump down (2)");

                choice = input.nextLine();

                if (choice.equals("1")){
                    System.out.println("the snake is friendly and you take it home with you as your new companion");
                }
                else {
                    System.out.println("the bear was not as friendly as the snake would have been :(");
                }
            }

        }
        else {
            System.out.println("you escaped the bear, \n now there's a fork in the road \n do you want to go left (1) or right (2)");
            choice = input.nextLine();
            if (choice.equals("1")){
                System.out.println("you went left \n you see a city in the distance but you know your homes behind you \n do you want to turn around (1) or keep going (2)");
                choice = input.nextLine();

                if (choice.equals("1")){
                    System.out.println("you reach the city and live a good life but forget how to get home and never see your family again");
                }
                else {
                    System.out.println("you return home but are saddened by your lack of an adventure");
                }
            }
            else {
                System.out.println("you went right \n you see your home \n do you want to continue home (1) or try to find something on your adventure (2)");
                choice = input.nextLine();

                if (choice.equals("1")){
                    System.out.println("you return home but are saddened by your lack of an adventure");

                }
                else{
                    System.out.println("you travel back into the forest but soon night falls. \n It grows cold and the sounds of the forest scare you \n you try to find your way back home but don't make it \n you die :(");

                }
            }
        }

    }

}
