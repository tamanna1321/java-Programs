package package1;

import java.util.ArrayList;

public class car {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Thar");
        cars.add("GT Charger");
        cars.add("Rubicon");
        cars.add("BMW");
        System.out.println(cars.get(0));
        System.out.println(cars.size());
        for (String car : cars) {
            System.out.println(car);
        }
        cars.remove("GT Charger");
        cars.remove(0);
        System.out.println(cars);

    }

}
