package Parking;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
     List<Parking> parkings = new ArrayList<>();
     parkings.add(new Parking(1,1000));
     parkings.add(new Parking(2,100));
     parkings.add(new Parking(3,200));
     parkings.add(new Parking(4,500));
     List<Car> cars = new ArrayList<>();
     for (int i=0; i<500; i++) {
        Car car1 =new Car(1);
        cars.add(car1);
     }
     for (int i=0; i<20; i++) {
        Car car2 =new Car(2);
        cars.add(car2);
     }
     for (int i=0; i<40; i++) {
        Car car3 =new Car(3);
        cars.add(car3);
     }
     for (int i=0; i<250; i++) {
        Car car4 =new Car(4);
        cars.add(car4);
     }
        System.out.println(findBestDriftParkingId(parkings, cars));
    }


    public static int findBestDriftParkingId(List<Parking> parkings, List<Car> cars) {
        Comparator<Parking> comparator = Comparator
                .comparingDouble((Parking x) -> x.bestParkingPercentage(cars)).thenComparingInt(Parking::getCapacity);
        return parkings.stream()
                .max(comparator)
                .map(Parking::getId)
                .orElse(0);
    }

}