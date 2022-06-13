public class ForLoopQuestions {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }

//        int number = 12;
//
//        for (int i = 1; i<= number; i++){
//            if (number % i == 0){
//                System.out.println(i);
//            }
//        }

        int base = 5;
        int power = 3;
        int result = 1;

        for (int i = 0; i < power; i++){
            result = result * base;
        }

        System.out.println(result);




    }
}
