package Parking;

import java.util.List;

public class Parking {
    int id;
    int capacity;

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public Parking(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public long freePlaceCalculator(List<Car> cars) {
        long occupiedParking = cars.stream()
                .filter(car -> car.parkingId == id)
                .limit(capacity)
                .count();
        return capacity - occupiedParking;
    }

    public double bestParkingPercentage(List<Car> cars) {
        return ((double) freePlaceCalculator(cars) / capacity) * 100;
    }

}
