public class Main {

    public static void main(String[] args) {
//        //create object of class student
        int x = 1;
        Student jacob = new Student(80, false);
//
//        //using methods in out object
        jacob.printGrade();
        jacob.printSmart();
//
//        int name = 5;
        int studentGrade = jacob.getGrade();
//        boolean studentIsSmart = jacob.getSmart();
//
//        Student dumberThanJacob = new Student(studentGrade/2, false);
//
//        dumberThanJacob.printGrade();

        Building hotel = new Building(400, true);
        Building shack = new Building(1, false);

        hotel.printWindows();
//        hotel.printStairs();
//        shack.printWindows();
//        shack.printStairs();
    }

}
