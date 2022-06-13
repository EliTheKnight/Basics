public class ForLoops {

    public static void main(String[] args) {

        for (int i = 0; i<10; i+=3){
            System.out.println("Henry");
        }

        for (int i =0; i<10; i++) {

        }

        for (int i = 0; i < 5; i ++){
            System.out.println("hello");
        }

        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++){
            if (i > 3){
                System.out.println("i is big");
            }
            else if (i < 3){
                System.out.println("i is small");
            }
        }

        int sum = 0;

        for (int i = 0; i < 5972; i++){
            sum += i; //sum = sum + i;
        }

        System.out.println(sum);

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < 10832391; i++){
            if (i%2 == 0){
                evenSum += i;
            }
            else {
                oddSum += i;
            }
        }

        System.out.println(evenSum);
        System.out.println(oddSum);

        for (int i = 100; i > 0; i--){
            System.out.println(i);
        }

    }

}
