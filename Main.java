import java.util.Arrays;

public class Main {
    public static int[] addOn(int[] array, int number) {
        int[] newarray = new int[array.length + 1];
        newarray[0] = array[0];
        newarray[1] = array[1];
        newarray[2] = number;
        return newarray;
    }

    public static void main(String[] args) {
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
        }
        System.out.println(Arrays.toString(addOn(array, 656)));
    }
}



