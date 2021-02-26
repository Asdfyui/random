import java.util.Arrays;

public class Main1 {
    public static int[] addin(int[] array, int number, int number1) {
        int[] newarray = new int[array.length];
        newarray[number1] = number;
        for (int i = 0; i < array.length; i++){
            newarray[i] = array[i];
            if (newarray[number1] == number){
                newarray = new int[array.length + 1];

            }
        }
        newarray[number1] = number;

        return newarray;
    }

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
            System.out.println(array[i]);
        }

        System.out.println("****");
        System.out.println(Arrays.toString(addin(array, 1222, 2)));
    }
}
