public class Main3 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int sum;
        sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            int random = (int)(Math.random()*100 + 1);
            numbers[i] = random;

            int swap = numbers[2];
            int swapp = numbers[3];
            numbers[2]= swapp;
            numbers[3]= swap;
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }


        System.out.println("The average value is " + sum/10 );
    }
}
