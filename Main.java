import java.util.Arrays;

public class Main1 {
    public static int[] remove(int[] array) {
        int[] newarray = new int[array.length - 1 ];
        for (int i = 0; i < array.length; i++){
            newarray[i] = array[i];
        }
        return newarray;
    }

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
            System.out.println(array[i]);
        }
        System.out.println("****");
        System.out.println(Arrays.toString(remove(array)));
    }
}

