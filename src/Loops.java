public class Loops {

    public static void main(String[] args) {

        boolean question = true;
        int a = 0;

        while (question == true){
            System.out.println("hello");
            a++; // i = i + 1;

            if (a>5){
                question = false;
            }
        }

        for (int i = 0; i < 5; i++){
            // check: i < 5
            // runs code
            // increments i

            System.out.println("hi");
        }


        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // factorial: 2! = 2*1
        // 4! = 4*3*2*1

        int factorialNumber = 7;
        int total = 1;
        for (int i = 1; i <= factorialNumber; i ++){
            total = total * i;
        }

        System.out.println(total);
    }

}
