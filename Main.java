
public class Main {
    public static int addOn(int[] array, int number) {
        int[] newarray = new int[array.length + 1];
        newarray[10] = number;


        return newarray[10];
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 100 + 1);
            array[i] = random;
            System.out.println(array[i]);
        }
        System.out.println(addOn(array, 12));
    }
}



