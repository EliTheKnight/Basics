public class Fibonacci {

    public static void main(String[] args) {

        int first = 1;
        int second = 1;
        int total = 0;

        for (int i = 0; i< 30; i++){
            total = first + second;
            System.out.println(total);
            first = second;
            second = total;
        }


        int evens = 0;
        int odds = 0;

        //for loop: loop 100 time if
        // the number's odd add it to odds,
        // if the number's even, add it to evens

        System.out.println(evens);
        System.out.println(odds);

    }

}
