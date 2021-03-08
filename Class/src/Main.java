import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car toyota = new Car();
        cars.add(toyota);
        cars.add(new Car());
        for(int i=0; i < 100; i++){
            cars.add(new Car());

        }
        for(int i=0;i < cars.size(); i++){
            cars.get(i).setCurrentSpeed((int)(Math.random()*100 + 1));
            System.out.println(cars.get(i).getCurrentSpeed());


        }
    }
}
